package Module_1;
import java.util.Scanner;

public class Q7 {
    public static void ErrorHandlingDemo(){
  Scanner input = new Scanner(System.in);
  int []arr = new int[3];
  String temp ;
  int idx;
  int val ;
        try{

            System.out.print("Enter an index to be accessed: ");
             idx = input.nextInt();

             System.out.println(arr[idx]);
             System.out.print("Enter a name : ");
             temp = input.nextLine();
             System.out.println(temp);
             System.out.println("Enter a value to divide 10 ");
             val = input.nextInt();
             System.out.println(100/val);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( e.getMessage());
        }
        catch (NullPointerException | ArithmeticException e) {
        System.out.println( e.getClass().getSimpleName() + " - " + e.getMessage());

        } finally {
        System.out.println("Finally block executed.");
    }

        System.out.println("After Try - Catch Block");
    }
}