/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.VISTA;

import DIU.CONTROLADOR.Controlador_resoluciones;
import DIU.MODELO.Resolucion;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefe
 */
public class Aceptar_pedidos extends javax.swing.JInternalFrame {

      ArrayList<Resolucion> listaResoluciones = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form Aceptar_pedidos
     */
    public Aceptar_pedidos() {
        initComponents();
        setModelo();
           tblRes.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            tblValueChanged(evt);
        }
    });
    }

public void setModelo() {
        String[] cabecera = {"Nº","Nº Pedido", "Fecha Resolucion", "Estado", "Guardar PDF"};
        modelo.setColumnIdentifiers(cabecera);
        tblRes.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPedido = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        bAprobado = new javax.swing.JRadioButton();
        bNoAprobado = new javax.swing.JRadioButton();
        txtGuardar = new javax.swing.JTextField();
        bttnRegistrarResolucion = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRes = new javax.swing.JTable();
        ABRIR = new javax.swing.JButton();
        PDFDOC = new javax.swing.JButton();
        BtnnBuscar = new javax.swing.JButton();

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

        jLabel1.setText("RESOLUCIONES POR APROBAR");

        jLabel2.setText("Nº del pedido");

        jLabel3.setText("Fecha de la resolucion");

        jLabel4.setText("Estado");

        jLabel5.setText("Guardar pdf");

        bAprobado.setText("APROBADO");

        bNoAprobado.setText("NO APROBADO");
        bNoAprobado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNoAprobadoActionPerformed(evt);
            }
        });

        bttnRegistrarResolucion.setText("REGISTRAR RESOLUCION");
        bttnRegistrarResolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegistrarResolucionActionPerformed(evt);
            }
        });

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        tblRes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRes);

        ABRIR.setText("ABRIR PDF DEL ESTUDIANTE");
        ABRIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABRIRActionPerformed(evt);
            }
        });

        PDFDOC.setText("ABRIR PDF DEL DGC");
        PDFDOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFDOCActionPerformed(evt);
            }
        });

        BtnnBuscar.setText("BUSCAR SOLICITUD");
        BtnnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PDFDOC)
                        .addGap(148, 148, 148)
                        .addComponent(bttnRegistrarResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ABRIR)))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAprobado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(txtPedido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(bNoAprobado))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(bAprobado)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bNoAprobado)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ABRIR)
                            .addComponent(BtnnBuscar))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PDFDOC)
                            .addComponent(bttnRegistrarResolucion)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(184, 184, 184))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 public void setDatos() {
    limpiarTabla();
    int cont = 1;
    for (Resolucion puntero : listaResoluciones) {
        Object[] filas = new Object[modelo.getColumnCount()];
        System.out.println("--" + puntero);
        filas[0] = cont;
        filas[1] = puntero.getNumeroPedido();
        filas[2] = puntero.getFechaResolucion();
        filas[3] = puntero.getEstadoAprobadoNoAprobado();
         filas[4] = puntero.getDescargarPdfAprobado(); // Asegúrate de tener este método en tu clase Resolucion
        modelo.addRow(filas);
        cont++;
    }
    
    tblRes.setModel(modelo);
    txtPedido.setText("");
    txtFecha.setText("");
    txtGuardar.setText("");
    bAprobado.setSelected(false); // Desmarcar el radio button Aprobado
    bNoAprobado.setSelected(false); // Desmarcar el radio button No Aprobado
   
}
    private void bNoAprobadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNoAprobadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNoAprobadoActionPerformed

 
    private void bttnRegistrarResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegistrarResolucionActionPerformed
 try {
        // Obtener datos de los componentes de la interfaz
        String numeroPedido = txtPedido.getText();
        Date fechaResolucion = Date.valueOf(txtFecha.getText());
        String estadoAprobadoNoAprobado = bAprobado.isSelected() ? "APROBADO" : "NO APROBADO";        
        String descargarPdfAprobado = txtGuardar.getText();
        Controlador_resoluciones controladorResoluciones = new Controlador_resoluciones();
        controladorResoluciones.registrarResolucion(numeroPedido, fechaResolucion, estadoAprobadoNoAprobado, descargarPdfAprobado);
        listaResoluciones = controladorResoluciones.obtenerResolucionesDesdeBaseDeDatos();
        setDatos();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al registrar la resolución: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bttnRegistrarResolucionActionPerformed

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        // TODO add your handling code here:
      if(evt.getOldValue() != null) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        txtFecha.setText(dateFormat.format(jCalendar1.getCalendar().getTime()));
    }
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarDatos(); // Carga datos solo si la lista está vacía
        setDatos();    
    }//GEN-LAST:event_formInternalFrameActivated

    private void ABRIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABRIRActionPerformed
        // TODO add your handling code here:
            int filaSeleccionada = tblRes.getSelectedRow();

    if (filaSeleccionada != -1) {
        String nombreArchivo = tblRes.getValueAt(filaSeleccionada, 4).toString();
        //SARA
        String rutaGuardar = "C:\\Users\\59399\\Documents\\PROGRAMACIÓN JAVA\\proyecto_aula\\Resoluciones-OSS\\src\\main\\java\\Oficio_Estudiantes\\";

        //ALEXIS
       // String rutaGuardar = "C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\Oficio_Estudiantes\\";
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

    }//GEN-LAST:event_ABRIRActionPerformed

    private void PDFDOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFDOCActionPerformed
        // TODO add your handling code here:
     int filaSeleccionada = tblRes.getSelectedRow();

    if (filaSeleccionada != -1) {
        String nombreArchivo = tblRes.getValueAt(filaSeleccionada, 4).toString();
        //SARA
        String rutaGuardar = "C:\\Users\\59399\\Documents\\PROGRAMACIÓN JAVA\\proyecto_aula\\Resoluciones-OSS\\src\\main\\java\\Oficio_DGC\\";

        //ALEXIS
        //String rutaGuardar = "C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\Oficio_DGC\\";
        
        
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
        
    }//GEN-LAST:event_PDFDOCActionPerformed

    private void BtnnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnnBuscarActionPerformed
        // TODO add your handling code here:
      try {
        String numeroPedido = txtPedido.getText();
        Controlador_resoluciones controladorResoluciones = new Controlador_resoluciones();
        listaResoluciones = controladorResoluciones.obtenerResolucionesPorNumeroPedido(numeroPedido);
        setDatos();
    } catch (Exception e) {
    }
    }//GEN-LAST:event_BtnnBuscarActionPerformed
    
    
    private void limpiarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public void cargarDatos() {
    try {
        Controlador_resoluciones controladorResoluciones = new Controlador_resoluciones();
        listaResoluciones = controladorResoluciones.obtenerResolucionesDesdeBaseDeDatos();
        setDatos();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos desde la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void tblValueChanged(javax.swing.event.ListSelectionEvent evt) {
    int filaSeleccionada = tblRes.getSelectedRow();
    if (filaSeleccionada != -1) {
        txtPedido.setText(tblRes.getValueAt(filaSeleccionada, 1).toString());
        txtFecha.setText(tblRes.getValueAt(filaSeleccionada, 2).toString());
        txtGuardar.setText(tblRes.getValueAt(filaSeleccionada, 4).toString());

        String estado = tblRes.getValueAt(filaSeleccionada, 3).toString();
        if (estado.equals("APROBADO")) {
            bAprobado.setSelected(true);
            bNoAprobado.setSelected(false);
        } else {
            bAprobado.setSelected(false);
            bNoAprobado.setSelected(true);
        }
    }
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABRIR;
    private javax.swing.ButtonGroup Botones;
    private javax.swing.JButton BtnnBuscar;
    private javax.swing.JButton PDFDOC;
    private javax.swing.JRadioButton bAprobado;
    private javax.swing.JRadioButton bNoAprobado;
    private javax.swing.JButton bttnRegistrarResolucion;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRes;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGuardar;
    private javax.swing.JTextField txtPedido;
    // End of variables declaration//GEN-END:variables
}
