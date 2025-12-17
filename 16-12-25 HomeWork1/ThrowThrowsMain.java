/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowAndThrows;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class ThrowThrowsMain
{
    public static void main(String[] args) throws Exception 
    {
        System.out.print("Enter a number to check it is valid or not : ");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        
        ThrowThrows tt = new ThrowThrows();
        tt.checkNumber(num);
    }
    
}
