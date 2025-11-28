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
class SmartBulb extends SmartDevice
{
    @Override
    void turnOn()
    {
        System.out.println("Smart Bulb is On");
    }
    @Override
    void turnOff()
    {
        System.out.println("Smart Bulb is Off");
    }
}
