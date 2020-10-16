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
public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nhap vao username: ");
        String userName = s.nextLine();
        System.out.println("Nhap vao password: ");
        String passWord = s.nextLine();
        
        if(userName.equalsIgnoreCase("admin") && passWord.length()>6){
            System.out.println("Dang nhap thanh cong");
        }else{
            System.out.println("Dang nhap that bai");
        }
    }
}
