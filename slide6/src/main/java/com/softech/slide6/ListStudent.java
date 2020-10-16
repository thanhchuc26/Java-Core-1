/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ListStudent {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int i = 1;
        do {            
            System.out.printf("Nhap sinh vien thu %d: ", i);
            String hoTen = s.nextLine();
            if(hoTen == null || hoTen.equals("")){
                break;
            }
            list.add(hoTen);
            i++;
        } while (true);
        for (String item : list) {
            item = item.trim(); // xoa khoang trang hai dau
            if(item.startsWith("Nguyen ") || item.endsWith(" Tuan")){
                String ho = item.substring(0, item.indexOf(""));
                String ten = item.substring(item.lastIndexOf(""));
                String dem = item.substring(item.indexOf(" "), item.lastIndexOf(" "));
                
                System.out.printf("Ho ten: %s %s %s \n", ho.toUpperCase(), dem, ten.toUpperCase());
            }
        }
        
        for (String item : list) {
            if(item.indexOf(" My ") > 0){
                System.out.println("Ho ten: " + item);
            }
        }
    }
}
