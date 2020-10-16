/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide6;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class FindAndReplace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nhap noi dung: ");
        String content = s.nextLine();
        
        System.out.println("Nhap noi dung can tim: ");
        String find = s.nextLine();
        
        System.out.println("Nhap noi dung can thay the: ");
        String replace = s.nextLine();
        
        String result = content.replaceAll(find, replace);
        System.out.println("Noi dung sau khi thay the: " + result);
    }
}
