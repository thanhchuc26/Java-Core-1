/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab4;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class SanPham {
    private String tenSanPham;
    private double donGia;
    private double giamGia;

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    
    
    private double getThueNhapKhau(){
        return donGia * 0.1;
    }
    
    public SanPham(String tenSanPham, double donGia, double giamGia){
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSanPham, double donGia){
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSanPham = s.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = s.nextDouble();
        System.out.println("Nhap giam gia: ");
        giamGia = s.nextDouble();
    }
    
    public void xuat(){
        System.out.printf("San pham: %s | Don gia: %f | Giam gia: %f | Thue nhap khau: %f", tenSanPham, donGia, giamGia, getThueNhapKhau());
    }
}
