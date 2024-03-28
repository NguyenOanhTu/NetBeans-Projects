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
public class Employee {

    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        id = 2080601402;
        firstName = "Nguyen";
        lastName = "Tu";
        salary = 2000000;
    }

    public int getID() {
        return id;
    }

}
