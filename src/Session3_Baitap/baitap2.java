//2. Khai báo biến instance, nhập giá trị cho biến instance từ bàn phím và in giá trị của biến instance ra output.
package Session3_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap2 {

    int bienInstance;

    public baitap2(int i) {
        bienInstance = i;

    }

    public static void main(String[] args) {
        System.out.println("Nhap du lieu cho bien Instance:");
        Scanner nhap = new Scanner(System.in);
        int i = nhap.nextInt();
        baitap2 bien_Instance = new baitap2(i);
        System.out.println("Gia tri cua bien Instance:" + bien_Instance.bienInstance);
    }
}
