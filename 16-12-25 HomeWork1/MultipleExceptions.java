/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleException;

/**
 *
 * @author ISHFAA TAJ
 */
public class MultipleExceptions 
{
    public void exceptions(int num1, int num2)
    {
        try
        {
            int res = num1/num2;
            System.out.println("Quotient for given values is : "+res);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Sorry, You entered a wrong digit. Please correct it.");
        }
        finally
        {
            System.out.println("Thank You..");
        }
    }
    public void arrayIndex(int ar[], int index)
    {
        try
        {
            System.out.println("The value located at "+index+" is : "+ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Sorry, You entered a wrong index. Please check it.");
        }
        finally
        {
            System.out.println("Thank you");
        }
    }
}
