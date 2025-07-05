package Basics_of_Multithreading_2.Q4;
import java.util.Random;
import java.util.concurrent.*;

public class Q4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Random rand = new Random();
            int result = rand.nextInt(100);
            System.out.println("Generated number: " + result + " on thread " + Thread.currentThread().getName());
            return result;
        };

        Future<Integer> future = executor.submit(task);

        try {
            Integer randomValue = future.get();
            System.out.println("Result from thread: " + randomValue);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

