/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AuthenticationMechanism;

/**
 *
 * @author ISHFAA TAJ
 */
public class AuthenticationMain 
{
    public static void main(String[] args)
    {
        Authenticator pa=new PasswordAuth();
        Authenticator ua=new UserAuth();
        
        pa.authenticate("User1", "Password");
        ua.authenticate("User1", "OTP");
    }
    
}
