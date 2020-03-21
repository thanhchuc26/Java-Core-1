//7. Nhập vào 3 số từ bàn phím. Dùng toán tử ?: để tìm giá trị lớn nhất của 3 số và in ra output.
package Session3_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap7 {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua a: ");
        a = nhap.nextInt();
        System.out.println("Nhap vao gia tri cua b: ");
        b = nhap.nextInt();
        System.out.println("Nhap vao gia tri cua c: ");
        c = nhap.nextInt();
        max = (a>c)?(a>b?a:b):(b>c?b:c);
        System.out.println("Gia tri lon nhat la: " +max);
    }
}
