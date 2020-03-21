/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session4_DecisionMakingStructs;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class ifStatement {

    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra một số là số chẵn hay là số lẻ(Sử dụng If đơn.)");
        System.out.println("Nhập vào một số nguyên:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println("Số nhập vào là số: " + i + " Đó là số chẵn!");
        }

    }
}
