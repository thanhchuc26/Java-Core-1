/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.varargs;

/**
 *
 * @author June
 */
public class MainClass {
    
    public static int sum(int... num) {
        int s = 0;
        for (int item : num) {
            s += item;
        }
        return s;
    }
    
    public static String concat(String ... args){
        String st = "";
        for (String item : args) {
            st += " " + item;
        }
        return st;
    }
    
    public static void main(String[] args) {
        System.out.println("1: " + concat("Hello", "World"));
        System.out.println("2: " + concat("", "Hi", "You"));
        
        System.out.println("----------------------");
        System.out.println("Sum: " + sum(3));
        System.out.println("Sum: " + sum(3, 5, 3));
        System.out.println("Sum: " + sum(3, 12, 1, 4));
        System.out.println("Sum: " + sum(3, 0, 4, 2, 7, 10));
        int ars[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Sum: " + sum(ars));
    }
}
