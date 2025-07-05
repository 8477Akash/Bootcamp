package Basics_of_Multithreading_2.Q1;
import java.util.concurrent.*;
public class Q1 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

     Runnable runnableTask = () -> {
            System.out.println("Runnable: Task is running");
        };

        Callable<String> callableTask = () -> {
            System.out.println("Callable: Task is running");
            return "Callable: Task Completed";
        };
        Future<?> runnableFuture = executor.submit(runnableTask);
        Future<String> callableFuture = executor.submit(callableTask);
        System.out.println("Runnable returned: " + runnableFuture.get());
        System.out.println("Callable returned: " + callableFuture.get());

        executor.shutdown();
    }
}
