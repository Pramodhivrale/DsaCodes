package com.data;

class Dog {
    String name;  // Instance variable
    int age;      // Instance variable
}

public class InstanceMethodMemory {
    public static void main(String[] args) {
        Dog dog1 = new Dog();  // First instance of Dog
        dog1.name = "Buddy";
        dog1.age = 3;

        Dog dog2 = new Dog();  // Second instance of Dog
        dog2.name = "Max";
        dog2.age = 5;

        System.out.println(dog1.name + " is " + dog1.age + " years old.");
        System.out.println(dog2.name + " is " + dog2.age + " years old.");
    }
}

