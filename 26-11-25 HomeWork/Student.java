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
public class Student extends User
{
    String name;
    Student(String name)
    {
        this.name=name;
    }
    void message()
    {
        System.out.println("Welcome Student: "+name);
    }
}
