package Beyond_Java_8_1.Q5;

class A{
    void Repeat(String str){
        System.out.println("repeat() : " + str.repeat(3));
    }
    void Strip(String s){
        System.out.println("Using strip() : |" + s.strip() + "|");
    }
    void trim(String s){
        System.out.println("Using trim()  : |" + s.trim() + "|");
    }
    void IsBlank(String s){
        System.out.println("Using isBlank() : " + s.isBlank() );
    }
    void Indent(String s,int n){
        System.out.println("Using indent() : "+s.indent(n));
    }
    void TransForm(String s){
        s = s.transform(string -> new StringBuilder(string)
                .reverse().toString());
        System.out.println("Using transForm() : "+s);
    }
    void StripIndent(String s){
        System.out.println("Using stripIndent() : " + s.stripIndent());
    }
    void TranslateEscape(String s){
        System.out.println("Using translateEscape() : "+s.translateEscapes());
    }
    void TripleQuotes(){
      String json = """
              {
              name:Akash Kumar,
              Age: 23
              }
              """;

      System.out.println(json);
    }

    void Formatter(String s){

        System.out.println("Using Formatter() : "+s.formatted("12"));
    }

}
public class Q5 {
    public static void main(String[] args) {
        A obj = new A();
        obj.Repeat("hello  ");
        System.out.println("\n");
        obj.Strip("\u2002Hello\u2002");
        System.out.println("\n");
        obj.trim("\u2002Hello\u2002");
        System.out.println("\n");
        obj.IsBlank("");
        System.out.println("\n");
        obj.Indent("Hello World", 15);
        System.out.println("\n");
        obj.TransForm("Hello World");
        System.out.println("\n");
        obj.StripIndent("""
                      Line 1
                      Line 2
                      Line 3
                      ;
              """);
        System.out.println("\n");
        obj.TranslateEscape("\"Hello\\nWorld\"");
        System.out.println("\n");
        obj.TripleQuotes();
        System.out.println("\n");
        obj.Formatter("Java %s");

    }
}
