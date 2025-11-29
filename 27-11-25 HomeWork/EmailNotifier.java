/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationChannels;

/**
 *
 * @author ISHFAA TAJ
 */
public class EmailNotifier extends Notifier
{
    @Override
    void notifyUser(String message)
    {
        System.out.println("Email sent: "+message);
    }
}
