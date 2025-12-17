/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolNameTracker;

/**
 *
 * @author ISHFAA TAJ
 */
public class SchoolName 
{
    static String schoolName = "Saracens School";
    String studentName;
    
    SchoolName(String studentName) 
    {
        this.studentName = studentName;
    }


    
    void display()
    {
        System.out.println("School Name : "+schoolName);
        System.out.println("Student Name : "+studentName);
    }
}
