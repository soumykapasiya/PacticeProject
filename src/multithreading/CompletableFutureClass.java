package multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureClass {
    public static void main(String[] args) {

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker-> 1");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Future -> 1";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2500);
                System.out.println("Worker-> 2");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Future -> 2";
        });

        CompletableFuture longTask = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Long Task With No Return Value");
        });

        longTask.join();

        System.out.println(f1.thenApply(result -> result.toUpperCase()).join());
        f2.thenAccept(result -> System.out.println(result.toLowerCase()));

        CompletableFuture.allOf(f1, f2).thenApply(v -> {
            return "All Done";
        }).exceptionally(ex -> {
            return "Exception";
        }).join();

    }
}
