//6. Viết chương trình nhập vào N số nguyên và tính tổng bậc 3 N số nguyên.

package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap6 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen N: ");
        int n=nhap.nextInt();
        long tong=0;
        for(int i=1;i<=n;i++)
            tong=tong+(i*i*i);
        System.out.println("Tong bac 3 cua N so nguyen la: "+tong);
    }
}
