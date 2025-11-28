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
public class AdminAuth implements Authenticator
{
    @Override
    public void login(String user,String pass)
    {
        System.out.println("Admin Login Successful");
    }
}
