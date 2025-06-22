package Module_1;
import java.util.Scanner;
public class Q3 {
    public static void Display(){
        System.out.println("\t".repeat(4)+"********Menu********");
        System.out.println("\t".repeat(5)+"1. Calculate Area of a Circle.");
        System.out.println("\t".repeat(5)+"2. Calculate Circumference of a Circle.");
        System.out.println("\t".repeat(5)+"3. Exit.");
        System.out.println("\t".repeat(5)+"Choose option (1-3)");

    }
    public static float INPUT() {
        Scanner input = new Scanner(System.in);
        float radius = 0;
        System.out.println("\nEnter the radius of a Circle :  ");
        radius = input.nextInt();

        return radius;
    }

    public static float Area() {
        float radius = INPUT();
        return (float) (Math.PI * radius * radius);
    }

    public static float Circumference() {
        float radius = INPUT();
        return (float) (2 * Math.PI * radius);
    }
    public static void Menu() {
          Display();
          Scanner input = new Scanner(System.in);
          int choice = 0;

          choice = input.nextInt();


          switch(choice){
              case 1:{

                  float area = Area();
                  System.out.println("Area of circle is " + area);
                  break;
              }
              case 2:{
                  float circumference = Circumference();
                  System.out.println("Circumference of circle is " + circumference);
                  break;
              }
              case 3:{
                  break;
              }
              default:{
                  System.out.println("Invalid choice");
              }
          }

          input.close();
    }
}