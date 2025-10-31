package ventas;

import java.util.function.Consumer;
import javax.swing.JOptionPane;

public final class FrmBuscarVenta extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmBuscarVenta.class.getName());

    private Consumer<String[]> fnConfirmar;
    private String tabla;
    private String[] campos;

    public FrmBuscarVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public FrmBuscarVenta(java.awt.Dialog parent, boolean modal,
            String titulo,
            String tabla,
            String[] campos,
            String condicion,
            Consumer<String[]> fnConfirmar) {
        super(parent, modal);
        initComponents();

        String[] columnas = new String[campos.length];
        for (int i = 0; i < campos.length; i++) {
            columnas[i] = campos[i].replaceAll("(?i).*\\bas\\s+", "");
        }
        
        Grilla.configurarModelo(grdItems, columnas);
        for (String criterio : columnas) {
            cboCriterio.addItem(criterio);
        }
        lblTitulo.setText(titulo);
        this.tabla = tabla;
        this.campos = campos;
        this.fnConfirmar = fnConfirmar;
        this.setSize(301, 302);
        actualizarGrilla();
        pack();
//        setLocationRelativeTo(parent);
    }

    void actualizarGrilla() {
        Grilla.cargarGrilla(grdItems, tabla, campos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBuscar = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        splItems = new javax.swing.JScrollPane();
        grdItems = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        cboCriterio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBuscar.setBackground(new java.awt.Color(153, 204, 255));
        pnlBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Titulo");
        pnlBuscar.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 50));

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/confirmar (2).png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 130, 40));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 120, 40));

        grdItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        grdItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        splItems.setViewportView(grdItems);

        pnlBuscar.add(splItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 610, 280));

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlBuscar.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 390, 40));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar.setText("Buscar por");
        pnlBuscar.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 40));

        pnlBuscar.add(cboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, 40));

        getContentPane().add(pnlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int fila = grdItems.getSelectedRow();
        if (fila ==  -1) {
            JOptionPane.showMessageDialog(btnConfirmar, "No se ha seleccionado el elemento");
            return;
        }
        
        int columnas = grdItems.getColumnCount();
        String[] datos = new String[columnas];

        for (int i = 0; i < columnas; i++) {
            datos[i] = grdItems.getValueAt(fila, i).toString();
        }

        fnConfirmar.accept(datos);
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (cboCriterio.getSelectedIndex() == -1) {
            return;
        }
        Grilla.filtrarGrilla(grdItems, txtBuscar.getText().trim().toUpperCase(), cboCriterio.getSelectedIndex());
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
    public javax.swing.JComboBox<String> cboCriterio;
    private javax.swing.JTable grdItems;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JScrollPane splItems;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
