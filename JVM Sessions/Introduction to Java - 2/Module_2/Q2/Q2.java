package Module_2.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User{
    String firstName;
    String lastName;
    int age;
    String PhoneNumber;

    User(String firstName, String lastName, int age, String PhoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.PhoneNumber = PhoneNumber;
    }
    @Override
    public String toString(){
        return "First Name: "+ firstName+" \n"+
                "Last Name: "+lastName+" \n"+
                "Age : "+age+" \n"+
                "Phone Number: "+PhoneNumber + "\n";
    }
}

public class Q2 {
    public static void Creator() {
        Scanner sc = new Scanner(System.in);
        String quit;

        try(FileWriter writer = new FileWriter("output.txt",true)){
            while(true){
                System.out.print("Enter First Name: ");
                String firstName = sc.nextLine();
                System.out.print("Enter Last Name: ");
                String lastName = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Phone Number: ");
                String PhoneNumber = sc.nextLine();
                User firstUser = new User(firstName, lastName, age, PhoneNumber);

                writer.write(firstUser.toString() + "\n");
                writer.flush();

                System.out.print("User Saved in File Successfully \n");

                System.out.println("Do you want to Continue (Y/N): (Type QUIT to exit)");
                quit = sc.nextLine();
                if(quit.equals("QUIT")){
                   break;
                }
            }

            System.out.print("\n All Users in File are \n");
            try(BufferedReader br = new BufferedReader(new FileReader("output.txt"))){
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            sc.close();
        }
    }
}
