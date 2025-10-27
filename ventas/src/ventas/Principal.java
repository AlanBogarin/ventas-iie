package ventas;

// Tablas
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFormularios = new javax.swing.JMenu();
        itemArticulos = new javax.swing.JMenuItem();
        itemCiudad = new javax.swing.JMenuItem();
        itemVentas = new javax.swing.JMenuItem();
        itemClientes = new javax.swing.JMenuItem();
        itemClasificaciones = new javax.swing.JMenuItem();
        itemBarrio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto-de-venta.png"))); // NOI18N

        menuFormularios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuFormularios.setText("Archivo");
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

        itemVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemVentas.setText("Ventas");
        itemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentasActionPerformed(evt);
            }
        });
        menuFormularios.add(itemVentas);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(lblIcon)
                .addGap(71, 71, 71))
        );

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
    private javax.swing.JMenuItem itemVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JMenu menuFormularios;
    // End of variables declaration//GEN-END:variables
}
