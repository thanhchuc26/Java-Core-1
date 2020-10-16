/*
    Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính diện tích, chu vi và tìm cạnh nhỏ nhất
của hình chữ nhật

 */
package com.softech.lab1;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class Rectangle {

    public static void main(String[] args) {

        float dai, rong;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        dai = scanner.nextFloat();
        System.out.println("Nhap vao chieu rong: ");
        rong = scanner.nextFloat();
        float chuvi = (dai + rong) * 2;
        float dientich = dai * rong;
        float min = Math.min(dai, rong);
        System.out.printf("Hinh chu nhat co chieu dai %f va chieu rong %f", dai, rong);
        System.out.println();
        System.out.printf("Hinh chu nhat co chu vi la %f va dien tich la %f", chuvi, dientich);
        System.out.printf("\nCanh nho nhat cua hinh chu nhat la %f", min);
    }
}
