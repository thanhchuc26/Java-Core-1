/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab3;

/**
 *
 * @author June
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for(int i = 1; i<=10; i++){
                System.out.printf("%2d x %2d = %2d", x, i, x*i);
                System.out.println();
            }
                System.out.println("=====================");
        }
    }
}
