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
public abstract class Animal {
   private String name;
   
   public Animal(String name){
       this.name = name;
   }
   abstract public void greeting();
}
