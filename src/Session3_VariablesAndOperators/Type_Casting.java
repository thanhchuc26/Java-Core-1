/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session3_VariablesAndOperators;

/**
 *
 * @author June
 */
public class Type_Casting {

    public static void main(String[] args) {
//        implicit type casting: ép kiểu ngầm định
//        kiểu dữ liệu đích phải lớn hơn kiểu dữ liệu nguồn
        int a = 1;
        float b = 10.9f;
        b = a; // đúng vì b có kiểu float lớn hơn kiểu dữ liệu int của a
        System.out.println("Giá trị của b:" + b);
        //a=b; sai vì a có kiểu dữ liệu nhỏ hơn b;
        //explicit type casting: ép kiểu tường minh
        a = (int) b;
        System.out.println("a=" + a);
    }
}
