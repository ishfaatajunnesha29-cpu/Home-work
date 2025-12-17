/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathHelper;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class SquareMain 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any number to find its square : ");
        int n = Sc.nextInt();
        int res = SquareOfNumber.square(n);
        System.out.println("Square of "+n+" is : "+res);

    }
    
}

