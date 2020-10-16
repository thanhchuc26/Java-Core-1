/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.slide8.constructordemo;

/**
 *
 * @author June
 */
public class Sharp {
    String color;
    public Sharp(String color){
        this.color = color;
        System.out.println("1 Arg constructor");
    }
    
    public Sharp(){
        System.out.println("Default constructor");
    }
    
    public void display(){
        System.out.println("This is a sharp");
    }
    
}
