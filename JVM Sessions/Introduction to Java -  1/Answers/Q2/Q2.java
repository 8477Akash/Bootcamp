package Module_1;

import java.util.Scanner;

public class Q2{
    public static void READ(){

        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.println("Enter text (type 'XDONE' anywhere to finish):");

        while (true) {
            String line = sc.nextLine();

            if (line.contains("XDONE")) {
                // Capture only the part before XDONE
                int index = line.indexOf("XDONE");
                result.append(line.substring(0, index));
                break;
            }

            result.append(line).append("\n");
        }

        System.out.println("\nYou entered:");
        System.out.print(result.toString());

        sc.close();
    }

}