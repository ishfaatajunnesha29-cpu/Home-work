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
abstract class Authenticator 
{
    abstract void authenticate(String user,String pass);
}
