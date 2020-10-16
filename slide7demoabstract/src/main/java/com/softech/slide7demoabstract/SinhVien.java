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
public abstract class SinhVien {
    protected String hoTen;
    
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }
    
    abstract float tinhDiemTB();

}
