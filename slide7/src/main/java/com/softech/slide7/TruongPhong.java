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
public class TruongPhong extends NhanVien {
    protected double trachNhiem;
    
    public TruongPhong(String hoten, double luong, double trachNhiem){
        super(hoten, luong);
        this.trachNhiem = trachNhiem;
    }
    
    public void xuat(){
        super.xuat();
        System.out.printf("Trach nhiem: %f", trachNhiem);
    }
    
    public double tinhThuNhap(){
        return luong + trachNhiem;
    }
}
