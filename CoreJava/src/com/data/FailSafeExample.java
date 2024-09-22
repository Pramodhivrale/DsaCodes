package com.data;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(4);  // Modifying the list during iteration
        }
        
        System.out.println("Final list: " + list);
    }
}

