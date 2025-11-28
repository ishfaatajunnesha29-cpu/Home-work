/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionhomework;

/**
 *
 * @author ISHFAA TAJ
 */
public class SmartLightControl
{

    public static void main(String[] args) 
    {
        SmartDevice sb=new SmartBulb();
        SmartDevice sf=new SmartFan();
        
        sb.turnOn();
        
        sf.turnOn();
    }
    
}
