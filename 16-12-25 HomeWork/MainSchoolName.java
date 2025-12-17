/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolNameTracker;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainSchoolName
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter name of Student 1 : ");
        SchoolName s1 = new SchoolName(Sc.nextLine());
        
        System.out.print("Enter name of Student 2 : ");
        SchoolName s2 = new SchoolName(Sc.nextLine()); 
        
        System.out.print("Enter name of Student 3 : ");
        SchoolName s3 = new SchoolName(Sc.nextLine());
        System.out.println();
        
        System.out.println("*****Initial Student Details*****");
        System.out.println();
        s1.display();
        s2.display();
        s3.display();
        System.out.println();
        
        System.out.print("Enter new School Name : ");
        String newSchool = Sc.nextLine();
        SchoolName.schoolName = newSchool;
        System.out.println();
        
        System.out.println("*****Updated Student Details*****");
        System.out.println();
        s1.display();
        s2.display();
        s3.display();
    }
    
}
