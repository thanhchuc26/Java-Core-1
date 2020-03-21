//1. Khai báo biến local, nhập giá trị cho biến local từ bàn phím và in giá trị của biến local ra output.
package Session3_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        {
            System.out.println("Nhap vao gia tri cua i:");
            int bienLocal = nhap.nextInt();
            System.out.println("Gia tri cua i=" +bienLocal);
        }
    }
}
