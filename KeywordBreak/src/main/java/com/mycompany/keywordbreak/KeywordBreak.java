/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keywordbreak;

/**
 *
 * @author oanht
 */
public class KeywordBreak {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i+=1){
            if(i == 7){
                break;
            }
            System.out.println(i);
        } 
        
        // bai 2
//        int i = 1;
//        do{
//            if (i == 7){
//                break;
//            }
//         System.out.println(i);
//         i+=1;
//        }while(1 <= 10);

       //bai 3
//        int i = 1;
//        while(i <= 10){
//            if(i == 7){
//                break;
//            }
//            System.out.println(i);
//            i+=1;
//        }
    }
}
