/*
Nhập vào cạnh hình lập phương tính thể tích xuất ra màn hình
 */
package com.softech.lab1;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class Cube {
    public static void main(String[] args) {
        float canh;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap canh cua hinh lap phuong: ");
        canh = scanner.nextFloat();
        
        float thetich = canh * canh * canh;
        thetich = (float)Math.pow(canh, 3);
        System.out.printf("The tich cua hinh lap phuong la %f", thetich);
    }
}
