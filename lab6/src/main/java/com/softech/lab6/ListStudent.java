/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author June
 */
public class ListStudent {
    private ArrayList<Student> list = new ArrayList<>();
    
    public void input(){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.input(s);
            list.add(student);
        }
    }
    public void output(){
        System.out.println("-----------------------");
        System.out.println("Danh sach sinh vien");
        for (Student student : list) {
            student.output();
        }
    }
}
