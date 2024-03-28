/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework78_question1;

/**
 *
 * @author oanht
 */
public class TestAnimal {

    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("lala");
        cat1.greeting();
        Dog dog1 = new Dog("haha");
        dog1.greeting();
        BigDog bigDog1 = new BigDog("hihi");
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat("lala");
        animal1.greeting();
        Animal animal2 = new Dog("haha");
        animal2.greeting();
        Animal animal3 = new BigDog("hihi");
        animal3.greeting();
        // Animal animal4 = new Animal();   // Error!!! Animal is abstract; cannot be instantiated !

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        // Cat cat2 = (Cat)animal2;        // Error!!! Dog cannot be cast to Cat !

        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
        bigDog1.greeting(bigDog2);
    }
}
