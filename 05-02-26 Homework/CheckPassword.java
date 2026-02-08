/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpassword;

import static checkpassword.Password.checking;
import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class CheckPassword 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();
        
        System.out.println(checking(pass,pass.length()));
    }
    
}
