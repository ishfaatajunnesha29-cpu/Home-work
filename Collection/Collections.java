/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISHFAA TAJ
 */
public class Collections
{
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        
        list.add(29);
        list.add(23);
        list.add(6);
        list.add(7);
        list.add(14);
        
        System.out.println("Initial List : "+list);
        
        list.add(3, 5);
        System.out.println("After insertion in index 3 : "+list);
        
        list.remove(Integer.valueOf(29));
        System.out.println("After remove 29 : "+list);
        
        list.set(2, 18);
        System.out.println("After updating index 2 : "+list);
        
        System.out.println("*****Final Traversal*****");
        for(Integer li : list)
        {
            System.out.println(li);
        }
    }
    
    
}
