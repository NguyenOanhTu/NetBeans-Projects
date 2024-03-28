/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mathclassdemo;

/**
 *
 * @author oanht
 */
import java.util.Scanner;

public class TestMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Power of two numbers = " + Math.pow(num1, num2));

        double maxNumber = Math.max(Math.max(num1, num2), num3);
        System.out.println("Largest = " + maxNumber);

        System.out.println("Generating a random number: " + (int) (Math.random() * 10));
        System.out.println("Number with 2 decimal places:  " + maxNumber);

    }
}
