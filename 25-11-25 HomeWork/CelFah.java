/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author ISHFAA TAJ
 */
public class CelFah
{
   double celsius;
   
   CelFah(double celsius)
   {
       this.celsius=celsius;
   }
           
   public void fahren()
   {
       double fahrenheit=(celsius*9/5)+32;
       System.out.println(celsius+" in C = "+fahrenheit+" in F");
   }
}
