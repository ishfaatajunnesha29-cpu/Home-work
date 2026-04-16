/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Map;


public class CollectionMap 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(101, "Tajunnesha");
        map.put(102, "Vishnu Vardhini");
        map.put(103, "Thaslimmineas");
        map.put(104, "Aashika Rani");
        
        System.out.println("Initial Map : "+map);
        
        String student = map.get(102);
        System.out.println("Student with ID 102 : " +student);
        
        map.put(104, "Hudha Rashmiya");
        System.out.println("After Updating ID 104 : "+map);
        
        map.remove(101);
        System.out.println("After removing ID 101 : "+map);
        
        System.out.println("*****Final Traversal*****");
        for(Map.Entry<Integer, String> students : map.entrySet())
        {
            System.out.println(students);
        }
        
    }
}
