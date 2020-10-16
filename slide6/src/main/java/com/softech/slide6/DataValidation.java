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
public class DataValidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nhap email: ");
        String email = s.nextLine();
        
        System.out.println("Nhap so dien thoai: ");
        String phone = s.nextLine();
        
        String reEmail = "\\w+@\\w\\.\\w+";
        if(email.matches(reEmail)){
            System.out.println("Email hop le");
        }else
            System.out.println("Email khong hop le!");
        
        String rePhone = "0543\\d{6}";
        if(phone.matches(rePhone))
            System.out.println("So dien thoai hop le");
        else
            System.out.println("So dien thoai khong hop le");
    }
}
