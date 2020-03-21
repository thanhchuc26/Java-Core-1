/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10_extends_super_contructor;

/**
 *
 * @author June
 */
class NhanSu {

    String hoten;

    public NhanSu() {
        hoten = "Ten cua class NhanSu";
    }

    public NhanSu(String str) {
        hoten = str;
    }
    public void hienThiNhanSu(){
        System.out.println("Day la class NhanSu");
    }
}

class HocSinh extends NhanSu {

    int tuoi;

    public HocSinh() {
//        hoten="Hoc sinh";
//        super();
//        super("Hoc sinh");
        tuoi = 20;
    }
    public void hienThiHocSinh(){
        super.hienThiNhanSu();
    }
}

public class extends_super_contructor {

    public static void main(String[] args) {
        HocSinh hocsinh = new HocSinh();
        System.out.println("Ten cua hoc sinh: " + hocsinh.hoten);
        hocsinh.hienThiHocSinh();
    }
}
