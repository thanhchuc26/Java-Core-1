/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab3;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class IsPrime {
    public static void main(String[] args) {
        int N;
        boolean ok = true;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nhap vao so N: ");
        N = s.nextInt();
        for(int i = 2; i < N/2; i++){
            if(N%i==0){
                ok = false;
                break;
            }
        }
        if(ok==true){
            System.out.println("" + N + " la so nguyen to");
        }else{
            System.out.println("" + N + " khong phai la so nguyen to");
        }
    }
}
