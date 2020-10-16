/*
 Nhâp điểm từ 0 --> 10
 */
package com.softech.slide3;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class SinhVien {
    public static void main(String[] args) {
        float diem = -1;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Nhap diem: ");
            diem = s.nextFloat();
            if(diem < 0 || diem > 10){
                System.out.println("Vui long nhap lai diem tu 0 --> 10");
            }
                    
        }while(diem < 0 || diem > 10);
        System.out.printf("Diem vua nhap la: %f", diem);
    }
}
