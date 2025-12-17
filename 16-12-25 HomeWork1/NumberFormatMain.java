/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberFormatException;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class NumberFormatMain 
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input= Sc.nextLine();
        
        NumberFormat nf = new NumberFormat();
        nf.number(input);
    }
    
}
