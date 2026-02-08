/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpassword;

/**
 *
 * @author ISHFAA TAJ
 */
public class Password 
{
    public static int checking(String str, int num)
    {
        if(num<4)
        {
            return 0;
        }
        if(Character.isDigit(str.charAt(0)))
        {
            return 0;
        }
        boolean digit = false;
        boolean uppercase = false;
        
        for(int i=0;i<num;i++)
        {
            char ch = str.charAt(i);
            
            if(ch==' '||ch=='/')
            {
                return 0;
            }
            if(Character.isDigit(ch))
            {
                digit = true;
            }
            if(Character.isUpperCase(ch))
            {
                uppercase = true;
            }
        }
        if(digit && uppercase)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
