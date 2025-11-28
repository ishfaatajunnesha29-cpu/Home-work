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
public class DataBaseMain
{
    public static void main(String[] args) 
    {
        DataBase od=new OracleDatabase();
        DataBase md=new MySQLDatabase();
        
        md.connect();
    }
}
