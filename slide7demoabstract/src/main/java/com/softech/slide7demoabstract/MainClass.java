/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide7demoabstract;

/**
 *
 * @author June
 */
public class MainClass {
    public static void main(String[] args) {
        SinhVien sv;
        
        sv = new SinhVienIT("Chuc", 10, 8);
        System.out.println("Diem TB: " + sv.tinhDiemTB());
        
        sv = new SinhVienBiz("Thanh", 7, 10, 9);
        System.out.println("Diem TB: " + sv.tinhDiemTB());
    }
}
