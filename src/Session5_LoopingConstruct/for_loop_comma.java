/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5_LoopingConstruct;

/**
 *
 * @author June
 */
public class for_loop_comma {

    public static void main(String[] args) {
        int max = 10;
        for (int i = 0, j = max; i <= max; ++i, --j) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
    }
}
