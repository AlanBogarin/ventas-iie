package ventas;

import javax.swing.JOptionPane;

public final class FrmFacturas extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmFacturas.class.getName());

    public FrmFacturas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actualizarGrilla();
    }

    void actualizarGrilla() {
        String[] campos = {"v.id", "c.nombre", "v.fecha", "v.total", "v.anulado"};
        String tabla = "venta v inner join cliente c on v.cliente_id = c.id";
        Grilla.cargarGrilla(grdFacturas, tabla, campos);
        for (int row = 0; row < grdFacturas.getRowCount(); row++){
            String valor = grdFacturas.getValueAt(row, 4).toString(); // anulado
            valor = Integer.parseInt(valor) == 1 ? "SI" : "NO";
            grdFacturas.setValueAt(valor, row, 4);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFacturas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdFacturas = new javax.swing.JTable();
        btnAnular = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JFormattedTextField();
        cboCriterio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFacturas.setBackground(new java.awt.Color(153, 204, 255));
        pnlFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlFacturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grdFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "cliente", "fecha", "total", "anulado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grdFacturas);

        pnlFacturas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 290));

        btnAnular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        pnlFacturas.add(btnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 120, 40));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar.setText("Buscar por");
        pnlFacturas.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlFacturas.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 220, 30));

        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "cliente", "fecha", "total", " " }));
        pnlFacturas.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, 30));

        getContentPane().add(pnlFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (cboCriterio.getSelectedIndex() == -1) {
            return;
        }
        Grilla.filtrarGrilla(grdFacturas, txtBuscar.getText().toUpperCase(), cboCriterio.getSelectedIndex());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        if (grdFacturas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(btnAnular, "Seleccione un registro");
            return;
        }
        String id = Grilla.getValorSeleccionado(grdFacturas, "id");
        BaseDatos.actualizarRegistro("venta", "anulado=!anulado", "id=" + id);
        actualizarGrilla();
    }//GEN-LAST:event_btnAnularActionPerformed

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
                FrmFacturas dialog = new FrmFacturas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAnular;
    private javax.swing.JComboBox<String> cboCriterio;
    private javax.swing.JTable grdFacturas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JPanel pnlFacturas;
    private javax.swing.JFormattedTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
