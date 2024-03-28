/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.analysisclass;

/**
 *
 * @author oanht
 */
import java.util.Scanner;

public class AnalysisClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int falures = 0;
        int studentCounter = 1;
        int result;
        int failures = 0;
        while (studentCounter <= 10) {
            System.out.print("Enter resulf (1 = pass, 2 = fail): ");
            result = input.nextInt();

            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.printf("Passed: %d\nFailde: %d\n", passes, failures);
        if (passes > 8) {
            System.out.println("Bonus to instructor");
        }
    }
}
