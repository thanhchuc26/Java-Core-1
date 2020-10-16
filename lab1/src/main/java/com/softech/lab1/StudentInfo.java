/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab1;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class StudentInfo {
    public static void main(String[] args) {
        String hoten;
        float diemtb;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        hoten = scanner.nextLine();
        
        System.out.print("Nhap diem trung binh: ");
        diemtb = scanner.nextFloat();
        
        System.out.printf("%s %f diem", hoten, diemtb);
    }
}
