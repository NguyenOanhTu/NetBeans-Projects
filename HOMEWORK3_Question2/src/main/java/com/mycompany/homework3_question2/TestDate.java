/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework3_question2;

/**
 * A Test Driver for the Date class.
 */
public class TestDate {

    public static void main(String[] args) {
        // Test constructor and toString()
        Date d1 = new Date(2022, 5, 27);
        System.out.println(d1);  // toString()
        //02/08/2020

        // Test Setters and Getters
        d1.setYear(2022);
        d1.setMonth(5);
        d1.setDay(29);
        System.out.println(d1);
        //12/23/2012
        System.out.println("Year is: " + d1.getYear());
        //Year is: 2012
        System.out.println("Month is: " + d1.getMonth());
        //Month is: 12
        System.out.println("Day is: " + d1.getDay());
        //Day is: 23

        // Test setDate()
        d1.setDate(2002, 4, 2);
        System.out.println(d1);
        //01/02/2988
    }
}
