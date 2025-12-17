/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomException;

/**
 *
 * @author ISHFAA TAJ
 */
public class AgeCheck 
{
    public void checking(int age) throws Exception
    {
        if(age>=18)
        {
            System.out.println("Your age is valid..");
        }
        else
        {
            throw new Exception("Sorry, Your age is not valid..");
        }
    }
}
