/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.ConcatHomeWork;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainConcat 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a first name : ");    
        String name1 = Sc.next();
        System.out.println();
        
        System.out.print("Enter a second name : ");    
        String name2 = Sc.next();
        System.out.println();
        
        ConcatName cn = new ConcatName();
        System.out.println(cn.name(name1, name2));
    }
    
}
