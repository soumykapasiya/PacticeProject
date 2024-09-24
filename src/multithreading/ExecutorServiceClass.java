package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        Future<Integer> future = executor.submit(() -> 100);
        Integer result = future.get(); // Blocks until the task completes
        executor.shutdown();

        System.out.println(result);
    }
}
