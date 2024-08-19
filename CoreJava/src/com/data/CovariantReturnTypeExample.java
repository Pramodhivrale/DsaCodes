package com.data;

class Animal {
    Animal getAnimal() {
        return new Animal();
    }
}

class Dogs extends Animal {
    @Override
    Dogs getAnimal() {
        return new Dogs(); // This is allowed because Dog is a subtype of Animal
    }
}

public class CovariantReturnTypeExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dogs dog = new Dogs();

        Animal returnedAnimal = animal.getAnimal(); // Returns an Animal
        Dogs returnedDog = dog.getAnimal(); // Returns a Dog

        System.out.println("Returned Animal: " + returnedAnimal.getClass().getName());
        System.out.println("Returned Dog: " + returnedDog.getClass().getName());
    }
}
