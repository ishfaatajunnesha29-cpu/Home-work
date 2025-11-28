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
public class SmartFan extends SmartDevice
{
    @Override
    void turnOn()
    {
         System.out.println("Smart Fan is spinning");
    }
    @Override
    void turnOff()
    {
        System.out.println("Smart Fan is stopped");
    }
}
