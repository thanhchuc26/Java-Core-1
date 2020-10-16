/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab4;

/**
 *
 * @author June
 */
public class MainClass {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Xe", 4000, 200);
        SanPham sp2 = new SanPham("Nha", 5000);
        
//        sp1.nhap();
        String ten = sp1.getTenSanPham();
        System.out.println("Ten san pham: " + ten);
        sp1.setTenSanPham("XeDap");
        sp1.xuat();
        System.out.println("\n--------------------------");
        sp1.xuat();
        System.out.println();
        System.out.println();
//        sp2.nhap();
        sp2.xuat();
    }
}
