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
public class Duck extends Animal{
    public Duck(String name, int age){
        super(name, age);
    }
    @Override
    public String speak(){
        return "Quack";
    }
}

