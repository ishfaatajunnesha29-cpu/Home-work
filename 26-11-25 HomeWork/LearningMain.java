/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElearningSystem;

/**
 *
 * @author ISHFAA TAJ
 */
public class LearningMain
{
    public static void main(String[] args) 
    {
        Student s=new Student("Divya");
        s.message();
        
        Teacher t=new Teacher("Kumar");
        t.message();
    }
}
