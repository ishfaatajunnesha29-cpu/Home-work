/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpperLowerCase;

/**
 *
 * @author ISHFAA TAJ
 */
public class UpperOrLower 
{
    public String cases(String str,int num)
    {
        if(num == 1)
        {
            return str.toUpperCase();
        }
        else if(num == 2)
        {
            return str.toLowerCase();
        }
        return str;
    }
}
