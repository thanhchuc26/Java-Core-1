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
public class PhuongTrinh {

    public static void giaiPhuongTRinhBatNhat(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem!");
            } else {//a==0 && b!=0
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {//a!=0
            float nghiem = -b / a;
            System.out.println("Phuong trinh co 1 nghiem: " + nghiem);
        }
    }
    
    public static void giaiPhuongTrinhBacHai(float a, float b, float c){
        if(a==0){
            giaiPhuongTRinhBatNhat(a, b);
        }else{
            float delta = (float)Math.pow(b, 2) - 4*a*c;
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta==0){
                float x = -b/2*a;
                System.out.println("Phuong trinh co nghiem kep: " + x);
            }else{
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                float x1 = (-b + (float)Math.sqrt(delta))/2*a;
                float x2 = (-b - (float)Math.sqrt(delta))/2*a;
                System.out.printf("Nghiem x1: %.2f", x1);
                System.out.printf("Nghiem x2: %.2f", x2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.println("Nhap a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        b = scanner.nextFloat();
        System.out.println("Nhap c: ");
        c = scanner.nextFloat();
        giaiPhuongTRinhBatNhat(a, b);
        giaiPhuongTrinhBacHai(a, b, c);
        System.out.println("Ket thuc chuong trinh");
    }
}
