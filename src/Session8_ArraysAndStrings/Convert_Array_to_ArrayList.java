/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8_ArraysAndStrings;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author June
 */
public class Convert_Array_to_ArrayList {

    public static void main(String[] args) {
        String[] arrStr = {"AAA", "BBB", "CCC", "DDD"};

        List list = Arrays.asList(arrStr);
//Để tạo một đối tưởng mới bạn sử dụng dòng code bên dưới.
//List list = new ArrayList(Arrays.asList(arrStr));

        System.out.println("ArrayList of list:" + list);
    }
}
