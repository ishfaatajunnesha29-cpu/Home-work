/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedTryCatch;

/**
 *
 * @author ISHFAA TAJ
 */
public class NestedTryCatchMain 
{
    public static void main(String[] args) 
    {
        int ar[] = {23,6,7,14,5,8,18};
        int index = 4;
        int num1 = 29;
        int num2 = 15;
        
        NestedTC ntc = new NestedTC();
        ntc.check(ar, index, num1, num2);
    }
    
}
