package Basics_of_Multithreading_2.Q3;
import java.util.*;
import java.util.concurrent.*;
public class Q3 {
   public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> tasks = new ArrayList<>();

        // Create 5 dummy tasks
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            tasks.add(() -> {
                System.out.println("Task " + id + " is running on " + Thread.currentThread().getName());
                Thread.sleep(1000);
                return "Result of Task " + id;
            });
        }

        System.out.println("\nUsing SingleThreadExecutor");
        executeTasks(Executors.newSingleThreadExecutor(), tasks);

        System.out.println("\nUsing FixedThreadPool(3)");
        executeTasks(Executors.newFixedThreadPool(3), tasks);

        System.out.println("\nUsing CachedThreadPool");
        executeTasks(Executors.newCachedThreadPool(), tasks);
    }

    private static void executeTasks(ExecutorService executor, List<Callable<String>> tasks) {
        try {

            List<Future<String>> futures = executor.invokeAll(tasks);

            for (Future<String> future : futures) {
                System.out.println("Completed: " + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
