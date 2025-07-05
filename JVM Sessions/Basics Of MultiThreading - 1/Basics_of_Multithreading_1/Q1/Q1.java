package Basics_of_Multithreading_1.Q1;

public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();



        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        myThread.start();
        t1.start();

        myThread.join();
        t1.join();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        System.out.println("Thread is running : Thread Class");

        try {
            Thread.sleep(2000);
            System.out.println("After Sleep : Thread Class");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running : Runnable Interface");
        try {
            Thread.sleep(2000);
            System.out.println("After Sleep : Runnable Interface");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}