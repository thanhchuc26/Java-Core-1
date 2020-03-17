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
public class Instance_variable {

    public int i;
    public static int j;

    public Instance_variable(int x) {
        i = x;
    }

    public static void main(String[] args) {
        Instance_variable var1 = new Instance_variable(1);
        System.out.println("Gia tri cua bien i:" + var1.i);
        j = 2;
        System.out.println("Gia tri cua bien j:" + j);
        {
            int local_variable;
            local_variable = 10;
            System.out.println("Gia tri cua bien local_variable: " + local_variable);
        }
    }

}
