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
public class DisplayDemo {
    public static void main(String[] args) {
        String hoten = "ChucHT";
        int tuoi = 24;
        
        System.out.println("" + hoten + " nam nay " + tuoi + " tuoi");
        System.out.print("" + hoten + " nam nay " + tuoi + " tuoi");
        System.out.printf("%s nam nay %d tuoi", hoten, tuoi);
        
    }
}
