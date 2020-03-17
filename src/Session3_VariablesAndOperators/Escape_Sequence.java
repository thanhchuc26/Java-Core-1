/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session3_VariablesAndOperators;

/**
 *
 * @author June
 */
public class Escape_Sequence {

    public static void main(String[] args) {
        String chuoi1 = "Dat Nuoc";
        String chuoi2 = "Viet Nam";
        System.out.println("Noi dung cua chuoi1 khi dung \b: " + chuoi1 + "\b");
        System.out.println("Noi dung cua chuoi1 va chuoi2 khi dung \n: " + chuoi1 + "\n" + chuoi2);
        System.out.println("Noi dung cua chuoi1 va chuoi2 khi dung \r: ");
        System.out.println(chuoi1 + "\r" + chuoi2);
    }
}
