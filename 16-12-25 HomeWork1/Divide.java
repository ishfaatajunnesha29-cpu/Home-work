/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideByZeroHW;

/**
 *
 * @author ISHFAA TAJ
 */
public class Divide
{
    public void divideCheck(int a,int b)
    {
        try
        {
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Sorry, You entered a wrong digit");
        }
        finally
        {
            System.out.println("Thank You");
        }
    }
}
