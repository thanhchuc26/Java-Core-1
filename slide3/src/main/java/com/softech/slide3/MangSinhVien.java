/*
    Nhap danh sach 5 sinh vien sau do sap xep theo Alphabet
*/
package com.softech.slide3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class MangSinhVien {
    public static void main(String[] args) {
        String svs[] = new String[5];
        float diem[] = new float[5];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.printf("Nhap sinh vien thu %d: ", (i+1));
            svs[i] = s.nextLine();
            System.out.printf("Nhap diem sinh vien thu %d: ", (i+1));
            diem[i] = s.nextFloat();
            s.nextLine();
        }
        System.out.println("Mang sinh vien: " + Arrays.toString(svs));
        System.out.println("Mang diem sinh vien: " + Arrays.toString(diem));
//        Arrays.sort(svs);
        for(int i = 0; i < diem.length-1; i++){
            for(int j=i+1; j < diem.length; j++ ){
                if(diem[i]<diem[j]){
                    float temp = diem[j];
                    diem[j] = diem[i];
                    diem[i] = temp;
//                    diem[i] = diem[i] + diem[j];
//                    diem[j] = diem[i] - diem[j];
//                    diem[i] = diem[i] - diem[j];
                    String st = svs[i];
                    svs[i] = svs[j];
                    svs[j] = st;
                }
            }
        }
        System.out.println("Mang sinh vien sau khi sap xep: " + Arrays.toString(svs));
        System.out.println("Mang diem sinh vien sau khi sap xep: " + Arrays.toString(diem));
    }
}
