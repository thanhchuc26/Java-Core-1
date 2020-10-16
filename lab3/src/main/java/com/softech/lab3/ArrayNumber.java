/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ArrayNumber {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i);
            arr[i] = s.nextInt();
        }
        System.out.println("Phan tu mang: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Phan tu mang sau khi sap xep: " + Arrays.toString(arr));
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
//                if(min>arr[i]){
//                    min = arr[i];
//                }
            min = Math.min(min, arr[i]);
        }
        System.out.println("Gia tri nho nhat trong mang: " + min);

        int sum = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                sum += arr[i];
                count++;
            }
           float avg = (float)sum/count;
            System.out.println("Gia tri trung binh cua cac phan tu chia het cho 3: " + avg);
        }
    }
}
