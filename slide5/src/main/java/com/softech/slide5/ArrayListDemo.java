/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            double d = s.nextDouble();
            nums.add(d);
        }
        double sum = 0;
        System.out.println();
        for (Double item : nums) {
            System.out.println("  " + item);
            sum += item;
        }
        System.out.println();
    }
}
