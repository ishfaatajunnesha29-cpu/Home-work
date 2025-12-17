/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberFormatException;

/**
 *
 * @author ISHFAA TAJ
 */
public class NumberFormat 
{
    public void number(String input)
    {
        try
        {
        int n = Integer.parseInt(input);
        System.out.println("Number you entered is : "+input);
        }
        catch(NumberFormatException obj)
        {
            System.out.println("You Entered a invalid input, Please enter a numeric data");
        }
    }
}
