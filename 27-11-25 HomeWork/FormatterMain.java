/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageFormatters;

/**
 *
 * @author ISHFAA TAJ
 */
public class FormatterMain 
{
    public static void main(String[] args)
    {
        AbstractFormatter jf=new JsonFormatter();
        AbstractFormatter xf=new XmlFormatter();
        
        jf.format("Hello");
        xf.format("Hello");
    }
    
}
