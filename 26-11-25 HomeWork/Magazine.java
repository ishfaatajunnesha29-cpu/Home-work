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
public class Magazine extends LibraryItem
{
    String name;
    int issue;
    Magazine(String name,int issue)
    {
        this.name=name;
        this.issue=issue;
    }
    void detail()
    {
        System.out.println("Magazine: "+name+" - issue"+issue);
    }
}
