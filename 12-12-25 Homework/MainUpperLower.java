/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpperLowerCase;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainUpperLower
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in); 
        
        System.out.println("Press 1 for Uppercase");
        System.out.println("Press 2 for Lowercase");
        int num = Sc.nextInt();
        
        String str = "Mobile";
        UpperOrLower ul = new UpperOrLower();
        String res = ul.cases(str,num);
       
        if(num == 1)
        {
            System.out.println(res);
        }
        else if(num == 2)
        {
            System.out.println(res);
        }    
        else
        {
            System.out.println("Invalid");
        }
    }
    
}
