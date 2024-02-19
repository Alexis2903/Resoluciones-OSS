/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.VISTA;

import DIU.CONTROLADOR.Controlador_pedido;
import DIU.CONTROLADOR.Controlador_pedido_DCG;
import DIU.MODELO.Pedido;
import DIU.MODELO.ServicioPedido;
import java.awt.Color;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pedido_oficio extends javax.swing.JInternalFrame {

       ArrayList<Pedido> ListaPedidos = new ArrayList<>();
      DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Pedido_oficio
     */
    public Pedido_oficio() {
        initComponents();
         setModelo();
          tblPedidos.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            tblPedidosValueChanged(evt);
        }
    });
                   getContentPane().setBackground(Color.WHITE); 

    }
    
public void setModelo() {
    String[] cabecera = {"Nº Pedido", "Cedula", "Asunto", "Fecha", "Descripcion del asunto"};
    modelo.setColumnIdentifiers(cabecera);
    tblPedidos.setModel(modelo);
}


public void setDatos() {
    limpiarTabla(); 

    for (int i = 0; i < ListaPedidos.size(); i++) {
        Pedido puntero = ListaPedidos.get(i);
        Object[] filas = new Object[6]; 
        filas[0] = puntero.getNroPedido();
        filas[1] = puntero.getCedulaPersona();
        filas[2] = puntero.getAsunto();
        filas[3] = puntero.getFechaIngresoOficio();
        filas[4] = puntero.getArchivoPdf();
        filas[5] = puntero.getArchivoPdf(); 

        modelo.addRow(filas);
    }

    txtNumeroPedido.setText("");
    txtCedula.setText("");
    txtAsunto.setText("");
    txtFecha.setText("");
    txtArchivo.setText("");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        txtArchivo = new javax.swing.JTextField();
        bttnGenerarpdf = new javax.swing.JButton();
        bttnabrir = new javax.swing.JButton();
        bttneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        BttnBuscar = new javax.swing.JButton();

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

        jCalendar1.setBackground(new java.awt.Color(51, 51, 255));
        jCalendar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 0)));
        jCalendar1.setForeground(new java.awt.Color(204, 0, 0));
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Realizar Oficio de Gestores,Docentes,Coordinadores");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese el Nº Pedido");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese la cedula de la persona");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Ingrese el asunto");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese la fecha ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Ingrese una descripcion de lo que desea solicitar");

        bttnGenerarpdf.setText("GENERAR PDF ");
        bttnGenerarpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGenerarpdfActionPerformed(evt);
            }
        });

        bttnabrir.setText("ABRIR PDF ");
        bttnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnabrirActionPerformed(evt);
            }
        });

        bttneliminar.setText("ELIMINAR OFICIO");
        bttneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttneliminarActionPerformed(evt);
            }
        });

        tblPedidos.setBackground(new java.awt.Color(0, 255, 204));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblPedidos);

        BttnBuscar.setText("BUSCAR OFICIO");
        BttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bttneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnGenerarpdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnabrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BttnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnGenerarpdf)
                        .addGap(32, 32, 32)
                        .addComponent(bttnabrir)
                        .addGap(32, 32, 32)
                        .addComponent(BttnBuscar)
                        .addGap(29, 29, 29)
                        .addComponent(bttneliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange

     if(evt.getOldValue() != null){
         SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
         txtFecha.setText(ff.format(jCalendar1.getCalendar().getTime()));
    }        
        
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void bttnGenerarpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGenerarpdfActionPerformed
        try {
        ServicioPedido servicioPedido = new ServicioPedido();
        servicioPedido.generarYGuardarPedido(
            txtNumeroPedido.getText(),
                Integer.parseInt(txtCedula.getText()),
            txtAsunto.getText(),
            txtFecha.getText(),
            txtArchivo.getText()
        );
        setDatos();
        cargarPedidos();
        tblPedidos.setModel(modelo);
            System.out.println("Documento Word creado y pedido insertado correctamente.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error Nº de pedido igual a uno existente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bttnGenerarpdfActionPerformed

    private void bttnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnabrirActionPerformed
        // TODO add your handling code here:
    int filaSeleccionada = tblPedidos.getSelectedRow();

    if (filaSeleccionada != -1) {
        String nombreArchivo = tblPedidos.getValueAt(filaSeleccionada, 4).toString();
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
    }//GEN-LAST:event_bttnabrirActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        limpiarTabla();
        cargarPedidos();   
    }//GEN-LAST:event_formInternalFrameActivated

    private void BttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnBuscarActionPerformed
        // TODO add your handling code here:
      String numeroPedido = txtNumeroPedido.getText();

    if (!numeroPedido.isEmpty()) {
        // Llamar al controlador para buscar el pedido por número
        Controlador_pedido controladorPedido = new Controlador_pedido();
        ArrayList<Object[]> listaFilas = controladorPedido.buscarPedidoPorNumero(numeroPedido);

        if (!listaFilas.isEmpty()) {
            limpiarTabla();
            for (Object[] listaFila : listaFilas) {
                modelo.addRow(listaFila);
            }
            tblPedidos.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron pedidos con ese número.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Ingrese un número de pedido válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
        
    }//GEN-LAST:event_BttnBuscarActionPerformed


    private void bttneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttneliminarActionPerformed

    int filaSeleccionada = tblPedidos.getSelectedRow();

    if (filaSeleccionada != -1) {
        String nombreArchivo = tblPedidos.getValueAt(filaSeleccionada, 4).toString();
        String rutaGuardar = "C:\\Users\\jefe\\OneDrive\\Escritorio\\PROYECTO 3RO\\Resoluciones-OSS\\src\\main\\java\\Oficio_Estudiantes\\";
        String rutaCompletaArchivo = rutaGuardar + nombreArchivo;

        // Aquí obtenemos la ruta completa del archivo que deseamos eliminar
        File archivoEliminar = new File(rutaCompletaArchivo);

        if (archivoEliminar.exists()) {
            if (archivoEliminar.delete()) {
                System.out.println("Archivo eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un pedido antes de intentar eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    String numeroPedido = txtNumeroPedido.getText();

        if (!numeroPedido.isEmpty()) {
            // Llamar al controlador para eliminar el pedido y el documento
            Controlador_pedido_DCG controladorPedido = new Controlador_pedido_DCG();
            controladorPedido.eliminarPedido(numeroPedido);

            // Limpiar los campos y recargar la tabla después de la eliminación
            limpiarCampos();
            cargarPedidos();
            JOptionPane.showMessageDialog(this, "Pedido y documento eliminados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un pedido antes de intentar eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bttneliminarActionPerformed

    
    
    private void limpiarCampos() {
    txtNumeroPedido.setText("");
    txtCedula.setText("");
    txtAsunto.setText("");
    txtFecha.setText("");
    txtArchivo.setText("");
}

private void limpiarTabla() {
    int a = modelo.getRowCount() - 1;
    for (int i = a; i >= 0; i--) {
        modelo.removeRow(i);
    }
}

private void cargarPedidos() {
   
    Controlador_pedido controladorPedido = new Controlador_pedido();
    ArrayList<Object[]> listaFilas = controladorPedido.obtenerDatosPedidos();
    limpiarTabla();

    for (Object[] listaFila : listaFilas) {
        modelo.addRow(listaFila);
    }
   
    tblPedidos.setModel(modelo);
}

private void tblPedidosValueChanged(javax.swing.event.ListSelectionEvent evt) {
    int filaSeleccionada = tblPedidos.getSelectedRow();
    if (filaSeleccionada != -1) {
        txtNumeroPedido.setText(tblPedidos.getValueAt(filaSeleccionada, 0).toString());
        txtCedula.setText(tblPedidos.getValueAt(filaSeleccionada, 1).toString());
        txtAsunto.setText(tblPedidos.getValueAt(filaSeleccionada, 2).toString());
        txtFecha.setText(tblPedidos.getValueAt(filaSeleccionada, 3).toString());
        txtArchivo.setText(tblPedidos.getValueAt(filaSeleccionada, 4).toString());
    }
}
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttnBuscar;
    private javax.swing.JButton bttnGenerarpdf;
    private javax.swing.JButton bttnabrir;
    private javax.swing.JButton bttneliminar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumeroPedido;
    // End of variables declaration//GEN-END:variables
}
