/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tajunnesha.myhomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class MyHomeWork
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int price[] = new int[100];
        ArrayList<Integer> priceList = new ArrayList<>();
        int count = 0;
        boolean option = true;
        
        while(option)
        {
            System.out.println("Menu: ");
            System.out.println("1. Add product prices to Array");
            System.out.println("2. Copy prices to ArrayList");
            System.out.println("3. Display prices");
            System.out.println("4. Find maximum price");
            System.out.println("5. Remove a price");
            System.out.println("6. Exit");
            
            int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1 ->
            {
                System.out.println("Enter number of count: ");
                count = sc.nextInt();
                System.out.println("Enter "+count+" prices: ");
                for(int i=0;i<count;i++)
                {
                    price[i]=sc.nextInt();
                }
                System.out.println("Prices stored");
            }
                
            case 2 -> 
            {
                priceList.clear();
                for(int i=0;i<count;i++)
                {
                    priceList.add(price[i]);
                }
                System.out.println("Prices copied to ArrayList");
            }
                
            case 3 -> 
            {
                System.out.println("Prices: ");
                for(int prices : priceList)
                {
                    System.out.println(prices+" ");
                }
                System.out.println();
            }
                
            case 4 ->
            {
                if(!priceList.isEmpty())
                {
                    int max = Collections.max(priceList);
                    System.out.println("Maximum price = "+max);
                }
                else
                {
                    System.out.println("Price List is Empty");
                }
            }
                
            case 5 -> 
            {
                System.out.println("Enter price to remove: ");
                int removePrice = sc.nextInt();
                if(priceList.remove(Integer.valueOf(removePrice)))
                {
                    System.out.println("Price "+removePrice+" removed");
                }
                else
                {
                    System.out.println("Price not found");
                }
            }
                
            case 6 -> 
            {
                System.out.println("Exit");
                option = false;
            }
                
            default -> System.out.println("Invalid choice");
        }
        }
    }
}
