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
public class ifelseifStatement {

    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra số nhập vào có bằng 1 hoặc 2 hay không?(sử dụng if else if)");
        System.out.println("Nhập vào 1 số bất kỳ:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Số nhập vào là số 1!");
        } else {
            if (i == 2) {
                System.out.println("Số nhập vào là số 2!");
            } else {
                System.out.println("Số nhập vào không phải số 1 và 2!");
            }
        }

    }
}
