//3. Hay yeu cau nguoi dung nhap vao 1 so le, neu khong dung yeu cau nhap lai.
package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int soLe;
        do {
            System.out.println("Hãy nhập vào 1 số lẻ: ");
            soLe = scanner.nextInt();
        } while (soLe % 2 == 0);
    }
}
