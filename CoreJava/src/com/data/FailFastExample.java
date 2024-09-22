package com.data;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(4);  // Modifying the list during iteration
        }
    }
}

