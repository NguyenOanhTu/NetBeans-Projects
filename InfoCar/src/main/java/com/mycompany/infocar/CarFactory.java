/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.infocar;

/**
 *
 * @author oanht
 */
public class CarFactory {
    public static void main(String[] args){
        Car hondCivic = new Car("green", 1972);
        Car toyotaCorolla = new Car("blue", 1966);
        Car vinfastLux = new Car("red", 2018);
        
        hondCivic.drive();
        toyotaCorolla.drive();
        vinfastLux.drive();
        
        hondCivic.stop();
        toyotaCorolla.stop();
        vinfastLux.stop();
    }
}
