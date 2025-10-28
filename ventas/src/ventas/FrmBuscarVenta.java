package ventas;

import java.util.function.Consumer;
import javax.swing.JOptionPane;

public final class FrmBuscarVenta extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmBuscarVenta.class.getName());

    private String ultimoTexto;
    private Consumer<String[]> fnConfirmar;
    private String tabla;
    private String[] campos;
    private int columnaFiltro;

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
            Consumer<String[]> fnConfirmar) {
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
        pack();
//        setLocationRelativeTo(parent);
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

        pnlBuscar = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        splItems = new javax.swing.JScrollPane();
        grdItems = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Titulo");
        pnlBuscar.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 610, 50));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 85, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 85, 40));

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

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlBuscar.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 540, 40));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar.setText("Buscar");
        pnlBuscar.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 55, 40));

        getContentPane().add(pnlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int fila = grdItems.getSelectedRow();
        if (fila == -1) {
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
        String textoActual = txtBuscar.getText().trim().toLowerCase();
        // Si el texto actual es más largo → filtrar localmente
        if (ultimoTexto != null && textoActual.startsWith(ultimoTexto) && !textoActual.isEmpty()) {
            Grilla.filtrarGrilla(grdItems, textoActual, columnaFiltro);
        } else {
            // Si se borró texto o está vacío → recargar desde la base
            actualizarGrilla();
        }
        ultimoTexto = textoActual;
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
    private javax.swing.JTable grdItems;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JScrollPane splItems;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
