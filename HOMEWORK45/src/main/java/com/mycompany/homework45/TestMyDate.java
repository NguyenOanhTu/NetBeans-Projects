/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework45;

/**
 *
 * @author oanht
 */
public class TestMyDate {

    public static void main(String[] args) {
//        MyDate currentDate = new MyDate(2014, 7, 2);
//        System.out.println("Current date: " + currentDate);
//
//        MyDate d1 = new MyDate(2012, 2, 28);
//        System.out.println(d1);             // Tuesday 28 Feb 2012
//        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
//        System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
//        System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
//        System.out.println(d1.nextYear());  // Monday 1 Apr 2013
//
//        MyDate d2 = new MyDate(2012, 1, 2);
//        System.out.println(d2);                 // Monday 2 Jan 2012
//        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
//        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
//        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
//        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010
//
//        MyDate d3 = new MyDate(2012, 2, 29);
//        System.out.println(d3.previousYear());  // Monday 28 Feb 2011
//
//        // MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
//        // MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
//_________________________________________________________________________________
        // Test constructor and toString()
        MyDate d1 = new MyDate(2022, 5, 27);
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
