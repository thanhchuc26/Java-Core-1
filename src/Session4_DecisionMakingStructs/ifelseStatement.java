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
public class ifelseStatement {

    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra số nhập vào là số chẵn hay lẻ. Sử dụng if else!");
        System.out.println("Nhập vào số bất kì: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println("Số nhập vào là số chẵn!");
        } else {
            System.out.println("Số nhập vào là số lẻ");
        }
    }
}
