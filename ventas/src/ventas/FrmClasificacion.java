package ventas;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class FrmClasificacion extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmClasificacion.class.getName());
    char opc = 'Z';

    public FrmClasificacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
        setLocationRelativeTo(null);
    }

    void habilitarCampos(boolean estado) {
        txtId.setEnabled(false);
        txtNombre.setEnabled(estado);
    }

    void habilitarBotones(boolean estado) {
        btnAgregar.setEnabled(estado);
        btnBorrar.setEnabled(estado);
        btnActualizar.setEnabled(estado);
        btnGuardar.setEnabled(!estado);
    }

    void limpiarCampos() {
        txtId.setText(null);
        txtNombre.setText(null);
    }

    void actualizarGrilla() {
        String[] campos = {"id", "nombre"};
        Grilla.cargarGrilla(grdClasificaciones, "clasificacion", campos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtId = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JFormattedTextField();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        splClasificaciones = new javax.swing.JScrollPane();
        grdClasificaciones = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        lblbuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JFormattedTextField();
        lblIcon = new javax.swing.JLabel();
        cboCriterio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 135, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 124, 40));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 137, 40));

        txtId.setEditable(false);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 217, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("Código");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 126, -1));

        grdClasificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        splClasificaciones.setViewportView(grdClasificaciones);

        jPanel1.add(splClasificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 328, 282));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 127, 40));

        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbuscar.setText("Buscar");
        jPanel1.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 126, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 138, -1));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clasificaciones (2).png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 161, 153));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Clasificación" }));
        jPanel1.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 96, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        opc = 'N';
        habilitarCampos(true);
        habilitarBotones(false);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean guardado = false;
        String clasificacion = txtNombre.getText().toUpperCase();

        if (!txtNombre.getText().isEmpty()) {
            String sql = "select count(*) as can from clasificacion where nombre = '"
                    + clasificacion + "'";
            ResultSet rs = BaseDatos.consultar(sql);
            try {
                rs.first();
                if (rs.getInt("can") > 0) {
                    JOptionPane.showMessageDialog(null, "No se puede agregar la clasificaion porque ya existe");
                    txtNombre.requestFocus();
                } else {
                    if (opc == 'N') {
                        BaseDatos.insertarRegistro("clasificacion", "nombre", "'" + clasificacion + "'");

                    } else {
                        BaseDatos.actualizarRegistro("clasificacion", "nombre='" + clasificacion + "'",
                                "id=" + txtId.getText());
                    }
                    guardado = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmClasificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
            txtNombre.requestFocus();
        }

        if (guardado) {
            opc = 'Z';
            limpiarCampos();
            habilitarCampos(false);
            habilitarBotones(true);
            btnAgregar.requestFocus();
            actualizarGrilla();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (this.grdClasificaciones.getSelectedRow() > -1) {

            txtId.setText(grdClasificaciones.getValueAt(grdClasificaciones.getSelectedRow(), 0).toString());
            txtNombre.setText(grdClasificaciones.getValueAt(grdClasificaciones.getSelectedRow(), 1).toString());
            opc = 'M';
            habilitarBotones(false);
            habilitarCampos(true);
            txtNombre.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para actulizar");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int fila = grdClasificaciones.getSelectedRow();
        if (grdClasificaciones.getSelectedRow() > -1) {
            String id = grdClasificaciones.getValueAt(fila, 0).toString();
            String ca = grdClasificaciones.getValueAt(fila, 1).toString();
            int opcion = JOptionPane.showOptionDialog(null,
                    "¿Está seguro que desea ELIMINAR el registro de la CLASIFICACIÓN: " + ca + "?",
                    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Si", "No"}, "No");
            if (opcion == JOptionPane.YES_OPTION) {
                String sql = "select count(*) as can from articulo where clasificacion_id = " + id;
                ResultSet rs = BaseDatos.consultar(sql);
                try {
                    rs.first();
                    if (rs.getInt("can") > 0) {
                        JOptionPane.showMessageDialog(null,
                                "No se puede eliminar el registro porque pertenece a un artículo",
                                "Atención", JOptionPane.WARNING_MESSAGE);

                    } else {
                        BaseDatos.borrarRegistro("clasificacion", "id=" + grdClasificaciones.getValueAt(
                                grdClasificaciones.getSelectedRow(), 0).toString());
                        actualizarGrilla();
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(FrmClasificacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char e = evt.getKeyChar();
        if (!txtNombre.getText().isEmpty()) {
            if (e == KeyEvent.VK_ENTER) {
                btnGuardar.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Grilla.filtrarGrilla(grdClasificaciones, this.txtBuscar.getText(), cboCriterio.getSelectedIndex());
    }//GEN-LAST:event_txtBuscarKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmClasificacion dialog = new FrmClasificacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboCriterio;
    private javax.swing.JTable grdClasificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JScrollPane splClasificaciones;
    private javax.swing.JFormattedTextField txtBuscar;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JFormattedTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
