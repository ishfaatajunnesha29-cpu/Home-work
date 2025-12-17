/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayIndexOutOfBounds;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class ArrayIndexMain 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        int ar[]=new int[5];
        
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("Enter a value for "+i+" index : ");
            ar[i] =Sc.nextInt();
            System.out.println();
        }
        
        try
        {
            System.out.print(" select the index which value you want to see : ");
            int i = Sc.nextInt();
            System.out.println("The value at "+i+" index is : "+ar[i]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Sorry, The index Exceeds the limit");
        }
        finally
        {
            System.out.println("Thank You...");
        }
    }
    
}
