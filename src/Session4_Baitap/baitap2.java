//2. Viết một chương trình để nhắc người dùng nhập 3 số nguyên và tìm giá trị lớn nhất.
package Session4_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap2 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        int a = nhap.nextInt();
        System.out.print("Nhap gia tri b: ");
        int b = nhap.nextInt();
        System.out.print("Nhap gia tri c: ");
        int c = nhap.nextInt();
        int max;
        max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("Gia tri lon nhat cua a, b, c la: " + max);
    }
}
