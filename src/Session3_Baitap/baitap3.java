//3. Khai báo biến static, nhập giá trị cho biến static từ bàn phím
//và in giá trị của biến static ra output.
package Session3_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap3 {

    static int bienStatic;

    public static void main(String[] args) {
        System.out.println("Nhap gia tri bien static:");
        Scanner nhap = new Scanner(System.in);
        bienStatic = nhap.nextInt();
        System.out.println("Gia tri cua bien static:" + bienStatic);
    }
}
