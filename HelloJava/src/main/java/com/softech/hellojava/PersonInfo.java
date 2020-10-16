/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.hellojava;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class PersonInfo {
    public static void main(String[] args) {
        String hoten;
        int tuoi;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        hoten = scanner.nextLine();
        
        System.out.println("Nhap tuoi:");
        tuoi = scanner.nextInt();
        
        System.out.printf("%s nam nay %d tuoi", hoten, tuoi);
    }
        
}
