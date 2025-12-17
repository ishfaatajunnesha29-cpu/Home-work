/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideByZeroHW;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class DivideByZeroMain 
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int a = Sc.nextInt();
        System.out.print("Enter a Second number : ");
        int b = Sc.nextInt();
        
        Divide d = new Divide();
        d.divideCheck(a, b);
    }
    
}
