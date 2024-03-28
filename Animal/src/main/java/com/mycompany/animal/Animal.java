/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animal;

/**
 *
 * @author oanht
 */
public class Animal {
    private String name;
    private int size;
    private int weight;
    private int age;
    
    public Animal(String name, int size, int wight, int age){
        this.name = name;
        this.size = size;
        this.weight = wight;
        this.age = age;
    }
    
    public void eat(String food){
        System.out.printf("The %s is eating %s!\n", getName(),food);
    }
    public void move(int velocity){
        System.out.printf("The %s is moving %d km/h!\n", getName(), velocity);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(){
        this.weight = weight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
