/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10_polymorphism;

/**
 *
 * @author June
 */
class NhanSu {

    public void khoiTao() {
        System.out.println("Day la phuong thuc khoi tao ko co tham so");
    }
}

class HocSinh extends NhanSu {

    public void khoiTao(int i) {
        System.out.println("Day la phuong thuc khoi tao co 1 tham so");
    }

    public void khoiTao(int i, int j) {
        System.out.println("Day la phuong thuc khoi tao co 2 tham so");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        HocSinh hocsinh = new HocSinh();
        hocsinh.khoiTao();
        hocsinh.khoiTao(0);
        hocsinh.khoiTao(0, 0);
    }
}
