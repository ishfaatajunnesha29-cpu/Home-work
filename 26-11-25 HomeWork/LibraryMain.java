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
public class LibraryMain
{
    public static void main(String[] args) 
    {
        Book b=new Book("Java","James Gosling");
        b.detail();
        
        Magazine m=new Magazine("Science Weekly",42);
        m.detail();
    }
    
}
