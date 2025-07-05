package Basics_of_Multithreading_1.Q2;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("First Thread");
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second Thread");
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println("Value : " + counter.count);


    }
}

class Counter{
    int count;

    public synchronized void increment(){
        count++;
    }
}


