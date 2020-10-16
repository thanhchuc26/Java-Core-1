/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab8;

/**
 *
 * @author June
 */
public class XPoly {
    public static double sum(double ... nums){
        double s = 0;
        for (double item : nums) {
            s += item;
        }
        return s;
    }
    
    public static double min(double ... nums){
        double m = nums[0];
        for (double item : nums) {
            m = Math.min(m, item);
        }
        return m;
    }
    
    public static double max(double ... nums){
        double m = nums[0];
        for (double item : nums) {
            m = Math.max(m, item);
        }
        return m;
    }
    
    public static String toUpperFirstChar(String name){
        String args[] = name.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < args.length; i++) {
            String item = args[i];
            if(!item.equals("")){
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }
    
    
    public static void main(String[] args) {
//        double result  = sum(2);
//        System.out.println("Result: " + result);
        
        double result  = min(2);
        System.out.println("Result: " + result);
        
//        result = sum(2, 4, 9);
//        System.out.println("Result: " + result);
        
        result = min(2, 4, 9);
        System.out.println("Result: " + result);
        
//        result = sum(2, 4, 9, 10, 22, 17);
//        System.out.println("Result: " + result);
        
        result = max(2, 4, 9, 10, 22, 17);
        System.out.println("Result: " + result);
        
        String name = "huynh thanh chuc";
        String newName = toUpperFirstChar(name);
        System.out.println("New name: " + newName);
        
        name = "nguyen     van    binh";
        newName = toUpperFirstChar(name);
        System.out.println("New name: " + newName);
                
        
    }
}
