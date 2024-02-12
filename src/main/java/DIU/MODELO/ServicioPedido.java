/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.MODELO;

import DIU.CONTROLADOR.Controlador_pedido;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;



/**
 *
 * @author jefe
 */
public class ServicioPedido {
 private Controlador_pedido controladorPedido;

    public ServicioPedido() {
        this.controladorPedido = new Controlador_pedido();
    }

    public void generarYGuardarPedido(String numeroPedido, int cedula, String asunto, String fecha, String archivoPdf) throws FileNotFoundException, IOException, InvalidFormatException {
         
        XWPFDocument document = new XWPFDocument();
        //Agregar un párrafo vacío al principio del documento
        XWPFParagraph emptyParagraph = document.createParagraph();
        
        // Agregar la imagen al párrafo vacío 
        XWPFRun imageRun = emptyParagraph.createRun();
        FileInputStream imageStream = new FileInputStream("C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\resources\\logo-instituto.png");
        imageRun.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_PNG, "logo-instituto", Units.toEMU(100), Units.toEMU(100));
        imageStream.close();
        // Alinear el párrafo a la derecha
        emptyParagraph.setAlignment(ParagraphAlignment.RIGHT);
        
        // Agregar contenido al documento Word (ejemplo) 
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("OFICIO ESTUDIANTE IST 17 DE JULIO");
        run.setBold(true);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak(); 
        paragraph.createRun().setText("Número de Pedido: " + numeroPedido);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("El/La estudiante con el número de Cedula: " + cedula);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Solicita el día de hoy: " + fecha);
        paragraph.createRun().setText("Realizar una solicitud debido al asunto de: " + asunto);
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();
        paragraph.createRun().setText("Estimado/a Señor Director del Instituto superior Universitario 17 de Julio");
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().setText("Me dirijo a usted respetuosamente para presentar la siguiente"
               + " solicitud relacionada con "+archivoPdf);
        paragraph.createRun().addBreak();
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();         
        paragraph.createRun().setText("De antemano agradezco su atención ante el asunto de la solicitud");
        paragraph.createRun().addBreak(); 
        paragraph.createRun().setText("Sin más que decir me despido tenga un excelente  día");
        paragraph.createRun().addBreak();  
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();         
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak();  
        paragraph.createRun().addBreak(); 
        paragraph.createRun().addBreak(); 
        XWPFRun run2 = paragraph.createRun();
        run2.setText("Firma del represéntate:  "+" __________________");
        run2.setBold(true);
        paragraph.createRun().addBreak(); 

         try {
    // Parsear la fecha con el formato correcto
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaFormateada = new Date(dateFormat.parse(fecha).getTime());

    String rutaGuardar = "C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\Oficio_Estudiantes\\";

    // Guardar el documento Word
    String fileName = "OficioDGC_" + numeroPedido + ".docx";
    String rutaCompleta = rutaGuardar + fileName;

    // Guardar el documento Word
    try (FileOutputStream out = new FileOutputStream(rutaCompleta)) {
        document.write(out);
        System.out.println("Archivo Word guardado en: " + rutaCompleta); // Agregar este mensaje
    }

    // Obtener solo el nombre del archivo de la ruta completa
    File archivo = new File(rutaCompleta);
    String nombreArchivo = archivo.getName();

    // Llamada al controlador para insertar el pedido en la base de datos
    controladorPedido.insertarPedido(numeroPedido, cedula, asunto, fechaFormateada, nombreArchivo);

    // Agregar un mensaje después de la inserción en la base de datos
    System.out.println("Pedido insertado en la base de datos con éxito.");
} catch (IOException | NumberFormatException | ParseException e) {
    JOptionPane.showMessageDialog(null, "Error al procesar la fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
}
    }

}