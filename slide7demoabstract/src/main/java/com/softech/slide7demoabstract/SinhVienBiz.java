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
public class SinhVienBiz extends SinhVien{
    protected float keToan, banHang, marketing;

    public SinhVienBiz(String hoTen, float keToan, float banHang, float marketing) {
        super(hoTen);
        this.keToan = keToan;
        this.banHang = banHang;
        this.marketing = marketing;
    }
    
    @Override
    float tinhDiemTB() {
        return (keToan + banHang + marketing)/3;
    }
    
}
