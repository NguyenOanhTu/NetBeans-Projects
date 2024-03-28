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
public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }
   @Override
   public void greeting() {
      System.out.println("Woow!");
   }
   
   @Override
   public void greeting(Dog another) {
      System.out.println("Woooooowwwww!");
   }
}
