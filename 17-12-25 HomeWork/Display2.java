/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayOutput;

/**
 *
 * @author ISHFAA TAJ
 */
public class Display2 implements Runnable
{
    String message = "Can you tell me about Java.";
    
    @Override
    public void run()
    {
        for(int i=0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException obj)
            {
                System.out.println("Thread Interrupted");
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
