/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maxandmin;

/**
 *
 * @author oanht
 */
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        int n;
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            int x = i + 1;
            System.out.println("nhap gia tri cua phan tu thu "+x+" :");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < n; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la: " + min);
    }
}
