package com.data;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Start an asynchronous task
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Step 1: Fetching data...");
            return 50;
        });

        // Transform the result using thenApply
        future = future.thenApply(result -> {
            System.out.println("Step 2: Processing data...");
            return result * 2;
        });

        // Consume the result using thenAccept
        future.thenAccept(result -> {
            System.out.println("Step 3: Final result: " + result);
        });

        // Wait for all tasks to complete
        future.join();
    }
}

