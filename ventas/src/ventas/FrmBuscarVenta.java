package ventas;

import java.util.function.Consumer;
import javax.swing.JOptionPane;

public final class FrmBuscarVenta extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmBuscarVenta.class.getName());

    Consumer<DatoCombo> fnConfirmar;
    String tabla;
    String[] campos;
    int columnaFiltro;

    public FrmBuscarVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public FrmBuscarVenta(java.awt.Dialog parent, boolean modal,
            String titulo,
            String tabla,
            String[] campos,
            int columnaFiltro,
            String condicion,
            Consumer<DatoCombo> fnConfirmar) {
        super(parent, modal);
        initComponents();
        Grilla.configurarModelo(grdItems, campos);
        lblTitulo.setText(titulo);
        this.tabla = tabla;
        this.campos = campos;
        this.fnConfirmar = fnConfirmar;
        this.columnaFiltro = columnaFiltro;
        this.setSize(301, 302);
        actualizarGrilla();
    }

    void actualizarGrilla() {
        Grilla.cargarGrilla(grdItems, tabla, campos);
        if (!txtBuscar.getText().isEmpty()) {
            Grilla.filtrarGrilla(grdItems, txtBuscar.getText(), columnaFiltro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdItems = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Titulo");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 610, 50));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 85, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 85, 40));

        grdItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(grdItems);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 610, 280));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 330, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (cboItems.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(btnConfirmar, "No se ha seleccionado el elemento");
            return;
        }
        fnConfirmar.accept((DatoCombo) cboItems.getSelectedItem());
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
                FrmBuscarVenta dialog = new FrmBuscarVenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTable grdItems;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
