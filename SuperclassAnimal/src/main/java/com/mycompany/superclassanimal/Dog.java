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
public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public String speak(){
        return "Woof";
    }
}
