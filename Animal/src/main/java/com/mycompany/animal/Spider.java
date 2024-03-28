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
public class Spider extends Animal{
    private int legs;
    private boolean poison;
    
    public Spider(String name, int size, int weight, int age, int legs, boolean poison){
        super(name, size, weight, age);
        this.legs = legs;
        this.poison = poison;
    }
    public void attack(){
        System.out.println("The spider is attacking!");
    }
    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    public boolean isPoison(){
        return poison;
    }
    public void setPoison(boolean poison){
        this.poison = poison;
    }
    
}
