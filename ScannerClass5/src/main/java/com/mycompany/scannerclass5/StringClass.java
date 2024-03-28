/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scannerclass5;

import java.util.Scanner;

/**
 *
 * @author oanht
 */
public class StringClass {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 identical strings:");
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    System.out.println(str2 == str2);
    System.out.println(str2.equals(str2));
    
}