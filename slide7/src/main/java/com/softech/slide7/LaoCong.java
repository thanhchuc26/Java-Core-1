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
public class LaoCong extends NhanVien{
    protected double luongGio;
    protected int soGioLam;

    public LaoCong(double luongGio, int soGioLam, String hoten, double luong) {
        super(hoten, luong);
        this.luongGio = luongGio;
        this.soGioLam = soGioLam;
    }
    
    public double tinhThuNhap(){
        return luongGio*soGioLam;
    }
}
