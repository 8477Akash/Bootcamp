package Java_8_1.Q2;

@FunctionalInterface
interface Operator{
    int apply(int a,int b);
}

class Calculator {
  public int add(int a,int b){
      return a+b;
  }
  public int sub(int a,int b){
      return a-b;
  }
  public static int mul(int a,int b){
      return a*b;
  }
}
public class Q2 {
    public static void MethodReference() {
        Calculator c = new Calculator();
        Operator add = c ::add;
        Operator sub = c ::sub;

        System.out.println("\n\n");
        System.out.println("Instance Method Reference");

        System.out.println("On Adding : " + add.apply(10,5));
        System.out.println("On Subtract : " + sub.apply(10,5));

        System.out.println("\n\n");

        System.out.println("Static Method Reference");
        Operator mul = Calculator::mul;

        System.out.println("On Multiplication : " + mul.apply(10,5));

    }
}
