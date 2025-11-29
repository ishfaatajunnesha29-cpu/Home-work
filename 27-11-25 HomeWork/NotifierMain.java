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
public class NotifierMain 
{
    public static void main(String[] args) 
    {
        Notifier en=new EmailNotifier();
        Notifier pn=new PushNotifier();
        
        en.notifyUser("Alert!");
        pn.notifyUser("Alert!");
    }
    
}
