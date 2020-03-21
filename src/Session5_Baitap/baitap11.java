/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap11 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        int chieudai = nhap.nextInt();
        System.out.print("Nhap chieu cao cua hinh chu nhat: ");
        int chieucao = nhap.nextInt();
        for(int i=0;i<chieudai;i++)
            System.out.print("*");
        System.out.println("");
        for (int i = 2; i < chieucao; i++) {
            for (int j = 0; j < chieudai; j++) {
                if ((j == 0) || (j == (chieudai-1))) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for(int i=0;i<chieudai;i++)
            System.out.print("*");
    }
}
