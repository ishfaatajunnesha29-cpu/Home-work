/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAuthentication;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainAuthentication 
{
    public static void main(String[] args)
    {
        Authenticator ad=new AdminAuth();
        Authenticator ua=new UserAuth();
        
        ad.login("admin", "admin123");
    }
    
}
