/*
    Nhap so tu ban phim neu so duong thi tinh can bac 2
 */
package com.softech.slide2;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class NumberTest {
    public static void main(String[] args) {
        int num;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhap vao mot so: ");
            num = scanner.nextInt();

            if(num>0){
                double sqrt = Math.sqrt(num);
                System.out.println("Square root: " + sqrt);
            }else{
                System.out.println("Error!");
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Complete!!!");
    }
}
