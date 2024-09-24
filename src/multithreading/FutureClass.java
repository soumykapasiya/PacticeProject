package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureClass {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);

        Future<String> future = service.submit(() -> {
            return "Future";
        });

        try {
            System.out.println(future.get());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Shutting down the service");
        service.shutdown();
    }
}
