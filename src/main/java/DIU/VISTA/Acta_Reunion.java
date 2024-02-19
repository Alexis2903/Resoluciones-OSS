/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.VISTA;

import DIU.CONTROLADOR.Controlador_Acta;
import DIU.MODELO.Reunion;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Acta_Reunion extends javax.swing.JInternalFrame {

      ArrayList<Reunion> listaReuniones = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();


    
    public Acta_Reunion() {
        initComponents();
        setModelo();
        getContentPane().setBackground(Color.WHITE); 

    }

    
public void setModelo() {
        String[] cabecera = {"Nº","Resolucion", "Fecha y hora", "Tipo", "Observaciones"};
        modelo.setColumnIdentifiers(cabecera);
        tblReuniones.setModel(modelo);
    }
    


 public void setDatos() {
    limpiarTabla();
    int cont = 1;
    for (Reunion puntero : listaReuniones) {
        Object[] filas = new Object[modelo.getColumnCount()];
        System.out.println("--" + puntero);
        filas[0] = cont;
        filas[1] = puntero.getIdResolucion();
        filas[2] = puntero.getFechaHora();
        filas[3] = puntero.getTipoOrdinariaExtraordinaria();
         filas[4] = puntero.getObservaciones(); // Asegúrate de tener este método en tu clase Resolucion
        modelo.addRow(filas);
        cont++;
    }
    
    tblReuniones.setModel(modelo);
    txtresolucion.setText("");
    txtHorayfecha.setText("");
    txtObservacioones.setText("");
    rbttnExtra.setSelected(false); // Desmarcar el radio button Aprobado
    rbttnOdinario.setSelected(false); // Desmarcar el radio button No Aprobado
  
}


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BttnRegistrar = new javax.swing.JButton();
        txtresolucion = new javax.swing.JTextField();
        txtHorayfecha = new javax.swing.JTextField();
        txtObservacioones = new javax.swing.JTextField();
        rbttnOdinario = new javax.swing.JRadioButton();
        rbttnExtra = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReuniones = new javax.swing.JTable();
        bttnver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ACTA REUNION");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Resolucion");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Fecha y Hora");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Observaciones");

        BttnRegistrar.setForeground(new java.awt.Color(0, 0, 255));
        BttnRegistrar.setText("Registrar Reunion");
        BttnRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BttnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnRegistrarActionPerformed(evt);
            }
        });

        rbttnOdinario.setText("ORDINARIO");

        rbttnExtra.setText("EXTRAUDINARIO");
        rbttnExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbttnExtraActionPerformed(evt);
            }
        });

        tblReuniones.setBackground(new java.awt.Color(153, 255, 255));
        tblReuniones.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tblReuniones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblReuniones);

        bttnver.setForeground(new java.awt.Color(0, 0, 255));
        bttnver.setText("Ver resoluciones aceptadas");
        bttnver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bttnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnverActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("DOCX ESTUDIANTE APROBADA");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("DOCX DGC APROBADA");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DDS2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbttnOdinario)
                                    .addComponent(rbttnExtra)
                                    .addComponent(txtHorayfecha)
                                    .addComponent(txtresolucion)
                                    .addComponent(txtObservacioones, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BttnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttnver, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtresolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHorayfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbttnOdinario)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbttnExtra)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtObservacioones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BttnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(bttnver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbttnExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbttnExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbttnExtraActionPerformed

    private void BttnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnRegistrarActionPerformed
  
        LocalDateTime fechaHoraActual = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String fechaHoraFormateada = fechaHoraActual.format(formatter);


    txtHorayfecha.setText(fechaHoraFormateada);
    int idResolucion = Integer.parseInt(txtresolucion.getText());
    String fechaHora = txtHorayfecha.getText();
    String tipoOrdinariaExtraordinaria = rbttnOdinario.isSelected() ? "ORDINARIO" : "EXTRAORDINARIO";
    String observaciones = txtObservacioones.getText();

    Controlador_Acta controlador = new Controlador_Acta();
    controlador.insertarActaReunion(idResolucion, fechaHora, tipoOrdinariaExtraordinaria, observaciones);
    setDatos();
    cargarDatos();
    }//GEN-LAST:event_BttnRegistrarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        setDatos();
        cargarDatos();
    }//GEN-LAST:event_formInternalFrameActivated

    private void bttnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnverActionPerformed
 try {
        Controlador_Acta controladorAprobadas = new Controlador_Acta();
        ArrayList<Controlador_Acta.ResolucionAprobada> resolucionesAprobadas = controladorAprobadas.obtenerResolucionesAprobadasDesdeBaseDeDatos();


        DefaultTableModel modeloAprobadas = new DefaultTableModel();
        String[] cabecera = {"ID Resolución", "Archivo PDF Aprobado"};
        modeloAprobadas.setColumnIdentifiers(cabecera);


        for (Controlador_Acta.ResolucionAprobada resolucion : resolucionesAprobadas) {
            Object[] fila = {resolucion.getIdResolucion(), resolucion.getArchivoPdfAprobado()};
            modeloAprobadas.addRow(fila);
        }


        tblReuniones.setModel(modeloAprobadas);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar las resoluciones aprobadas desde la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        
        
    }//GEN-LAST:event_bttnverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int filaSeleccionada = tblReuniones.getSelectedRow();

         if (filaSeleccionada != -1) {
         String nombreArchivo = tblReuniones.getValueAt(filaSeleccionada, 1).toString();

//SARA
          //String rutaGuardar = "C:\\Users\\59399\\Documents\\PROGRAMACIÓN JAVA\\proyecto_aula\\Resoluciones-OSS\\src\\main\\java\\Oficio_Estudiantes\\";

//ALEXIS
        String rutaGuardar = "C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\Oficio_Estudiantes\\";
        String rutaCompletaArchivo = rutaGuardar + nombreArchivo;

        try {
            java.awt.Desktop.getDesktop().open(new java.io.File(rutaCompletaArchivo));
        } catch (java.io.IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo Word.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un pedido antes de intentar abrir el Word.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int filaSeleccionada = tblReuniones.getSelectedRow();

    if (filaSeleccionada != -1) {
        String nombreArchivo = tblReuniones.getValueAt(filaSeleccionada, 1).toString();

         //SARA
        //String rutaGuardar = "C:\\Users\\59399\\Documents\\PROGRAMACIÓN JAVA\\proyecto_aula\\Resoluciones-OSS\\src\\main\\java\\Oficio_DGC\\";

 

        //ALEXIS 
        String rutaGuardar = "C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\Oficio_DGC\\";
        
        
        String rutaCompletaArchivo = rutaGuardar + nombreArchivo;

        System.out.println("Intentando abrir el archivo: " + rutaCompletaArchivo);

        try {
            java.awt.Desktop.getDesktop().open(new java.io.File(rutaCompletaArchivo));
        } catch (java.io.IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo Word.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un pedido antes de intentar abrir el Word.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
     
    }//GEN-LAST:event_jButton2ActionPerformed

 
    private void limpiarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
      
    public void cargarDatos() {
    try {
        Controlador_Acta controladorReuniones = new Controlador_Acta();
        listaReuniones = controladorReuniones.obtenerResolucionesDesdeBaseDeDatos();
        setDatos();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos desde la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttnRegistrar;
    private javax.swing.JButton bttnver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbttnExtra;
    private javax.swing.JRadioButton rbttnOdinario;
    private javax.swing.JTable tblReuniones;
    private javax.swing.JTextField txtHorayfecha;
    private javax.swing.JTextField txtObservacioones;
    private javax.swing.JTextField txtresolucion;
    // End of variables declaration//GEN-END:variables
}
