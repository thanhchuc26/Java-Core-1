//8. Viết chương trình nhập vào số nguyên N và tính tổng bình phương các số lẻ từ 1 đến N.
package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N: ");
        int n = s.nextInt();
        long tongBinhPhuongSoLe = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                tongBinhPhuongSoLe = tongBinhPhuongSoLe + (i * i);
            }
        }
        System.out.println("Tong binh phuong cac so le tu 1 den N la: " + tongBinhPhuongSoLe);
    }
}
