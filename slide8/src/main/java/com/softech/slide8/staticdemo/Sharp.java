/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.staticdemo;

/**
 *
 * @author June
 */
public class Sharp {
    public static int x = 30;
    
    static{
        x = 50;
        System.out.println("static block: " + x);
    }
    
    public static void moveTo(){
        System.out.println("moveTo: " + x);
        x = 100;
        System.out.println("moveTo: " + x);
    }
}
