/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ListOfName {
    private final ArrayList<String> list = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void nhap(){
        do{
            System.out.print("Nhap ho ten: ");
            String st = s.nextLine();
            if(st.isEmpty()){
                break;
            }
            list.add(st);
            s.nextLine();
        }while(true);
    }
    
    public void xuat(){
        System.out.println("----Danh sach ho ten----");
        list.forEach(item -> {
            System.out.println("Ho ten: " + item);
        });
    }
    
    public void ngauNhien(){
        Collections.shuffle(list);
        xuat();
    }
            
    public void sapXep(){
        Collections.sort(list, (a,b) -> a.compareTo(b)); //Lambda Expression
        xuat();
    }
   
    public void timVaXoa(){
        System.out.println("Nhap ho ten can tim: ");
        String hoTen = s.nextLine();
        for (String item : list) {
            if(item.equals(hoTen)){
                list.remove(item);
                break;
            }
        }
    }
    
    public void hienThiMenu(){
        System.out.println("-----------------------");
        System.out.println("Menu Chuc Nang Cua Chuong Trinh");
        System.out.println("1. Nhap danh sach.");
        System.out.println("2. Hien thi danh sach.");
        System.out.println("3. Sap xep danh sach.");
        System.out.println("4. Hien thi ngau nhien danh sach.");
        System.out.println("5. Tim kiem va xoa ho ten trong danh sach.");
        System.out.println("6. Thoat chuong trinh.");
        System.out.println("Nhap lua chon cua ban: ");
        int choice = s.nextInt();
        do {            
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    ngauNhien();
                    break;
                case 5:
                    timVaXoa();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long nhap dung lua chon cua ban!!!");;
            }
        } while (true);
    }
}
