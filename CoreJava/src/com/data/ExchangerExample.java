package com.data;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String data = "Thread 1 data";
                System.out.println("Thread 1 is exchanging data: " + data);
                String exchangedData = exchanger.exchange(data);
                System.out.println("Thread 1 received exchanged data: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                String data = "Thread 2 data";
                System.out.println("Thread 2 is exchanging data: " + data);
                String exchangedData = exchanger.exchange(data);
                System.out.println("Thread 2 received exchanged data: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
