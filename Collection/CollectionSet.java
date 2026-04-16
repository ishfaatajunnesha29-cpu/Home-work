/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author ISHFAA TAJ
 */
public class CollectionSet 
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        
        System.out.println("Initial Set : "+set);
        
        set.add(30);
        set.add(40);
        
        System.out.println("After adding duplicate value : "+set);
        
        set.remove(Integer.valueOf(20));
        
        System.out.println("After removing value 20 : "+set);
        
        System.out.println("*****Final Traversal*****");
        for(Integer st : set)
        {
            System.out.println(st);
        }
    }
}
