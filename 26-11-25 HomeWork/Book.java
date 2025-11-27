/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryItems;

/**
 *
 * @author ISHFAA TAJ
 */
public class Book extends LibraryItem
{
    String program;
    String name;
    Book(String program,String name)
    {
        this.program=program;
        this.name=name;
    }
    void detail()
    {
        System.out.println("Book: "+program+" by "+name);
    }
}
