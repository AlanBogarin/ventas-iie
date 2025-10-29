package ventas;

import java.awt.event.KeyEvent;
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
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        cboCriterio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulos\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlArticulos.setBackground(new java.awt.Color(153, 204, 255));
        pnlArticulos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
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
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splArticulos.setViewportView(grdArticulos);

        pnlArticulos.add(splArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 89, 420, 220));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlArticulos.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 127, 40));

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlArticulos.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 87, 130, 20));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlArticulos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 137, 130, 20));

        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        pnlArticulos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 187, 130, 20));

        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        pnlArticulos.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 237, 130, 20));

        lblClasificacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblClasificacion.setText("Clasificacion");
        pnlArticulos.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 20));

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStock.setText("Stock");
        pnlArticulos.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 37, 20));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrecio.setText("Precio");
        pnlArticulos.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 20));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        pnlArticulos.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 20));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("ID");
        pnlArticulos.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 37, 20));

        cboClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClasificacionActionPerformed(evt);
            }
        });
        pnlArticulos.add(cboClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 20));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlArticulos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 220, 40));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");
        pnlArticulos.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 70, 40));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "nombre", "precio", "stock", "clasificacion" }));
        pnlArticulos.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 40));

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

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char e  = evt.getKeyChar();
        if(!txtNombre.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                txtPrecio.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
         char e  = evt.getKeyChar();
        if(!txtPrecio.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                txtStock.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
          char e  = evt.getKeyChar();
        if(!txtStock.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                cboClasificacion.requestFocus();
            }
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (cboCriterio.getSelectedIndex() == -1) {
            return;
        }
        Grilla.filtrarGrilla(grdArticulos, txtBuscar.getText().toUpperCase(), cboCriterio.getSelectedIndex());
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
    private javax.swing.JComboBox<String> cboCriterio;
    private javax.swing.JTable grdArticulos;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel pnlArticulos;
    private javax.swing.JScrollPane splArticulos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JFormattedTextField txtNombre;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
