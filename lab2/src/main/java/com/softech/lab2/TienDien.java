/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab2;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class TienDien {
    public static void tinhTienDien(){
        float soDien, tienDien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        soDien = scanner.nextFloat();
        if(soDien <= 50){
            tienDien = soDien * 1000;
        }else{
            tienDien = 50*1000 + (soDien - 50)*12000;
        }
        System.out.printf("Tien dien: %f", tienDien);
    }
    public static void main(String[] args) {
        tinhTienDien();
        tinhTienDien();
    }
}
