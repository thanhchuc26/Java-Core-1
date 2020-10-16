/*
    Tinh trung binh cong cac so chia het cho 3 tu 27 den 250
 */
package com.softech.slide3;

/**
 *
 * @author June
 */
public class TrungBinhCong {
    public static void main(String[] args) {
        int i = 27;
        int sum = 0, count = 0;
        while(i <=250){
            if(i % 3 == 0){
                sum += i;
                count++;
            }
            i++;
        }
        float avg = (float)sum/count;
        System.out.printf("Tong cac so chia het cho 3: %d", count);
        System.out.printf("\nTong cac so: %d - Trung binh cac so: %f", sum, avg);
    }
}
