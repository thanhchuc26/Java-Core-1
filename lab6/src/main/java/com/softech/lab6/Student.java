/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab6;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class Student {
    private String name, email, phone, identityCard;

    public Student() {
    }

    public Student(String name, String email, String phone, String identityCard) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.identityCard = identityCard;
    }

    public void input(Scanner s){
        do {            
            System.out.println("Name: ");
            name = s.nextLine();
            if(name == null || name.equals(""))
                System.out.println("Name is invalid. Please try again");
            else
                break;
        } while (true);
        
        DataValidator dv = new DataValidator();
        do {            
            System.out.println("Email: ");
            email = s.nextLine();
            if(dv.isEmail(email))
                break;
            else
                System.out.println("Email is invalid. Please try again");
        } while (true);
        
        do {            
            System.out.println("Phone: ");
            phone = s.nextLine();
            if(dv.isPhone(phone))
                break;
            else
                System.out.println("Phone is invalid. Please try again");
        } while (true);
        
        do {            
            System.out.println("Identity card: ");
            identityCard = s.nextLine();
            if(dv.isIdentityCard(identityCard))
                break;
            else
                System.out.println("Identity card is invalid. Please try again");
        } while (true);
    }
    
    public void output(){
        System.out.printf("Name: %s  -   Email: %s  -  Phone: %s  -  Identity Card: %s \n", name, email, phone, identityCard);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
}
