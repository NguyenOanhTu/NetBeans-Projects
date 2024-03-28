/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradebook;

/**
 *
 * @author oanht
 */
public class GradeBook {

    private String courseName;
    public GradeBook(String name){
        courseName = name;
    }
    public void SetCourseName(String name){
        courseName = name;
    }
   public String getCourseName(){
       return courseName;
   }
   public void displayMessage(){
       System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
   }
   
}
