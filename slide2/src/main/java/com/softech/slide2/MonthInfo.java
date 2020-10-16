/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide2;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class MonthInfo {

    public static void main(String[] args) {
        int thang, nam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        nam = scanner.nextInt();
        System.out.println("Nhap thang: ");
        thang = scanner.nextInt();
        switch (thang) {
            case 2:
                if (nam % 4 == 0  && nam % 100 != 0){
                    System.out.println("Thang co 29 ngay");
                }
                else{
                    System.out.println("Thang co 28 ngay");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
            default:
                System.out.println("Thang co 31 ngay");
        }
    }
}
