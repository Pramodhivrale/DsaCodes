package com.data;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenCombineExample {
    public static void main(String[] args) {
        // Task 1: Fetch product price asynchronously
        CompletableFuture<Double> priceFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching product price...");
            return 100.0;
        });

        // Task 2: Fetch discount percentage asynchronously
        CompletableFuture<Double> discountFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching discount percentage...");
            return 10.0;
        });

        // Combine both tasks using thenCombine
        CompletableFuture<Double> finalPriceFuture = priceFuture.thenCombine(discountFuture, (price, discount) -> {
            System.out.println("Calculating final price...");
            return price - (price * discount / 100);
        });

        // Get and print the final result
        Double finalPrice = finalPriceFuture.join();
        System.out.println("Final discounted price: $" + finalPrice);
    }
}

