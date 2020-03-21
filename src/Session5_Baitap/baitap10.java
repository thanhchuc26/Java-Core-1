//10. Viết chương trình vẽ hình chữ nhật bằng các dấu *
//	**********
//	**********
//	**********
//	**********

package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap10 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        int chieudai=nhap.nextInt();
        System.out.println("Nhap chieu cao cua hinh chu nhat: ");
        int chieucao=nhap.nextInt();
        for(int i=0;i<chieucao;i++){
            for(int j=0;j<chieudai;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
