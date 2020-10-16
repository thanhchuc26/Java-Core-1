/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab2;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class MainClass {
    public static void menu(){
        System.out.println("--------------------------");
        System.out.println("----1. Giai Phuong Trinh Bac Nhat----");
        System.out.println("----2. Giai Phuong Trinh Bac Hai----");
        System.out.println("----3. Tinh Tien Dien----");
        System.out.println("----4. Thoat Chuong Trinh----");
        System.out.println("--------------------------");
        System.out.println("-----Chon Chuc Nang-----");
        Scanner s = new Scanner(System.in);
        int chon = s.nextInt();
        switch(chon){
            case 1: 
                System.out.println("Nhap a: ");
                float a = s.nextFloat();
                System.out.println("Nhap b: ");
                float b = s.nextFloat();
                PhuongTrinh.giaiPhuongTRinhBatNhat(a, b);
                break;
            case 2:
                System.out.println("Nhap a: ");
                a = s.nextFloat();
                System.out.println("Nhap b: ");
                b = s.nextFloat();
                System.out.println("Nhap c: ");
                float c = s.nextFloat();
                PhuongTrinh.giaiPhuongTrinhBacHai(a, b, c);
                break;
            case 3:
                TienDien.tinhTienDien();
                break;
            default:
                System.exit(0);
        }
        System.out.println("Hen gap lai!");
    }
    public static void main(String[] args) {
        System.out.println("=================LAB2==================");
        menu();
    }
}
