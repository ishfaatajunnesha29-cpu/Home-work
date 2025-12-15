/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ISHFAA TAJ
 */
public class Vowel
{
    public int count(String word)
    {
        int count =0;
        for(int i=0;i<word.length();i++)
        {
        char c = Character.toLowerCase(word.charAt(i));

        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
             count++;
             break;   
        }
        }
        return count;
    }
}
