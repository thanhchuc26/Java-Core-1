//2. Hay in ra 10 so nguyen duong dau tien chia het cho 5
package Session5_Baitap;

/**
 *
 * @author June
 */
public class baitap2 {

    public static void main(String[] args) {

        int i = 1, count = 0;
        System.out.println("10 so nguyen duong dau tien chia het cho 5 la: ");
        do {
            if ((i % 5 == 0)) {
                count++;
                System.out.println(i + "");
            }
            i++;
        } while (count < 10);
    }
}
