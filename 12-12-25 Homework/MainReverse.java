/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseHomework;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainReverse 
{
    public static void main(String[] args) 
    {
        String str = "Java";
        ReverseWord rw = new ReverseWord();
        String rev = rw.reverse(str);
        
        System.out.println("reverse of "+str+" is "+rev);
    }
    
}
