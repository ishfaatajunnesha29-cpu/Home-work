/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintableDocument;

/**
 *
 * @author ISHFAA TAJ
 */
public class PrintDocumentMain 
{
    public static void main(String[] args) 
    {
        Printable in=new Invoice();
        Printable re=new Report();
        
        in.print("Printing");
        re.print("Printing");
    }
}
