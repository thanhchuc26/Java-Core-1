/*
Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách vừa nhập và tính tổng của nó.
 */
package com.softech.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class AListOfReal {

    private ArrayList<Double> list = new ArrayList<>();

    public void input() {
        System.out.println("--------Nhap danh sach cac so thuc-------");
        Scanner s = new Scanner(System.in);
        int yes = 1;
        list.clear();
        do {
            System.out.println("Nhap so: ");
            double num = s.nextDouble();

            list.add(num);
            System.out.println("Ban co muon nhap tiep khong?(1: tiep 0: thoat)");
            yes = s.nextInt();
        } while (yes == 1);
    }
    
    public void output(){
        System.out.println("--------------------");
        for (Double item : list) {
            System.out.println("  " + item);
        }
        System.out.println();
    }
    
    public void totalList(){
        double sum = 0;
        for (Double item : list) {
            sum += item;
        }
        System.out.println("Tong: " + sum);
    }
}
