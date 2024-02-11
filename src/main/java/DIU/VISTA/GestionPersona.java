/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.VISTA;

import DIU.CONTROLADOR.PersonaControlador;
import DIU.MODELO.Persona;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefe
 */
public class GestionPersona extends javax.swing.JInternalFrame {
   
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
   
    /**
     * Creates new form Persona
     */
    public GestionPersona() {
        initComponents();
        setModelo();
    }

    
public void setModelo() {
        String[] cabecera = {"Nº","Cedula", "Nombres", "Apellidos", "Telefono", "Correo"};
        modelo.setColumnIdentifiers(cabecera);
        tblPersonas.setModel(modelo);
    }

public void setDatos() {
    limpiarTabla();

    int cont = 1;
    for (Persona puntero : listaPersonas) {
        Object[] filas = new Object[modelo.getColumnCount()];
        System.out.println("--" + puntero);
        filas[0] = cont;
        filas[1] = puntero.getCedula();
        filas[2] = puntero.getNombres();
        filas[3] = puntero.getApellidos();
        filas[4] = puntero.getTelefono();
        filas[5] = puntero.getCorreo();
        modelo.addRow(filas);
        cont++;
    }
    tblPersonas.setModel(modelo);
    
    txtCedulaP.setText("");
    txtNombres.setText("");
    txtApellidos.setText("");
    txtTelefono.setText("");
    txtCorreo.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        bttnActualizar = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        bttnCrear = new javax.swing.JButton();
        bttnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCedulaP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();

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

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 204));
        lblTitulo.setText("Bienvenido a la Gestión de Personas");

        lblNombres.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblNombres.setText("Nombres:");

        lblApellidos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblApellidos.setText("Apellidos:");

        lblTelefono.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");

        lblCorreo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCorreo.setText("Correo electrónico:");
        lblCorreo.setToolTipText("");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        bttnActualizar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bttnActualizar.setForeground(new java.awt.Color(0, 51, 204));
        bttnActualizar.setText("ACTUALIZAR");
        bttnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnActualizarActionPerformed(evt);
            }
        });

        bttnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        bttnEliminar.setForeground(new java.awt.Color(0, 51, 204));
        bttnEliminar.setText("ELIMINAR");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

        bttnCrear.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bttnCrear.setForeground(new java.awt.Color(0, 51, 204));
        bttnCrear.setText("CREAR");
        bttnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCrearActionPerformed(evt);
            }
        });

        bttnBuscar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bttnBuscar.setForeground(new java.awt.Color(0, 51, 204));
        bttnBuscar.setText("BUSCAR");
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("Cédula:");

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bttnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo)
                            .addComponent(lblTelefono)
                            .addComponent(lblNombres)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidos))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombres)
                            .addComponent(txtCedulaP)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnCrear)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(bttnBuscar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bttnActualizar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(bttnEliminar)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCrearActionPerformed
        // TODO add your handling code here:
        Persona P=new Persona(txtCedulaP.getText(), txtNombres.getText(), txtApellidos.getText(), txtTelefono.getText(), txtCorreo.getText());
        PersonaControlador pC = new PersonaControlador();
        pC.insertarPersona(P);
        listaPersonas.add(P);
        setDatos();
        limpiarTabla();
        cargarPersonas();
        tblPersonas.setModel(modelo);
    }//GEN-LAST:event_bttnCrearActionPerformed

    
    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed

        String cedula = txtCedulaP.getText();

        if (!cedula.isEmpty()) {
            limpiarTabla();
            PersonaControlador pC = new PersonaControlador();
            ArrayList<Object[]> listaFilas = pC.buscarPersona(cedula);

            if (listaFilas != null && !listaFilas.isEmpty()) {
                for (Object[] listaFila : listaFilas) {
                    modelo.addRow(listaFila);
                }
                tblPersonas.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la búsqueda.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cédula para buscar.");
        }
    }//GEN-LAST:event_bttnBuscarActionPerformed
    
    
    private void bttnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnActualizarActionPerformed
 String cedula = txtCedulaP.getText();
    String nuevosNombres = txtNombres.getText();
    String nuevosApellidos = txtApellidos.getText();
    String nuevoTelefono = txtTelefono.getText();
    String nuevoCorreo = txtCorreo.getText();

    if (!cedula.isEmpty()) {
        PersonaControlador pC = new PersonaControlador();
        boolean cedulaExiste = pC.existeCedula(cedula);

        if (cedulaExiste) {
            boolean actualizacionExitosa = pC.actualizarPersona(cedula, nuevosNombres, nuevosApellidos, nuevoTelefono, nuevoCorreo);
             JOptionPane.showMessageDialog(null, "Actualización exitosa");
                limpiarTabla();
                cargarPersonas();
         
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la actualización, cedula no existe.");
        }
    }
    }//GEN-LAST:event_bttnActualizarActionPerformed


    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
   limpiarTabla();
     cargarPersonas();    
    }//GEN-LAST:event_formInternalFrameActivated


    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        // TODO add your handling code here:
      try {
        String cedulaAEliminar = txtCedulaP.getText();

        int confirmacion = JOptionPane.showConfirmDialog(
            null,
            "¿Seguro que desea eliminar esta persona?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            PersonaControlador controlador = new PersonaControlador();
            controlador.eliminarPersona(cedulaAEliminar);

            limpiarTabla();
            cargarPersonas();
            JOptionPane.showMessageDialog(null, "Persona eliminada con éxito");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese una cédula válida para eliminar la persona.");
    }  
    }//GEN-LAST:event_bttnEliminarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed


    
    private void limpiarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

private void cargarPersonas() {
    PersonaControlador pC = new PersonaControlador();
    ArrayList<Object[]> listaFilas = pC.datosPersona();

    // Limpiar la tabla antes de cargar nuevos datos
    limpiarTabla();

    // Configurar el modelo de la tabla
    for (Object[] listaFila : listaFilas) {
        modelo.addRow(listaFila);
    }

    // Configurar la selección de la tabla
    tblPersonas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event) {
            cargarDatosPersonaSeleccionada(tblPersonas.getSelectedRow());
        }
    });

    tblPersonas.setModel(modelo);
}

    
    private void cargarDatosPersonaSeleccionada(int filaSeleccionada) {
     if (filaSeleccionada != -1) {
        String cedula = tblPersonas.getValueAt(filaSeleccionada, 1).toString();
        PersonaControlador pC = new PersonaControlador();
        ArrayList<Object[]> listaFilas = pC.buscarPersona(cedula);

        if (listaFilas != null && !listaFilas.isEmpty()) {
            Object[] datosPersona = listaFilas.get(0); // Tomamos la primera fila, ya que se supone que la cédula es única
            txtCedulaP.setText(datosPersona[1].toString());
            txtNombres.setText(datosPersona[2].toString());
            txtApellidos.setText(datosPersona[3].toString());
            txtTelefono.setText(datosPersona[4].toString());
            txtCorreo.setText(datosPersona[5].toString());
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnActualizar;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnCrear;
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedulaP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
