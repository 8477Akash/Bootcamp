package Module_1;

public class Q1 {
    static String FirstName  = "Akash";
    static  String lastName  = "Kumar";
    public static int age = 23;

    static
    {
        System.out.println("Static Block " + FirstName);
    }
    public static void Display(){
        System.out.println("Static Method " + lastName);
    }
}