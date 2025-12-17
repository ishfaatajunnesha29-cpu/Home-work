/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleException;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class MultipleExceptionsMain
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a value for dividend : ");
        int num1 = Sc.nextInt();
        System.out.print("Enter a value for divisor : ");
        int num2 = Sc.nextInt();
        
        MultipleExceptions me = new MultipleExceptions();
        me.exceptions(num1, num2);
        System.out.println("******");
        
        System.out.print("Enter a length of an array : ");
        int len = Sc.nextInt();
        int ar[]=new int[len];
        
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter a value for "+i+" index : ");
            ar[i]=Sc.nextInt();
        }
        System.out.println();
        
        System.out.print("Enter a index position you want to view a value located in it : ");
        int index = Sc.nextInt();
        
        MultipleExceptions me1 = new MultipleExceptions();
        me1.arrayIndex(ar, index);
        
    }

    private static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
