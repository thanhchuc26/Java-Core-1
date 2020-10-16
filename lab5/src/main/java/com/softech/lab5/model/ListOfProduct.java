/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ListOfProduct {
    private ArrayList<Product> list = new ArrayList<>();
    
    public void input(){
        System.out.println("Nhap danh sach san pham");
        Scanner s = new Scanner(System.in);
        int i = 1;
        do {            
            System.out.printf("San pham thu %d: ", i);
            String st = s.nextLine();
            if(st == null || st.equals("")){
                break;
            }
            System.out.println("Gia san pham: ");
            double price = s.nextDouble();
            list.add(new Product(st, price));
            s.nextLine();
            i++;
        } while (true);
    }
    
    public void view(){
        System.out.println("Danh sach san pham");
        System.out.println("|Ten\t\t|Gia\t\t|");
        for (Product product : list) {
            System.out.printf("%10s | %.2f \n", product.getName(), product.getPrice());
        }
    }
    
    public void sort(){
        Collections.sort(list, (a, b) -> (int)(a.getPrice()-b.getPrice()));
        System.out.println("Danh sach sau khi sap xep: ");
        view();
    }
    
    public void findAndDelete(){
        System.out.println("Nhap ten san pham can xoa: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        Product found = null;
        
        for (Product product : list) {
            if(product.getName().equals(name)){
                found = product;
                break;
            }
            if(found!=null){
                list.remove(found);
                System.out.println("San pham da duoc xoa khoi danh sach");
            }else{
                System.out.println("San pham khong co trong danh sach");
            }
        }
    }
    
    public void avgPrice(){
        double avg = 0;
        double sum = 0;
        for (Product product : list) {
            sum += product.getPrice();
        }
        avg = sum/list.size();
        System.out.println("Gia trung binh cua cac san pham: " + avg);
    }
    
    public void menu(){
        System.out.println("Menu Chuong Trinh");
        System.out.println("1. Nhap danh sach san pham.");
        System.out.println("2. Xuat danh sach san pham.");
        System.out.println("3. Sap xep san pham.");
        System.out.println("4. Tim va xoa san pham.");
        System.out.println("5. Tinh gia trung binh san pham.");
        System.out.println("6. Thoat chuong trinh");
        System.out.print("Lua chon: ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        do {            
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    findAndDelete();
                    break;
                case 5:
                    avgPrice();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
}
