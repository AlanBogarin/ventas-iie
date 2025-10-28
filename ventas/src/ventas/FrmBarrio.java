package ventas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public final class FrmBarrio extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmBarrio.class.getName());

    private boolean nuevo = false;

    public FrmBarrio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Combo.cargarCombo(cboCiudad, "ciudad", "id,nombre", null);
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
        String[] campos = {"b.id", "b.nombre", "c.nombre"};
        String tabla = "barrio b inner join ciudad c on b.ciudad_id = c.id";
        Grilla.cargarGrilla(grdBarrios, tabla, campos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBarrio = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtId = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JFormattedTextField();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        splClasificaciones = new javax.swing.JScrollPane();
        grdBarrios = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JFormattedTextField();
        cboCriterio = new javax.swing.JComboBox<>();
        lblCiudad = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barrios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarrio.setBackground(new java.awt.Color(153, 204, 255));
        pnlBarrio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlBarrio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlBarrio.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 361, 135, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlBarrio.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 361, 124, 40));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        pnlBarrio.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 361, 137, 40));

        txtId.setEditable(false);
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlBarrio.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, 20));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlBarrio.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 20));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        pnlBarrio.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 20));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("ID");
        pnlBarrio.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 20));

        grdBarrios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nombre", "ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splClasificaciones.setViewportView(grdBarrios);

        pnlBarrio.add(splClasificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 71, 328, 282));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlBarrio.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 361, 127, 40));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");
        pnlBarrio.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, 40));

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlBarrio.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 20, 150, 40));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Barrio", "Ciudad" }));
        pnlBarrio.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 96, 40));

        lblCiudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCiudad.setText("Ciudad");
        pnlBarrio.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 20));

        cboCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboCiudadKeyTyped(evt);
            }
        });
        pnlBarrio.add(cboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 30));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comunidad.png"))); // NOI18N
        pnlBarrio.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 160));

        getContentPane().add(pnlBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 410));

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
        int ciudad_id = ((DatoCombo) cboCiudad.getSelectedItem()).toInt();
        if (nuevo) {
            BaseDatos.insertarRegistro("barrio", "nombre,ciudad_id",
                    "'" + nombre + "'," + ciudad_id);
        } else {
            String criterio = "id=" + txtId.getText();
            BaseDatos.actualizarRegistro("barrio",
                    "nombre='" + nombre + "',ciudad_id=" + ciudad_id, criterio);
        }
        limpiarCampos();
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
        btnAgregar.requestFocus();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (grdBarrios.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para modificar.");
            return;
        }
        txtId.setText(Grilla.getValorSeleccionado(grdBarrios, "id"));
        txtNombre.setText(Grilla.getValorSeleccionado(grdBarrios, "nombre"));
        String ciudad = (String) Grilla.getValorSeleccionado(grdBarrios, "ciudad");
        for (int idx = 0; idx < cboCiudad.getItemCount(); idx++) {
            DatoCombo item = cboCiudad.getItemAt(idx);
            if (ciudad.equals(item.toString())) {
                cboCiudad.setSelectedIndex(idx);
                break;
            }
        }
        nuevo = false;
        habilitarCampos(true);
        habilitarBotones(false);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(grdBarrios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
            return;
        }
        BaseDatos.borrarRegistro("barrio", "id=" + Grilla.getValorSeleccionado(grdBarrios, "id"));
        actualizarGrilla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char e  = evt.getKeyChar();
        if(!txtNombre.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                cboCiudad.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Grilla.filtrarGrilla(grdBarrios, txtBuscar.getText(), cboCriterio.getSelectedIndex());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cboCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCiudadKeyTyped
        char e  = evt.getKeyChar();
        if(!txtNombre.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                btnGuardar.requestFocus();
            }
        }
    }//GEN-LAST:event_cboCiudadKeyTyped

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
                FrmBarrio dialog = new FrmBarrio(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<DatoCombo> cboCiudad;
    private javax.swing.JComboBox<String> cboCriterio;
    private javax.swing.JTable grdBarrios;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlBarrio;
    private javax.swing.JScrollPane splClasificaciones;
    private javax.swing.JFormattedTextField txtBuscar;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JFormattedTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
