/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindPalindrome;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainPalindrome 
{
    public static void main(String[] args)
    {
        String str = "Json";
        CheckPalindrome cp = new CheckPalindrome();
        String rev = cp.find(str);
        
        if(str.equals(rev))
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
    
}
