package ventas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FrmClientes extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmClientes.class.getName());

    private boolean nuevo = false;

    public FrmClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Combo.cargarCombo(cboCiudad, "ciudad", "id,nombre", null);
        Combo.cargarCombo(cboBarrio, "barrio", "id,nombre", null);
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
        setLocationRelativeTo(null);
    }

    private void habilitarCampos(boolean estado) {
        txtId.setEnabled(false);
        txtRuc.setEnabled(estado);
        txtNombre.setEnabled(estado);
        cboCiudad.setEnabled(estado);
        cboBarrio.setEnabled(estado);
        txtRuc.requestFocus();
    }

    private void habilitarBotones(boolean estado) {
        btnNuevo.setEnabled(estado);
        btnGuardar.setEnabled(!estado);
        btnModificar.setEnabled(estado);
        btnEliminar.setEnabled(estado);
        btnCancelar.setEnabled(!estado);
    }

    private void limpiarCampos() {
        txtId.setText(null);
        txtRuc.setText(null);
        txtNombre.setText(null);
        cboBarrio.setSelectedIndex(-1);
        cboBarrio.setSelectedIndex(-1);
    }

    private void actualizarGrilla() {
        String tabla = "cliente c join ciudad ci ON c.ciudad_id = ci.id "
                + "join barrio b ON c.barrio_id = b.id";
        Grilla.cargarGrilla(grdClientes, tabla, new String[]{
            "c.id",
            "c.nombre",
            "c.ruc",
            "ci.nombre AS ciudad",
            "b.nombre AS barrio"
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JFormattedTextField();
        lblRuc = new javax.swing.JLabel();
        txtRuc = new javax.swing.JFormattedTextField();
        lblCiudad = new javax.swing.JLabel();
        lblBarrio = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        cboBarrio = new javax.swing.JComboBox<>();
        splClientes = new javax.swing.JScrollPane();
        grdClientes = new javax.swing.JTable();
        lblIcon = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(720, 1440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 30));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 325, 30));

        lblRuc.setText("Ruc");
        jPanel1.add(lblRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 30));

        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });
        jPanel1.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 325, 30));

        lblCiudad.setText("Ciudad");
        jPanel1.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 20));

        lblBarrio.setText("Barrio");
        jPanel1.add(lblBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 20));

        cboCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCiudadItemStateChanged(evt);
            }
        });
        jPanel1.add(cboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 325, 20));

        jPanel1.add(cboBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 325, 20));

        grdClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grdClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "ruc", "ciudad", "barrio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splClientes.setViewportView(grdClientes);

        jPanel1.add(splClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 660, 182));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/public-service.png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 83, 114));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 31));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 31));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 90, 31));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 90, 31));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 90, 31));

        lblId.setText("Id");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 325, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 710, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarBotones(true);
        habilitarCampos(false);
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo = true;
        limpiarCampos();
        habilitarBotones(false);
        habilitarCampos(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int ciudad_id = ((DatoCombo) cboCiudad.getSelectedItem()).toInt();
        int barrio_id = ((DatoCombo) cboBarrio.getSelectedItem()).toInt();
        String nombre = txtNombre.getText().toUpperCase();
        String ruc = txtRuc.getText().toUpperCase();
        if (nuevo) {
            BaseDatos.insertarRegistro("cliente", "nombre,ruc,ciudad_id,barrio_id",
                    "'" + nombre + "','" + ruc + "'," + ciudad_id + "," + barrio_id);
        } else {
            String campos = "nombre='" + nombre + "', ruc='" + ruc + "', ciudad_id=" + ciudad_id + ", barrio_id=" + barrio_id;
            String criterio = "id=" + txtId.getText();
            BaseDatos.actualizarRegistro("cliente", campos, criterio);
        }
        limpiarCampos();
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (grdClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para modificar.");
            return;
        }
        txtId.setText((String) Grilla.getValorSeleccionado(grdClientes, "id"));
        txtNombre.setText((String) Grilla.getValorSeleccionado(grdClientes, "nombre"));
        txtRuc.setText((String) Grilla.getValorSeleccionado(grdClientes, "ruc"));

        String ciudad = (String) Grilla.getValorSeleccionado(grdClientes, "ciudad");
        for (int idx = 0; idx < cboCiudad.getItemCount(); idx++) {
            DatoCombo item = cboCiudad.getItemAt(idx);
            if (ciudad.equals(item.toString())) {
                cboCiudad.setSelectedIndex(idx);
                break;
            }
        }
        String barrio = (String) Grilla.getValorSeleccionado(grdClientes, "barrio");
        for (int idx = 0; idx < cboBarrio.getItemCount(); idx++) {
            DatoCombo item = cboBarrio.getItemAt(idx);
            if (barrio.equals(item.toString())) {
                cboBarrio.setSelectedIndex(idx);
                break;
            }
        }
        nuevo = false;
        habilitarCampos(true);
        habilitarBotones(false);
        txtRuc.setEnabled(false);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        BaseDatos.borrarRegistro("cliente", "id=" + (String) Grilla.getValorSeleccionado(grdClientes, "id"));
        this.actualizarGrilla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCiudadItemStateChanged
        DatoCombo item = (DatoCombo) cboCiudad.getSelectedItem();
        String condicion = item == null ? null : ("ciudad_id=" + item.toInt());
        Combo.cargarCombo(cboBarrio, "barrio", "DISTINCT id,nombre", condicion);
    }//GEN-LAST:event_cboCiudadItemStateChanged

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        char e  = evt.getKeyChar();
        if(!txtRuc.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                txtNombre.requestFocus();
            }
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char e  = evt.getKeyChar();
        if(!txtNombre.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                cboCiudad.requestFocus();
            }
        }    
    }//GEN-LAST:event_txtNombreKeyTyped

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
                FrmClientes dialog = new FrmClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<ventas.DatoCombo> cboBarrio;
    private javax.swing.JComboBox<ventas.DatoCombo> cboCiudad;
    private javax.swing.JTable grdClientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBarrio;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JScrollPane splClientes;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JFormattedTextField txtNombre;
    private javax.swing.JFormattedTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
