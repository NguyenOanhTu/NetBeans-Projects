/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework2_employee_time;

/**
 *
 * @author oanht
 */
public class Time { 

    private int hour, minute, second;
    


    public Time() { 
        hour = [0, 23];
        minute = [0, 59];
        second = [0, 59];
    }

    public Time(int hour,int minute, int second) { 
        hour = 1;
        minute = 30;
        second = 00;
    }
    

    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
   
    public void getHour(int hour) {
        hour = hour;
    }
    
    public void getMinute(int minute) {
        minute = minute;
    }
    
    public void getSecond(int second) {
        second = second;
    }
}
