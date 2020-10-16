/*
Nhập vào mảng số nguyên
+Tính và xuất trung bình cộng
+Xuất lập phương các phần tử
 */
package com.softech.slide3;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class MangSo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);
        int i = 0;
        do{
            System.out.printf("Mang [%d] = ", i);
            arr[i] = s.nextInt();
            i++;
        }while(i < 10);
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        System.out.printf("Tong cac phan tu trong mang: %d", sum);
        float avg = sum/arr.length;
        System.out.println("Gia tri trung bih cua cac phan tu trong mang: " + avg);
    }
}
