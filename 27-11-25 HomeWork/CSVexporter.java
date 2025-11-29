/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataExporter;

/**
 *
 * @author ISHFAA TAJ
 */
public class CSVexporter extends Exporter
{
    @Override
    void export(String data)
    {
        System.out.println("Data Exported to "+data);
    }
}
