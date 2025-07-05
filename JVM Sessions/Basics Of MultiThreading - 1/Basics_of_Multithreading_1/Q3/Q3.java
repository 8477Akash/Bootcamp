package Basics_of_Multithreading_1.Q3;

import java.util.Scanner;

class Process extends Thread {
    public volatile boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            System.out.println("Running" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    void shutdown(){
        flag = false;
    }
}

public class Q3 {

    public static void main(String[] args) {
        System.out.println("Enter to Stop ");
        Process p1 = new Process();
        p1.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        p1.shutdown();



    }
}
