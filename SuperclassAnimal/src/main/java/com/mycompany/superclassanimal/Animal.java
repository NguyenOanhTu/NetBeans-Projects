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
public class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String speak(){
        return "No Sound";
    }
    public String getName(){ return name;}
    public void setName(String name) {this.name = name; }
    public int getAge(){ return age; }
    public void setAge( int age) {this.age = age;}
}
