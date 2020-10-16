/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab5;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class MainClass {
    public static void main(String[] args) {
        AListOfReal listOfReal = new AListOfReal();
        int choice = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("----Menu Chuong Trinh----");
            System.out.println("1. Nhap danh sach so thuc");
            System.out.println("2. Hien thi danh sach so thuc");
            System.out.println("3. Tinh tong danh sach so thuc");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban la: ");
            choice = s.nextInt();
            
            if(choice!=0){
                switch(choice){
                    case 0:
                        System.exit(0);
                    case 1: 
                        listOfReal.input();
                        break;
                    case 2:
                        listOfReal.output();
                        break;
                    case 3: 
                        listOfReal.totalList();
                        break;
                    default:
                        System.out.println("Nhap gia tri sai. Vui long nhap lai!");
                }
            }    
        }while(choice!=0);
            System.out.println("Ket thuc chuong trinh.");
    }
}
