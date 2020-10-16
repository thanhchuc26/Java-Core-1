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
public class MainClass {
    
    public static void main(String[] args) {
        Sharp s = new Sharp();
        System.out.println("Before: " + Sharp.x);
        Sharp.moveTo();
        System.out.println("After: " + Sharp.x);
    }
}
