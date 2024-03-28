/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scannerclass;

/**
 *
 * @author oanht
 */
import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name1: ");;
        String name1 = sc.nextLine();
        System.out.println("name1 entered is '" + name1 +"'.");
        
        System.out.println("Enter name2: ");
        String name2 = sc.next();
        System.out.println("name 2 entered is '" + name2 +"'.");
    }
}
