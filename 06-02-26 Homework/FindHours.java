/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findhours;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ISHFAA TAJ
 */
public class FindHours 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<Integer> hours = Arrays.asList(3,7,5,9);
        
        int totalHour = 0;
        for(int hour : hours)
        {
            totalHour = totalHour+hour;
        }
        int highestHour = Collections.max(hours);
        System.out.println("Total Hour is: "+totalHour);
        System.out.println("Highest Hour is: "+highestHour);
    }
    
}
