/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab6;

/**
 *
 * @author June
 */
public class DataValidator {
    public boolean isEmail(String st){
        String pattern = "[\\w]+@[\\w]+\\.[a-zA-Z]{2,3}";
        return st.matches(pattern);
    }
    
    public boolean isPhone(String st){
        String pattern = "0\\d{9}";
        return st.matches(pattern);
    }
    
    public boolean isIdentityCard(String st){
        String pattern = "\\d{9}";
        return st.matches(pattern);
    }
}
