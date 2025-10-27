package ventas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class FrmVentas extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmVentas.class.getName());

    public FrmVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnBuscarCliente.requestFocus();
        limpiarVenta();
    }

    void limpiarVenta() {
        Object[] fila = BaseDatos.getPrimeraFila("SELECT MAX(id) FROM venta");
        int ventaId = fila.length == 0 ? 1 : ((Number) fila[0]).intValue();
        txtVentaId.setText(String.valueOf(ventaId));
        txtClienteId.setText(null);
        txtCliente.setText(null);
        txtRuc.setText(null);
        String fecha = java.time.LocalDate.now().toString();
        txtFecha.setText(fecha);
        txtTotal.setText("0");
        ((DefaultTableModel) grdArticulos.getModel()).setRowCount(0);
    }

    void limpiarArticulo() {
        txtArticuloId.setText(null);
        txtArticulo.setText(null);
        txtCantidad.setText("0");
        txtStock.setText("0");
        txtPrecio.setText("0");
        txtSubTotal.setText("0");
    }

    private void actualizarTotalFactura() {
        DefaultTableModel modelo = (DefaultTableModel) grdArticulos.getModel();
        int total = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String valor = modelo.getValueAt(i, 4).toString(); // columna subtotal
            try {
                total += Integer.parseInt(valor);
            } finally {
            }
        }
        txtTotal.setValue(String.valueOf(total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splArticulos = new javax.swing.JScrollPane();
        grdArticulos = new javax.swing.JTable();
        pnlVenta = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblVentaId = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblClienteId = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        txtVentaId = new javax.swing.JFormattedTextField();
        txtCliente = new javax.swing.JFormattedTextField();
        txtClienteId = new javax.swing.JFormattedTextField();
        txtRuc = new javax.swing.JFormattedTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarRuc = new javax.swing.JButton();
        pnlArticulo = new javax.swing.JPanel();
        lblArticuloId = new javax.swing.JLabel();
        txtArticuloId = new javax.swing.JFormattedTextField();
        lblArticulo = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JFormattedTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JFormattedTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JFormattedTextField();
        btnAgregarArticulo = new javax.swing.JButton();
        btnBuscarArticulo = new javax.swing.JButton();
        lblSubTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JFormattedTextField();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarVenta = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(720, 1440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grdArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "cantidad", "precio", "sutotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splArticulos.setViewportView(grdArticulos);

        getContentPane().add(splArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 450, 300));

        pnlVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la venta"));
        pnlVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("Fecha");
        pnlVenta.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 56, 20));

        lblVentaId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVentaId.setText("ID Venta");
        pnlVenta.add(lblVentaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 56, 20));

        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCliente.setText("Cliente");
        pnlVenta.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 56, 20));

        lblClienteId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClienteId.setText("ID Cliente");
        pnlVenta.add(lblClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 56, 20));

        lblRuc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRuc.setText("Ruc");
        pnlVenta.add(lblRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 56, 20));

        txtFecha.setEditable(false);
        pnlVenta.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 125, 20));

        txtVentaId.setEditable(false);
        pnlVenta.add(txtVentaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 125, 20));

        txtCliente.setEnabled(false);
        pnlVenta.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 125, 20));

        txtClienteId.setEnabled(false);
        txtClienteId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteIdKeyReleased(evt);
            }
        });
        pnlVenta.add(txtClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 125, 20));

        txtRuc.setEnabled(false);
        pnlVenta.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 125, 20));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarCliente.setBorder(null);
        btnBuscarCliente.setContentAreaFilled(false);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        pnlVenta.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 20, 20));

        btnBuscarRuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarRuc.setBorder(null);
        btnBuscarRuc.setContentAreaFilled(false);
        btnBuscarRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRucActionPerformed(evt);
            }
        });
        pnlVenta.add(btnBuscarRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 20, 20));

        getContentPane().add(pnlVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 130));

        pnlArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de factura"));
        pnlArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArticuloId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArticuloId.setText("ID Articulo");
        pnlArticulo.add(lblArticuloId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 20));

        txtArticuloId.setEnabled(false);
        pnlArticulo.add(txtArticuloId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 125, -1));

        lblArticulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArticulo.setText("Articulo");
        pnlArticulo.add(lblArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        txtArticulo.setEnabled(false);
        pnlArticulo.add(txtArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 125, -1));

        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Precio");
        pnlArticulo.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 56, 20));

        txtPrecio.setEditable(false);
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setText("0");
        pnlArticulo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 125, -1));

        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidad.setText("Cantidad");
        pnlArticulo.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.setText("0");
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        pnlArticulo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 125, -1));

        btnAgregarArticulo.setText("Agregar");
        btnAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArticuloActionPerformed(evt);
            }
        });
        pnlArticulo.add(btnAgregarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        btnBuscarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarArticulo.setBorder(null);
        btnBuscarArticulo.setContentAreaFilled(false);
        btnBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArticuloActionPerformed(evt);
            }
        });
        pnlArticulo.add(btnBuscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 20, 20));

        lblSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubTotal.setText("SubTotal");
        pnlArticulo.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 56, 20));

        txtSubTotal.setEditable(false);
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubTotal.setText("0");
        pnlArticulo.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 125, -1));

        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock.setText("Stock");
        pnlArticulo.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 56, 20));

        txtStock.setEditable(false);
        txtStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStock.setText("0");
        pnlArticulo.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 125, -1));

        getContentPane().add(pnlArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 460, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Factura"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarVenta.setText("Guardar");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 80, 40));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Total");
        jPanel3.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 60, 20));

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0");
        txtTotal.setEnabled(false);
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 125, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 930, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteIdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            FrmCiudad ciudad = new FrmCiudad(null, true);
            ciudad.setVisible(true);
        }
    }//GEN-LAST:event_txtClienteIdKeyReleased

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        new FrmBuscarVenta(this, false, "cliente", "id,nombre", null, (DatoCombo item) -> {
            txtClienteId.setText(String.valueOf(item.toInt()));
            txtCliente.setText(item.toString());
            Object[] fila = BaseDatos.getPrimeraFila("SELECT id,ruc FROM cliente WHERE id=" + item.toInt());
            txtRuc.setText((String) fila[1]);
        }).setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRucActionPerformed
        new FrmBuscarVenta(this, false, "cliente", "id,ruc", null, (DatoCombo item) -> {
            txtClienteId.setText(String.valueOf(item.toInt()));
            txtRuc.setText(item.toString());
            Object[] fila = BaseDatos.getPrimeraFila("SELECT id,cliente FROM cliente WHERE id=" + item.toInt());
            txtCliente.setText((String) fila[1]);
        }).setVisible(true);
    }//GEN-LAST:event_btnBuscarRucActionPerformed

    private void btnBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArticuloActionPerformed
        limpiarArticulo();
        new FrmBuscarVenta(this, false, "articulo", "id,nombre", null, (DatoCombo item) -> {
            txtArticuloId.setText(String.valueOf(item.toInt()));
            txtArticulo.setText(item.toString());
            Object[] fila = BaseDatos.getPrimeraFila("SELECT id,stock,precio FROM articulo WHERE id=" + item.toInt());
            txtStock.setText(((Number) fila[1]).toString());
            txtPrecio.setText(((Number) fila[2]).toString());
        }).setVisible(true);
    }//GEN-LAST:event_btnBuscarArticuloActionPerformed

    private void btnAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArticuloActionPerformed
        if (txtArticuloId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(btnAgregarArticulo, "No se ha detectado el articulo a agregar");
            btnBuscarArticulo.requestFocus();
            return;
        }
        int stock = Integer.parseInt(txtStock.getText());
        if (stock <= 0) {
            JOptionPane.showMessageDialog(btnAgregarArticulo, "Este articulo no tiene stock");
            btnBuscarArticulo.requestFocus();
            return;
        }
        String cantidad = txtCantidad.getText();
        if (Integer.parseInt(cantidad) <= 0) {
            JOptionPane.showMessageDialog(btnAgregarArticulo, "Agregue la cantidad a vender");
            txtCantidad.requestFocus();
            return;
        }

        // Obtener los datos de los campos
        String id = txtArticuloId.getText();
        String nombre = txtArticulo.getText();
        String precio = txtPrecio.getText();
        String subtotal = txtSubTotal.getText();

        // Agregar la fila a la tabla
        DefaultTableModel modelo = (DefaultTableModel) grdArticulos.getModel();
        modelo.addRow(new Object[]{id, nombre, cantidad, precio, subtotal});

        // Actualizar el total general
        actualizarTotalFactura();

        limpiarArticulo();
    }//GEN-LAST:event_btnAgregarArticuloActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        String sCantidad = txtCantidad.getText();
        if (sCantidad.isEmpty()) {
            txtCantidad.setText("0");
            sCantidad = "0";
        }
        int cantidad = Integer.parseInt(sCantidad);
        int precio = Integer.parseInt(txtPrecio.getText());
        int subtotal = cantidad * precio;
        txtSubTotal.setText(String.valueOf(subtotal));
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed
        if (txtClienteId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente antes de guardar la venta.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) grdArticulos.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Debe agregar al menos un artículo a la venta.");
            return;
        }

        // --- Obtener los datos de la cabecera de venta ---
        String clienteId = txtClienteId.getText();
        String fecha = java.time.LocalDate.now().toString();

        // --- Insertar en tabla venta ---
        boolean ok = BaseDatos.insertarRegistro(
                "venta",
                "cliente_id, fecha",
                clienteId + ", '" + fecha + "'"
        );

        if (!ok) {
            JOptionPane.showMessageDialog(this, "No se pudo registrar la venta.");
            return;
        }

        // --- Obtener el ID generado (último ID) ---
        Object[] filaVenta = BaseDatos.getPrimeraFila("SELECT MAX(id) FROM venta");
        if (filaVenta.length == 0) {
            JOptionPane.showMessageDialog(this, "Error al obtener el ID de la venta guardada.");
            return;
        }
        int ventaId = ((Number) filaVenta[0]).intValue();

        // --- Insertar los artículos ---
        for (int i = 0; i < modelo.getRowCount(); i++) {
            int articuloId = Integer.parseInt(modelo.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(modelo.getValueAt(i, 2).toString());
            int precio = Integer.parseInt(modelo.getValueAt(i, 3).toString());

            // Insertar cada detalle
            boolean okDetalle = BaseDatos.insertarRegistro(
                    "venta_articulo",
                    "venta_id, articulo_id, cantidad, precio",
                    ventaId + ", " + articuloId + ", " + cantidad + ", " + precio
            );

            if (!okDetalle) {
                JOptionPane.showMessageDialog(this, "Error al guardar artículo ID " + articuloId);
                return;
            }

            // Opcional: actualizar el stock
            BaseDatos.actualizarRegistro(
                    "articulo",
                    "stock = stock - " + cantidad,
                    "id = " + articuloId
            );
        }

        JOptionPane.showMessageDialog(this, "Venta registrada correctamente con ID " + ventaId);

        // Limpiar formulario
        txtVentaId.setText(String.valueOf(ventaId));
        txtClienteId.setText("");
        txtCliente.setText("");
        txtRuc.setText("");
        txtTotal.setText("0");
        ((DefaultTableModel) grdArticulos.getModel()).setRowCount(0);
    }//GEN-LAST:event_btnGuardarVentaActionPerformed

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
                FrmVentas dialog = new FrmVentas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarArticulo;
    private javax.swing.JButton btnBuscarArticulo;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarRuc;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JTable grdArticulos;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblArticuloId;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblClienteId;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVentaId;
    private javax.swing.JPanel pnlArticulo;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JScrollPane splArticulos;
    private javax.swing.JFormattedTextField txtArticulo;
    private javax.swing.JFormattedTextField txtArticuloId;
    private javax.swing.JFormattedTextField txtCantidad;
    private javax.swing.JFormattedTextField txtCliente;
    private javax.swing.JFormattedTextField txtClienteId;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtRuc;
    private javax.swing.JFormattedTextField txtStock;
    private javax.swing.JFormattedTextField txtSubTotal;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtVentaId;
    // End of variables declaration//GEN-END:variables
}
