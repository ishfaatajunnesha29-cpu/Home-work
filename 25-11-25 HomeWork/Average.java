/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamGrader;

/**
 *
 * @author ISHFAA TAJ
 */
public class Average 
{
    int mark1;
    int mark2;
    int mark3;
    Average(int mark1,int mark2,int mark3)
    {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public void grade()
    {
        int average=(mark1+mark2+mark3)/3;
        System.out.println("Average: "+average);
        if(average>=90)
        {
            System.out.println("Grade A");
        }
        else if(average>=80&&average<90)
        {
            System.out.println("Grade B");
        }
        else if(average>=70&&average<80)
        {
            System.out.println("Grade C");
        }
        else if(average>=50&&average<70)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
