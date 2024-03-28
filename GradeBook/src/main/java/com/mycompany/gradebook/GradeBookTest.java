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


public class GradeBookTest {
    public static void main(String[] args){
    GradeBook gradebook1 = new GradeBook("CS101 Introduction to java Programming");
    GradeBook gradebook2 = new GradeBook("CS102 Data Structues in Java");
    System.out.printf("gradeBook1 course name is: %s\n", gradebook1.getCourseName());
    System.out.printf("gradeBook2 course name is: %s\n", gradebook2.getCourseName());
    
  
     
      
    }
}
