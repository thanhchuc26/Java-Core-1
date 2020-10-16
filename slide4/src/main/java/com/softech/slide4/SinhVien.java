/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide4;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class SinhVien {
    String hoTen;
    double diemTB;
    
    public SinhVien(){
        hoTen = "ChucHT";
        diemTB = 8;
    }
    public SinhVien(String hoTen, double diemTB){
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.println("Nhap diem TB: ");
        diemTB = s.nextDouble();
    }
    public void xuat(){
        System.out.println("\n--------------------");
        System.out.printf("Ho ten sinh vien: %s --- Diem TB: %f --- Hoc luc: %s", hoTen, diemTB, xepLoai());
        
    }
    public String xepLoai(){
        if(diemTB>=9)
            return "Xuat sac";
        else
            return "Gioi";
    }
}
