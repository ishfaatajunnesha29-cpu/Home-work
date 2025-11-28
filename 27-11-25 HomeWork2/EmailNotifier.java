/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationSystem;

/**
 *
 * @author ISHFAA TAJ
 */
public class EmailNotifier implements Notifier
{
    @Override
    public void send(String message)
    {
        System.out.println("Sending Email : "+message);
    }
}
