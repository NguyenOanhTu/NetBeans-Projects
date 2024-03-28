/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drawcolors;

/**
 *
 * @author oanht
 */
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
public class ColorJPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
    }
}
