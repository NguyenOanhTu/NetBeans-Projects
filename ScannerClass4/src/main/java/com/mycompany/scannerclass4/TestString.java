/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scannerclass4;




/**
 *
 * @author oanht
 */
public class TestString {
    public static void main(String[] args){
        String text = new String("I'm studying IT069IU.");
        
        
        System.out.println("text: " + text);
        System.out.println("text.length() = " + text.length());
        System.out.println("text.charAt(5) = " + text.charAt(5));
        
        System.out.println("text.substring(5,8) = " + text.substring(5,8));
        System.out.println("text.indexOf(\"in\")= "+ text.indexOf("in"));
        String newText = text + "How about you?";
        newText = newText.toUpperCase();
        System.out.println("newText: " + newText);
        if (text.equals(newText))
            System.out.println("text and newText are equal");
        else 
            System.out.println("text and newText are not equal.");
    }

    private static void equal(String newText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
