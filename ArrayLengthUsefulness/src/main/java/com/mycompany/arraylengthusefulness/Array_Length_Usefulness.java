/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylengthusefulness;

/**
 *
 * @author oanht
 */
public class Array_Length_Usefulness {

    public static void main(String[] args) {
        int[] scores = new int[5];
        System.out.println("The size of is " + scores.length);
        System.out.println("old Array");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d ", scores[i]);
        }
        scores[1] = 99;
        scores[4] = 88;
        System.out.println("\nNew Array:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d ", scores[i]);
        }
    }
}