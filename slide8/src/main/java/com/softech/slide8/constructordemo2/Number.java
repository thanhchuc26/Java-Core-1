/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.constructordemo2;

/**
 *
 * @author June
 */
public class Number {
    
    public void change1(int m){
        m = 8;
        System.out.println("m in change1: " + m);
    }
    
    public void change2(int[] mars){
        mars[0] = 8;
        System.out.println("First element: " + mars[0]);
    }
}
