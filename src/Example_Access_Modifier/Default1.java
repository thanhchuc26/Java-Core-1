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
public class Default1 {
   int i;
   void msg(){
//       public void msg(){
       System.out.println("Access Modifier: Default");
   }
    public static void main(String[] args) {
        Default1 test=new Default1();
        test.msg();
        
    }
}
