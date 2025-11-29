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
public class ExporterMain 
{
    public static void main(String[] args) 
    {
        Exporter csv=new CSVexporter();
        Exporter pdf=new PDFexporter();
        
        csv.export("CSV");
        pdf.export("PDF");
    }
}
