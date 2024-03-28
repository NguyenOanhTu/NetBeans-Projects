/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methodoverloadingexample;

/**
 *
 * @author oanht
 */
public class SumCalculator {
    private int sum(int a, int b){
        return a+b;
    }
    private int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String [] args){
        SumCalculator myCal = new SumCalculator();
        System.out.println("Calling first sum method:" + myCal.sum(4, 7));
        System.out.println("Calling first sum method:" + myCal.sum(1, 2, 3));
    }
}
