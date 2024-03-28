/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.superclassanimal;

/**
 *
 * @author oanht
 */
public class ZooPolymorphism {

    public static void main(String[] args) {
        System.out.println("Treat them as their owwn subclass:");
        Dog myDog = new Dog("KiKi", 5);
        Duck myDuck = new Duck("Donald", 2);
        Cat myCat = new Cat("Tom", 3);
        System.out.printf("Dog speaks %s\n", myDog.speak());
        System.out.printf("Duck speaks %s\n", myDuck.speak());
        System.out.printf("Cat speaks %s\n", myCat.speak());

        System.out.println("\nTreat them as a superclass Animal: ");
        Animal anotherDog = new Dog("Corgi", 3);
        Animal anotherDuck = new Duck("Daisy", 4);
        Animal anotherCat = new Cat("Garfield", 2);
        System.out.printf("Dog speaks %s\n", anotherDog.speak());
        System.out.printf("Duck speaks %s\n", anotherDuck.speak());
        System.out.printf("Cat speaks %s\n", anotherCat.speak());

        System.out.println("\nGroup them into an collection of Animal type:");
        Animal[] myZoo = new Animal[3];
        myZoo[0] = anotherDog;
        myZoo[1] = anotherDuck;
        myZoo[2] = anotherCat;
        for (int i = 0; i < myZoo.length; i++) {
            System.out.printf("%s speaks %s, belongs to %s.\n", myZoo[i].getName(), myZoo[i].speak(), myZoo[i].getClass());
        }
    }
}
