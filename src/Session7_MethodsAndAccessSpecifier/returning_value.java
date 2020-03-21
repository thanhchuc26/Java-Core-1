/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7_MethodsAndAccessSpecifier;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class returning_value {
    int a,b;
    public int tinhtong(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        returning_value obj = new returning_value();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        obj.a=input.nextInt();
        System.out.print("Nhap gia tri b: ");
        obj.b=input.nextInt();
        int tong;
        tong=obj.tinhtong(obj.a, obj.b);
        System.out.println("Tong cua a+b: " + tong);
    }
}
