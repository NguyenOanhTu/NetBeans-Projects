/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temperaturecaculation;

/**
 *
 * @author oanht
 */
public class TemperatureCaulation {

    public static void main(String[] args) {
        double[] hourlyTemperatures = {34, 24, 25, 26, 37, 34, 52};
        double averageTemp = calculateAverage(hourlyTemperatures);
        System.out.printf("The average: %.2f\n", averageTemp);
        convertToFahrenheit(hourlyTemperatures);
        System.out.print("C->F: ");
        for (double temp : hourlyTemperatures) {
            System.out.printf("%.2f", temp);
        }
    }

    public static double calculateAverage(double[] localArray) {
        double sum = 0;
        for (double temp : localArray) {
            sum += temp;
        }
        return sum / localArray.length;
    }

    public static void convertToFahrenheit(double[] tempC) {
        for (int index = 0; index < tempC.length; index++) {
            tempC[index] = tempC[index] / 2 + 30;
        }
    }
}
