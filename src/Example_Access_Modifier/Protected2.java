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
import Example_Access_Modifier.Protected1.*;
class Protected2 extends Protected1{
    public static void main(String[] args) {
        Protected2 test = new Protected2();
        test.msg();
    }
}
