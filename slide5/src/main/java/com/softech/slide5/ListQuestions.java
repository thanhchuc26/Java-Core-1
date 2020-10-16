/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ListQuestions {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap cau hoi thu %d: ", i+1);
            String st = s.nextLine();
            
            ds.add(st);
        }
        Collections.shuffle(ds);
        
        System.out.println("Danh sach cac cau hoi: \n");
        for (String item : ds) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
