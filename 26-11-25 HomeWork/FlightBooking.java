/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelBooking;

/**
 *
 * @author ISHFAA TAJ
 */
public class FlightBooking extends Booking
{
    String name;
    String num;
    FlightBooking(String name,String num)
    {
        this.name=name;
        this.num=num;
    }
    void flight()
    {
        System.out.println("Flight: "+name+" - "+num);
    }
}
