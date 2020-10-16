/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide6;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class NumberString {
    public static void main(String[] args) {
        String string;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap chuoi so phan cach bang dau phay: ");
        string = s.nextLine();
        String arg[] = string.split(",");
        for (String item : arg) {
            int num = Integer.parseInt(item);
            if(num % 2 == 0){
                System.out.println(" " + num);
            }
        }
        System.out.println("\nKet thuc chuong trinh");
    }
}
