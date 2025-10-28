package ventas;

// Tablas

import javax.swing.JOptionPane;

// clasificacion
// articulo
// ciudad
// barrio
// cliente
// venta
// venta_articulo

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFormularios = new javax.swing.JMenu();
        itemArticulos = new javax.swing.JMenuItem();
        itemCiudad = new javax.swing.JMenuItem();
        itemClientes = new javax.swing.JMenuItem();
        itemClasificaciones = new javax.swing.JMenuItem();
        itemBarrio = new javax.swing.JMenuItem();
        menuMovimiento = new javax.swing.JMenu();
        itemVentas = new javax.swing.JMenuItem();
        itemCompra = new javax.swing.JMenuItem();
        itemFacturas = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlPrincipal.setBackground(new java.awt.Color(153, 204, 255));
        pnlPrincipal.setLayout(new java.awt.GridBagLayout());

        lblIcon.setBackground(new java.awt.Color(153, 204, 255));
        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto-de-venta.png"))); // NOI18N
        lblIcon.setToolTipText("");
        pnlPrincipal.add(lblIcon, new java.awt.GridBagConstraints());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡BIENVENIDO!");
        jLabel1.setMaximumSize(new java.awt.Dimension(123, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(123, 40));
        pnlPrincipal.add(jLabel1, new java.awt.GridBagConstraints());

        getContentPane().add(pnlPrincipal);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        menuFormularios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuFormularios.setText("Formulario");
        menuFormularios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormulariosActionPerformed(evt);
            }
        });

        itemArticulos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemArticulos.setText("Articulos");
        itemArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemArticulosActionPerformed(evt);
            }
        });
        menuFormularios.add(itemArticulos);

        itemCiudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemCiudad.setText("Ciudad");
        itemCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCiudadActionPerformed(evt);
            }
        });
        menuFormularios.add(itemCiudad);

        itemClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemClientes.setText("Clientes");
        itemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClientesActionPerformed(evt);
            }
        });
        menuFormularios.add(itemClientes);

        itemClasificaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemClasificaciones.setText("Clasificaciones");
        itemClasificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClasificacionesActionPerformed(evt);
            }
        });
        menuFormularios.add(itemClasificaciones);

        itemBarrio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemBarrio.setText("Barrio");
        itemBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBarrioActionPerformed(evt);
            }
        });
        menuFormularios.add(itemBarrio);

        jMenuBar1.add(menuFormularios);

        menuMovimiento.setText("Movimiento");

        itemVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemVentas.setText("Ventas");
        itemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentasActionPerformed(evt);
            }
        });
        menuMovimiento.add(itemVentas);

        itemCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemCompra.setText("Compra");
        itemCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompraActionPerformed(evt);
            }
        });
        menuMovimiento.add(itemCompra);

        itemFacturas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemFacturas.setText("Facturas");
        itemFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacturasActionPerformed(evt);
            }
        });
        menuMovimiento.add(itemFacturas);

        jMenuBar1.add(menuMovimiento);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFormulariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormulariosActionPerformed
        new FrmArticulos(this, true).setVisible(true);
    }//GEN-LAST:event_menuFormulariosActionPerformed

    private void itemCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCiudadActionPerformed
        new FrmCiudad(this, true).setVisible(true);
    }//GEN-LAST:event_itemCiudadActionPerformed

    private void itemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVentasActionPerformed
        new FrmVentas(this, true).setVisible(true);
    }//GEN-LAST:event_itemVentasActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        new FrmClientes(this, true).setVisible(true);
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemClasificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClasificacionesActionPerformed
        new FrmClasificacion(this, true).setVisible(true);
    }//GEN-LAST:event_itemClasificacionesActionPerformed

    private void itemBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBarrioActionPerformed
        new FrmBarrio(this, true).setVisible(true);
    }//GEN-LAST:event_itemBarrioActionPerformed

    private void itemArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemArticulosActionPerformed
        new FrmArticulos(this, true).setVisible(true);
    }//GEN-LAST:event_itemArticulosActionPerformed

    private void itemCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompraActionPerformed
        JOptionPane.showMessageDialog(itemCompra, "Proximamente...");
    }//GEN-LAST:event_itemCompraActionPerformed

    private void itemFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFacturasActionPerformed
        new FrmFacturas(this, true).setVisible(true);
    }//GEN-LAST:event_itemFacturasActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemArticulos;
    private javax.swing.JMenuItem itemBarrio;
    private javax.swing.JMenuItem itemCiudad;
    private javax.swing.JMenuItem itemClasificaciones;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemCompra;
    private javax.swing.JMenuItem itemFacturas;
    private javax.swing.JMenuItem itemVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JMenu menuFormularios;
    private javax.swing.JMenu menuMovimiento;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
