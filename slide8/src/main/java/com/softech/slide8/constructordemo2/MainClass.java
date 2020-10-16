/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.constructordemo2;

/**
 *
 * @author June
 */
public class MainClass {

    public static void changeStudent(Student st){
        st.id = "s03";
        System.out.println("id in changeStudent: " + st.id);
    }
    public static void main(String[] args) {
        
        Student s = new Student();
        s.id = "s02";
        System.out.println("Before id: " + s.id);
        changeStudent(s);
        System.out.println("After id: " + s.id);
        
        Number n = new Number();
        int m = 5;
        System.out.println("Before: " + m);
        n.change1(m);
        System.out.println("After: " + m);
        System.out.println("---------------");

        int[] mars = new int[]{6};
        System.out.println("Before: " + mars[0]);
        n.change2(mars);
        System.out.println("After: " + mars[0]);
        
    }
}
