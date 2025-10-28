package ventas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public final class FrmClasificacion extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmClasificacion.class.getName());

    private boolean nuevo = false;

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
        Grilla.cargarGrilla(grdClasificaciones, "clasificacion",
                new String[]{"id", "nombre"});
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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 135, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 124, 40));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 137, 40));

        txtId.setEditable(false);
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 217, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 126, -1));

        grdClasificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "nombre"
            }
        ));
        splClasificaciones.setViewportView(grdClasificaciones);

        jPanel1.add(splClasificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 328, 270));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 127, 40));

        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbuscar.setText("Buscar");
        jPanel1.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 126, -1));

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 50, 210, -1));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clasificaciones (2).png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 161, 153));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Clasificación" }));
        cboCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCriterioActionPerformed(evt);
            }
        });
        jPanel1.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 96, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nuevo = true;
        habilitarCampos(true);
        habilitarBotones(false);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText().toUpperCase();
        if (nuevo) {
            BaseDatos.insertarRegistro("clasificacion", "nombre", "'" + nombre + "'");
        } else {
            String criterio = "id=" + txtId.getText();
            BaseDatos.actualizarRegistro("clasificacion",
                    "nombre='" + nombre + "'", criterio);
        }
        limpiarCampos();
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
        btnAgregar.requestFocus();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (grdClasificaciones.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para modificar.");
            return;
        }
        txtId.setText(Grilla.getValorSeleccionado(grdClasificaciones, "id"));
        txtNombre.setText(Grilla.getValorSeleccionado(grdClasificaciones, "nombre"));
        nuevo = false;
        habilitarBotones(false);
        habilitarCampos(true);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (grdClasificaciones.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
            return;
        }
        BaseDatos.borrarRegistro("clasificacion", "id=" + Grilla.getValorSeleccionado(grdClasificaciones, "id"));
        actualizarGrilla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char e = evt.getKeyChar();
        if (!txtNombre.getText().isEmpty()) {
            if (e == KeyEvent.VK_ENTER) {
                btnGuardar.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Grilla.filtrarGrilla(grdClasificaciones, this.txtBuscar.getText(),
                cboCriterio.getSelectedIndex());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cboCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCriterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCriterioActionPerformed

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
