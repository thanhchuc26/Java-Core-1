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
public class SinhVienIT extends SinhVien{
    protected float diemJava, diemCSS;

    public SinhVienIT(String hoTen, float diemJava, float diemCSS){
        super(hoTen);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
    }
    
    @Override
    float tinhDiemTB() {
        return (diemJava*2 + diemCSS)/3;
    }
    
}
