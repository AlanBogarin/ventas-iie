package ventas;

import javax.swing.JOptionPane;

public final class FrmArticulos extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmArticulos.class.getName());

    boolean nuevo = false;

    public FrmArticulos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Combo.cargarCombo(cboClasificacion, "clasificacion", "id,nombre", null);
        habilitarCampos(false);
        habilitarBotones(true);
        actualizarGrilla();
        pack();
        setLocationRelativeTo(parent);
    }

    void habilitarCampos(boolean estado) {
        txtId.setEnabled(false);
        txtNombre.setEnabled(estado);
        txtPrecio.setEnabled(estado);
        txtStock.setEnabled(estado);
        cboClasificacion.setEnabled(estado);
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
        txtPrecio.setText(null);
        txtStock.setText(null);
        cboClasificacion.setSelectedIndex(-1);
    }

    void actualizarGrilla() {
        Grilla.cargarGrilla(grdArticulos,
                "articulo a join clasificacion c on c.id = clasificacion_id",
                new String[]{"a.id", "a.nombre", "a.precio", "a.stock", "c.nombre"});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlArticulos = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        splArticulos = new javax.swing.JScrollPane();
        grdArticulos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        txtId = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JFormattedTextField();
        txtPrecio = new javax.swing.JFormattedTextField();
        txtStock = new javax.swing.JFormattedTextField();
        lblClasificacion = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        cboClasificacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulos\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlArticulos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlArticulos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlArticulos.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 124, 40));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlArticulos.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 135, 40));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        pnlArticulos.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 137, 40));

        grdArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "precio", "stock", "clasificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splArticulos.setViewportView(grdArticulos);

        pnlArticulos.add(splArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 65, 420, 244));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlArticulos.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 127, 40));
        pnlArticulos.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 87, 130, -1));
        pnlArticulos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 137, 130, -1));
        pnlArticulos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 187, 130, -1));
        pnlArticulos.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 237, 130, -1));

        lblClasificacion.setText("Clasificacion");
        pnlArticulos.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, -1));

        lblStock.setText("Stock");
        pnlArticulos.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 37, -1));

        lblPrecio.setText("Precio");
        pnlArticulos.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        lblNombre.setText("Nombre");
        pnlArticulos.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, -1));

        lblId.setText("ID");
        pnlArticulos.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 37, -1));

        cboClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClasificacionActionPerformed(evt);
            }
        });
        pnlArticulos.add(cboClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 20));

        getContentPane().add(pnlArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nuevo = true;
        limpiarCampos();
        habilitarCampos(true);
        habilitarBotones(false);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String id = txtId.getText();
        String nombre = txtNombre.getText().toUpperCase();
        String precioStr = txtPrecio.getText().toUpperCase();
        String stockStr = txtStock.getText().toUpperCase();
        int clasificacion_id = ((DatoCombo) cboClasificacion.getSelectedItem()).toInt();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
            txtNombre.requestFocus();
            return;
        }

        if (precioStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El precio no puede estar vacío");
            txtPrecio.requestFocus();
            return;
        }

        int precio = Integer.parseInt(precioStr);
        if (precio <= 0) {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0");
            txtPrecio.requestFocus();
            return;
        }

        if (stockStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El stock no puede estar vacío");
            txtStock.requestFocus();
            return;
        }
        int stock = Integer.parseInt(stockStr);
        if (stock < 0) {
            JOptionPane.showMessageDialog(null, "El stock no debe ser menor a 0");
            txtStock.requestFocus();
            return;
        }

        if (nuevo) {
            BaseDatos.insertarRegistro("articulo", "nombre,precio,stock,clasificacion_id",
                    "'" + nombre + "'," + precio + "," + stock + "," + clasificacion_id);
        } else {
            BaseDatos.actualizarRegistro("articulo", "nombre='" + nombre + "'"
                    + ",precio=" + precio + ",stock=" + stock + ",clasificacion_id="
                    + clasificacion_id, "id=" + id);
        }

        limpiarCampos();
        habilitarCampos(false);
        habilitarBotones(true);
        btnAgregar.requestFocus();
        actualizarGrilla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (grdArticulos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para actulizar");
            return;
        }
        txtId.setText(Grilla.getValorSeleccionado(grdArticulos, "id"));
        txtNombre.setText(Grilla.getValorSeleccionado(grdArticulos, "nombre"));
        txtPrecio.setText(Grilla.getValorSeleccionado(grdArticulos, "precio"));
        txtStock.setText(Grilla.getValorSeleccionado(grdArticulos, "stock"));
        String clasificacion = Grilla.getValorSeleccionado(grdArticulos, "clasificacion");
        for (int idx = 0; idx < cboClasificacion.getItemCount(); idx++) {
            DatoCombo item = cboClasificacion.getItemAt(idx);
            if (clasificacion.equals(item.toString())) {
                cboClasificacion.setSelectedItem(item);
                break;
            }
        }
        nuevo = false;
        habilitarBotones(false);
        habilitarCampos(true);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (grdArticulos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
            return;
        }
        BaseDatos.borrarRegistro("articulo", "id=" + (String) Grilla.getValorSeleccionado(grdArticulos, "id"));
        actualizarGrilla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cboClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboClasificacionActionPerformed

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
                FrmArticulos dialog = new FrmArticulos(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<DatoCombo> cboClasificacion;
    private javax.swing.JTable grdArticulos;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel pnlArticulos;
    private javax.swing.JScrollPane splArticulos;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JFormattedTextField txtNombre;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
