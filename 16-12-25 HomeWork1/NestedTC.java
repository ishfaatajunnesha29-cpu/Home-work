/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedTryCatch;

/**
 *
 * @author ISHFAA TAJ
 */
public class NestedTC
{
    public void check(int ar[], int index, int num1, int num2)
    {
        try
        {
            System.out.println("Quotient of "+num1+" / "+num2+" is : "+num1/num2);
            try
            {
                System.out.println("The value located at an "+index+" index is : "+ar[index]);
            }
            catch(ArrayIndexOutOfBoundsException obj)
            {
                System.out.println("The index you entered is invalid..");
            }
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Sorry, It is invalid...");
        }
    }
}
