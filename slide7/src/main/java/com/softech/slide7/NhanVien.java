/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide7;

/**
 *
 * @author June
 */
public class NhanVien {
    protected String hoten;
    protected double luong;

    public NhanVien(String hoten, double luong) {
        this.hoten = hoten;
        this.luong = luong;
    }
    
    public double tinhThueThuNhap(){
        return luong * 0.1;
    }
    
    public void xuat(){
        System.out.printf("Ho ten: %s - Luong: %f", hoten, luong);
    }
    
    public double tinhThuNhap(){
        return luong;
    }
    
}
