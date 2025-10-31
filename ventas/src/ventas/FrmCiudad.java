package ventas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public final class FrmCiudad extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCiudad.class.getName());

    boolean nuevo = false;

    public FrmCiudad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
        setLocationRelativeTo(null);
    }

    void habilitarCampos(boolean estado) {
        txtId.setEnabled(false);
        txtCiudad.setEnabled(estado);
    }

    void habilitarBotones(boolean estado) {
        btnAgregar.setEnabled(estado);
        btnBorrar.setEnabled(estado);
        btnActualizar.setEnabled(estado);
        btnGuardar.setEnabled(!estado);
    }

    void limpiarCampos() {
        txtId.setText(null);
        txtCiudad.setText(null);
    }

    void actualizarGrilla() {
        String[] campos = {"id", "nombre"};
        Grilla.cargarGrilla(grdCiudad, "ciudad", campos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCiudad = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtId = new javax.swing.JFormattedTextField();
        txtCiudad = new javax.swing.JFormattedTextField();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        splClasificaciones = new javax.swing.JScrollPane();
        grdCiudad = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        lblId1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboCriterio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCiudad.setBackground(new java.awt.Color(153, 204, 255));
        pnlCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlCiudad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlCiudad.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 135, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlCiudad.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 124, 40));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        pnlCiudad.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 137, 40));

        txtId.setEditable(false);
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCiudad.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 30));

        txtCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        pnlCiudad.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        pnlCiudad.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 20));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("ID");
        pnlCiudad.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 20));

        grdCiudad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        grdCiudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        grdCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splClasificaciones.setViewportView(grdCiudad);

        pnlCiudad.add(splClasificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 328, 282));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlCiudad.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 127, 40));

        lblId1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId1.setText("Buscar");
        pnlCiudad.add(lblId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, -1));

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlCiudad.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 220, 30));
        pnlCiudad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mano.png"))); // NOI18N
        pnlCiudad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 200));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Ciudad" }));
        pnlCiudad.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 96, 30));

        getContentPane().add(pnlCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nuevo = true;
        habilitarCampos(true);
        habilitarBotones(false);
        txtCiudad.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String ciudad = txtCiudad.getText().toUpperCase();

        if (txtCiudad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
            txtCiudad.requestFocus();
            return;
        }
        if (nuevo) {
            BaseDatos.insertarRegistro("ciudad", "nombre", "'" + ciudad + "'");
        } else {
            BaseDatos.actualizarRegistro("ciudad", "nombre='" + ciudad + "'",
                    "id=" + txtId.getText());
        }
        limpiarCampos();
        habilitarCampos(false);
        habilitarBotones(true);
        btnAgregar.requestFocus();
        actualizarGrilla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (this.grdCiudad.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para actulizar");
            return;
        }
        nuevo = false;
        txtId.setText(Grilla.getValorSeleccionado(grdCiudad, "id"));
        txtCiudad.setText(Grilla.getValorSeleccionado(grdCiudad, "nombre"));
        habilitarBotones(false);
        habilitarCampos(true);
        txtCiudad.requestFocus();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (grdCiudad.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
            return;
        }
        BaseDatos.borrarRegistro("ciudad", "id=" + Grilla.getValorSeleccionado(grdCiudad, "id"));
        actualizarGrilla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        char e = evt.getKeyChar();
        if (!txtCiudad.getText().isEmpty()) {
            if (e == KeyEvent.VK_ENTER) {
                btnGuardar.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (cboCriterio.getSelectedIndex() == -1) {
            return;
        }
        Grilla.filtrarGrilla(grdCiudad, txtBuscar.getText().toUpperCase(), cboCriterio.getSelectedIndex());
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
                FrmCiudad dialog = new FrmCiudad(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable grdCiudad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlCiudad;
    private javax.swing.JScrollPane splClasificaciones;
    private javax.swing.JFormattedTextField txtBuscar;
    private javax.swing.JFormattedTextField txtCiudad;
    private javax.swing.JFormattedTextField txtId;
    // End of variables declaration//GEN-END:variables
}
