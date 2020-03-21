//4. Yêu cầu người dùng nhập đúng yêu cầu: DIEM phải từ 0 đến 10 (dùng do ..while)
 
package Session5_Baitap;

import java.util.Scanner;

/**
 *
 * @author June
 */
public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Diem;
        do{
            System.out.println("Hay nhap diem(tu 0 den 10):");
            Diem = scanner.nextInt();
        }while((Diem<1)||(Diem>10));
    }
}
