/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;


public class CollectionQueue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        
        System.out.println("Initial Queue : "+queue);
        
        int front = queue.peek();
        System.out.println("Front element : "+front);
        
        int remove = queue.poll();
        System.out.println("Removed element : "+remove);
        
        System.out.println("After Dequeue : "+queue);
        
        if(queue.isEmpty())
        {
            System.out.println("The queue is empty");
        }
        else
        {
            System.out.println("Queue is not empty and the size of the queus is "+queue.size());
        }
        
        System.out.println("*****Final Traversal*****");
        for(Integer que : queue)
        {
            System.out.println(que);
        }
    }
}
