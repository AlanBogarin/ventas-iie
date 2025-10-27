package ventas;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class FrmCiudad extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCiudad.class.getName());

    char opc = 'Z';
    private ResultSet rs;
    private BaseDatos bd;
    private Grilla grd=new Grilla();

    public FrmCiudad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        bd = new BaseDatos();
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

        jPanel1 = new javax.swing.JPanel();
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
        setTitle("Ciudades\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName("Ciudades"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 367, 135, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 367, 124, 40));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 367, 137, 40));

        txtId.setEditable(false);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 275, 210, 20));

        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 333, 210, 20));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 307, 210, 20));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 249, 210, 20));

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
        ));
        splClasificaciones.setViewportView(grdCiudad);

        jPanel1.add(splClasificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 71, 328, 282));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 367, 127, 40));

        lblId1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId1.setText("Buscar");
        jPanel1.add(lblId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 17, 126, -1));

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
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 43, 138, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mano.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 52, 179, 153));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Ciudad" }));
        cboCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboCriterioKeyReleased(evt);
            }
        });
        jPanel1.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 43, 96, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 560, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        opc = 'N';
        habilitarCampos(true);
        habilitarBotones(false);
        txtCiudad.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean guardado = false;
        String ciudad = txtCiudad.getText().toUpperCase();
        
            if(!txtCiudad.getText().isEmpty()){
                String sql = "select count(*) as can from ciudad where nombre = '" 
                        + ciudad  +"'";
                rs = bd.consultar(sql);
                try{
                    rs.first();
                    if(rs.getInt("can")>0){
                        JOptionPane.showMessageDialog(null, "No se puede agregar la ciudad porque ya existe");
                        txtCiudad.requestFocus();
                    }else{
                        if (opc == 'N') {
                            BaseDatos.insertarRegistro("ciudad", "nombre", "'" + ciudad + "'");
                            
                        }else{
                            BaseDatos.actualizarRegistro("ciudad", "nombre='" + ciudad + "'",
                            "id=" + txtId.getText());
                        }
                        guardado = true;
                    }
                }catch (SQLException ex){
                    Logger.getLogger(FrmCiudad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
                txtCiudad.requestFocus();
            }
                    
        
        if(guardado){
            opc = 'Z';
            limpiarCampos();
            habilitarCampos(false);
            habilitarBotones(true);
            btnAgregar.requestFocus();
            actualizarGrilla();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(this.grdCiudad.getSelectedRow()>-1){
            
        
            txtId.setText(grdCiudad.getValueAt(grdCiudad.getSelectedRow(), 0).toString());
            txtCiudad.setText(grdCiudad.getValueAt(grdCiudad.getSelectedRow(), 1).toString());
            opc = 'M';
            habilitarBotones(false);
            habilitarCampos(true);
            txtCiudad.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro para actulizar");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(grdCiudad.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
            return;
        }
        BaseDatos.borrarRegistro("ciudad", "id=" + Grilla.getValorSeleccionado(grdCiudad, "id"));
        actualizarGrilla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        char e  = evt.getKeyChar();
        if(!txtCiudad.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                btnGuardar.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        this.grd.filtrarGrilla(grdCiudad, this.txtBuscar.getText(), cboCriterio.getSelectedIndex());

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cboCriterioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCriterioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCriterioKeyReleased

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane splClasificaciones;
    private javax.swing.JFormattedTextField txtBuscar;
    private javax.swing.JFormattedTextField txtCiudad;
    private javax.swing.JFormattedTextField txtId;
    // End of variables declaration//GEN-END:variables
}
