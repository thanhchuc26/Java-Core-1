/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example_Access_Modifier;

/**
 *
 * @author June
 */
import Example_Access_Modifier.Public1.*;
public class Public2 {
    
    public static void main(String[] args) {
        Public1 test = new Public1();
        test.msg();
    }
}
