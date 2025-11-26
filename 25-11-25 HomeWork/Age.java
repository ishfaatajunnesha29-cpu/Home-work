/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgeValidator;

/**
 *
 * @author ISHFAA TAJ
 */
public class Age 
{
    int birthYear;
    int currentYear;
    Age(int birthYear,int currentYear)
    {
        this.birthYear=birthYear;
        this.currentYear=currentYear;
    }
    public void nowAge()
    {
        int age=currentYear-birthYear;
        System.out.println("Your Age in 2025 is: "+age);
    }
}
