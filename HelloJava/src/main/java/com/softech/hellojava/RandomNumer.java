/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.hellojava;

/**
 *
 * @author June
 */
public class RandomNumer {
    public static void main(String[] args) {
        double num = 0;
        num = Math.random(); //0-->1
        num = num * 7 + 5;
        double sqrt = Math.sqrt(num);
        System.out.println("Random Numer: " + num);
        System.out.println("Square root: " + sqrt);
    }
}
