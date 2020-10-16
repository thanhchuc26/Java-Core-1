/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.Recursive;

/**
 *
 * @author June
 */
public class SimpleDemo {

    public int sum(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public int sumRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumRecursion(n - 1);
    }

    public static void main(String[] args) {
        SimpleDemo sd = new SimpleDemo();
        int result = sd.sum(100000);
        System.out.println("Result with for: " + result);
        int result2 = sd.sumRecursion(1000);
        System.out.println("Result with recursive: " + result2);
    }
}
