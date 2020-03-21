//4. Viết chương trình nhập vào 2 số a và b và kiểm tra a có chia hết cho b hay không?
package Session4_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap4 {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();

        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        if (a % b == 0) {
            System.out.println("a chia hết cho b");
        } else {
            System.out.println("a không chia hết cho b");
        }
    }
}
