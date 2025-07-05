package Basics_of_Multithreading_2.Q5;
import java.util.List;
import java.util.concurrent.*;

public class Q5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        System.out.println("Using shutdown()");
        for (int i = 1; i <= 3; i++) {
            int taskId = i;
            executor1.submit(() -> {
                System.out.println("Task " + taskId + " started (shutdown)");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " interrupted (shutdown)");
                }
                System.out.println("Task " + taskId + " finished (shutdown)");
            });
        }

        executor1.shutdown();
        System.out.println("Executor 1 shutdown called\n");

        Thread.sleep(3000);

        System.out.println("Using shutdownNow()");
        for (int i = 4; i <= 6; i++) {
            int taskId = i;
            executor2.submit(() -> {
                System.out.println("Task " + taskId + " started (shutdownNow)");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " interrupted (shutdownNow)");
                }
                System.out.println("Task " + taskId + " finished (shutdownNow)");
            });
        }

        List<Runnable> pending = executor2.shutdownNow();
        System.out.println("Executor 2 shutdownNow called. Pending tasks: " + pending.size());
    }
}
