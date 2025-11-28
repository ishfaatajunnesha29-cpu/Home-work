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
public class Report implements Printable
{
    @Override
    public void print(String work)
    {
        System.out.println(work+" Report");
    }
}
