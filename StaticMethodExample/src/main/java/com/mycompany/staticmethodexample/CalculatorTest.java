/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.staticmethodexample;

/**
 *
 * @author oanht
 */
public class CalculatorTest {
    public static void main(String[] args) {
        int mySum = Calculator.add(5,6);
        int mySub = Calculator.sub(8, 5);
        System.out.println(mySum);
        System.out.println(mySub);
    }
}
