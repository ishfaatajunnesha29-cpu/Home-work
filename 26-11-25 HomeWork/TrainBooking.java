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
public class TrainBooking extends Booking
{
    String name;
    String num;
    TrainBooking(String name,String num)
    {
        this.name=name;
        this.num=num;
    }
    void train()
    {
        System.out.println("Train: "+name+" - "+num);
    }
}
