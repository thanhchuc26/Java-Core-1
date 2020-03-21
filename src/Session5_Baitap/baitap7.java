//7. Viết chương trình tính tổng nghịch đảo của N số nguyên đầu tiên theo công thức
//S = 1 + 1/2 + 1/3 + … + 1/N
package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N: ");
        int n = s.nextInt();
        float tongNghichDao = 0;
        for (int i = 1; i < n; i++) {
            tongNghichDao = tongNghichDao + (1 / (float) i);
        }
        System.out.println("Tong nghich dao cua N so nguyen la: " + tongNghichDao);
    }
}
