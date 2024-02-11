/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.MODELO;

import DIU.CONTROLADOR.Controlador_pedido;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


/**
 *
 * @author jefe
 */
public class ServicioPedido {
 private Controlador_pedido controladorPedido;

    public ServicioPedido() {
        this.controladorPedido = new Controlador_pedido();
    }

    public void generarYGuardarPedido(String numeroPedido, int cedula, String asunto, String fecha, String archivoPdf) {
        XWPFDocument document = new XWPFDocument();

        // Agregar contenido al documento Word (ejemplo)
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.createRun().setText("Número de Pedido: " + numeroPedido);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("El/La estudiante con el número de Cedula: " + cedula);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Solicita el día de hoy: " + fecha);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Realizar una solicitud debido al asunto de: " + asunto);
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak(); 
        paragraph.createRun().setText("Estimado/a Señor Director del Instituto superior Universitario 17 de Julio");
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak(); 
        paragraph.createRun().setText("Me dirijo a usted respetuosamente para presentar la siguiente"
               + " solicitud relacionada con "+archivoPdf);
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();         
        paragraph.createRun().setText("De antemano agradezco su atención ante el asunto de la solicitud");
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().setText("Sin más que decir me despido tenga un excelente  día");
        paragraph.createRun().addBreak();  
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();         
        paragraph.createRun().setText("Firma del represéntate:  "+" __________________");
        paragraph.createRun().addBreak(); 
        
        try {
            // Parsear la fecha con el formato correcto
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaFormateada = new Date(dateFormat.parse(fecha).getTime());

            // Guardar el documento Word
            String fileName = "Pedido_" + numeroPedido + ".docx";
            FileOutputStream out = new FileOutputStream(fileName);
            document.write(out);
            out.close();

            // Llamada al controlador para insertar el pedido en la base de datos
            controladorPedido.insertarPedido(numeroPedido, cedula, asunto, fechaFormateada, fileName);
        } catch (IOException | NumberFormatException | ParseException e) {
            e.printStackTrace();
        JOptionPane.showMessageDialog( null,  "Error solo los estudiantes pueden realizar esta solicitud ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }


}