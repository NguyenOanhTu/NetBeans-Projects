/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.infocar;

/**
 *
 * @author oanht
 */
public class Car {
    String color;
    int year;

    
    Car(String color, int year){
        this.color = color;
        this.year = year;
    }
    void drive(){
        System.out.println("Car is driving now!");
    }
    void stop(){
        System.out.println("Car stopped!");
    }
}
