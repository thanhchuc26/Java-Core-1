/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.constructordemo;

/**
 *
 * @author June
 */
public class Rectangle extends Sharp {
    public Rectangle(){
//        super();
//        super("red");
        System.out.println("Rectangle constructor");
}
    public void display(){
        System.out.println("This is a rectangle");
    }
}
