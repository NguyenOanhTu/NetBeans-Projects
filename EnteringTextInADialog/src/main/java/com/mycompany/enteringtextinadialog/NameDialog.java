/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enteringtextinadialog;

/**
 *
 * @author oanht
 */
import javax.swing.JOptionPane;
public class NameDialog {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome, %s, to Java Programming!", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
