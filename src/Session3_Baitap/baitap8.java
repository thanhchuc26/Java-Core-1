//8. Nhập vào 3 số nguyên từ bàn phím. Tìm giá trị trung bình của 3 số và in ra output.
package Session3_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap8 {

    public static void main(String[] args) {
        int a, b, c;
        float tbc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri a: ");
        a = scanner.nextInt();

        System.out.println("Nhap vao gia tri b: ");
        b = scanner.nextInt();

        System.out.println("Nhap vao gia tri c: ");
        c = scanner.nextInt();
                
        tbc = ((float) a + b + c) / 3;
        System.out.println("Trung binh cong cua 3 so la: " + tbc);
    }
}
