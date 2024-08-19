package com.data;

class Counter {
    static int count = 0;  // Static variable

    Counter() {
        count++;  // Increment the static variable
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        obj1.displayCount();  // Output: Count: 1

        Counter obj2 = new Counter();
        obj2.displayCount();  // Output: Count: 2

        Counter obj3 = new Counter();
        obj3.displayCount();  // Output: Count: 3

        System.out.println("Final Count: " + Counter.count);  // Accessing static variable using class name
    }
}

