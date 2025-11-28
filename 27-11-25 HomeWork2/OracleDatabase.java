/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseOperations;

/**
 *
 * @author ISHFAA TAJ
 */
public class OracleDatabase implements DataBase
{
    @Override
    public void connect()
    {
        System.out.println("Connected to Oracle database");
    }
    @Override
    public void disConnect()
    {
        System.out.println("Disconnected to Oracle database");
    }
}
