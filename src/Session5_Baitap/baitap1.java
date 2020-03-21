//1. Nhập vào từ bàn phím 1 số nguyên dương n, sau đó in ra từ 1 đến n có bao nhiêu số chia hết cho 3.
package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Tu 1 den " + n + " co " + count + " so chia het cho3");
    }
}
