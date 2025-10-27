package ventas;

import java.awt.event.KeyEvent;

public class FrmVentas extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmVentas.class.getName());

    public FrmVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnBuscarClienteId.requestFocus();
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
        btnBuscarClienteId = new javax.swing.JButton();
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
        btnBuscarArticuloId = new javax.swing.JButton();
        btnBuscarArticulo = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblCantidad1 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JFormattedTextField();

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

        btnBuscarClienteId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarClienteId.setBorder(null);
        btnBuscarClienteId.setContentAreaFilled(false);
        btnBuscarClienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteIdActionPerformed(evt);
            }
        });
        pnlVenta.add(btnBuscarClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, 20));

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
        pnlArticulo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 125, -1));

        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidad.setText("Cantidad");
        pnlArticulo.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        txtCantidad.setEnabled(false);
        pnlArticulo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 125, -1));

        btnAgregarArticulo.setText("Agregar");
        pnlArticulo.add(btnAgregarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        btnBuscarArticuloId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarArticuloId.setBorder(null);
        btnBuscarArticuloId.setContentAreaFilled(false);
        btnBuscarArticuloId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArticuloIdActionPerformed(evt);
            }
        });
        pnlArticulo.add(btnBuscarArticuloId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, 20));

        btnBuscarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarArticulo.setBorder(null);
        btnBuscarArticulo.setContentAreaFilled(false);
        btnBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArticuloActionPerformed(evt);
            }
        });
        pnlArticulo.add(btnBuscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 20, 20));

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Total");
        pnlArticulo.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 56, 20));

        txtTotal.setEditable(false);
        pnlArticulo.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 125, -1));

        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock.setText("Stock");
        pnlArticulo.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 56, 20));

        txtStock.setEditable(false);
        pnlArticulo.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 125, -1));

        getContentPane().add(pnlArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 460, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Factura"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Guardar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 80, 40));

        lblCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidad1.setText("Total");
        jPanel3.add(lblCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 60, 20));

        txtCantidad1.setEnabled(false);
        jPanel3.add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 125, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 930, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteIdKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_F1){
            FrmCiudad ciudad = new FrmCiudad(null, true);
            ciudad.setVisible(true);
        }
    }//GEN-LAST:event_txtClienteIdKeyReleased

    private void btnBuscarClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteIdActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarRucActionPerformed

    private void btnBuscarArticuloIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArticuloIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarArticuloIdActionPerformed

    private void btnBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarArticuloActionPerformed

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
    private javax.swing.JButton btnBuscarArticuloId;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarClienteId;
    private javax.swing.JButton btnBuscarRuc;
    private javax.swing.JTable grdArticulos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblArticuloId;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidad1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblClienteId;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVentaId;
    private javax.swing.JPanel pnlArticulo;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JScrollPane splArticulos;
    private javax.swing.JFormattedTextField txtArticulo;
    private javax.swing.JFormattedTextField txtArticuloId;
    private javax.swing.JFormattedTextField txtCantidad;
    private javax.swing.JFormattedTextField txtCantidad1;
    private javax.swing.JFormattedTextField txtCliente;
    private javax.swing.JFormattedTextField txtClienteId;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtRuc;
    private javax.swing.JFormattedTextField txtStock;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtVentaId;
    // End of variables declaration//GEN-END:variables
}
