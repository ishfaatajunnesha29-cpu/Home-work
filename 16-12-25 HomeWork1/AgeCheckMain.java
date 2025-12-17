/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomException;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class AgeCheckMain 
{
    public static void main(String[] args) throws Exception
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = Sc.nextInt();
        
        AgeCheck ac = new AgeCheck();
        ac.checking(age);
    }
    
}
