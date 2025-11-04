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
        String ventaId = fila.length == 0 || fila[0] == null ? "1" :
                String.valueOf((((Number) fila[0]).intValue() + 1));
        txtVentaId.setText(ventaId);
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
        grdArticulos.clearSelection();
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

        pnlVentas = new javax.swing.JPanel();
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
        pnlTotal = new javax.swing.JPanel();
        btnGuardarVenta = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(720, 1440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVentas.setBackground(new java.awt.Color(153, 204, 255));
        pnlVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grdArticulos.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        grdArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "cantidad", "precio", "subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdArticulosMouseClicked(evt);
            }
        });
        splArticulos.setViewportView(grdArticulos);

        pnlVentas.add(splArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 440, 300));

        pnlVenta.setBackground(new java.awt.Color(153, 204, 255));
        pnlVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Datos de la venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 12))); // NOI18N
        pnlVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("Fecha");
        pnlVenta.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 60, 20));

        lblVentaId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblVentaId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVentaId.setText("Nº Factura");
        pnlVenta.add(lblVentaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, 20));

        lblCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCliente.setText("Cliente");
        pnlVenta.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        lblClienteId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblClienteId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClienteId.setText("ID Cliente");
        pnlVenta.add(lblClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 20));

        lblRuc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblRuc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRuc.setText("Ruc");
        pnlVenta.add(lblRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        txtFecha.setEditable(false);
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFecha.setEnabled(false);
        pnlVenta.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 125, 20));

        txtVentaId.setEditable(false);
        txtVentaId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtVentaId.setEnabled(false);
        pnlVenta.add(txtVentaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 125, 20));

        txtCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        pnlVenta.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 125, 20));

        txtClienteId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtClienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIdActionPerformed(evt);
            }
        });
        txtClienteId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteIdKeyReleased(evt);
            }
        });
        pnlVenta.add(txtClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 125, 20));

        txtRuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRucKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });
        pnlVenta.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 125, 20));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarCliente.setBorder(null);
        btnBuscarCliente.setContentAreaFilled(false);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        pnlVenta.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, 20));

        pnlVentas.add(pnlVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 130));

        pnlArticulo.setBackground(new java.awt.Color(153, 204, 255));
        pnlArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Detalle de factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 12))); // NOI18N
        pnlArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArticuloId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblArticuloId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArticuloId.setText("ID Articulo");
        pnlArticulo.add(lblArticuloId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 20));

        txtArticuloId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtArticuloId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIdActionPerformed(evt);
            }
        });
        txtArticuloId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtArticuloIdKeyTyped(evt);
            }
        });
        pnlArticulo.add(txtArticuloId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 125, -1));

        lblArticulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblArticulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArticulo.setText("Articulo");
        pnlArticulo.add(lblArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        txtArticulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloActionPerformed(evt);
            }
        });
        pnlArticulo.add(txtArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 125, -1));

        lblPrecio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Precio");
        pnlArticulo.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 60, 20));

        txtPrecio.setEditable(false);
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setText("0");
        txtPrecio.setEnabled(false);
        pnlArticulo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 125, -1));

        lblCantidad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidad.setText("Cantidad");
        pnlArticulo.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.setText("0");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });
        pnlArticulo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 125, -1));

        btnAgregarArticulo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnAgregarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAgregarArticulo.setText("Agregar");
        btnAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArticuloActionPerformed(evt);
            }
        });
        pnlArticulo.add(btnAgregarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 40));

        btnBuscarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-lupa-x16.png"))); // NOI18N
        btnBuscarArticulo.setBorder(null);
        btnBuscarArticulo.setContentAreaFilled(false);
        btnBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArticuloActionPerformed(evt);
            }
        });
        pnlArticulo.add(btnBuscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, 20));

        lblSubTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubTotal.setText("SubTotal");
        pnlArticulo.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, 20));

        txtSubTotal.setEditable(false);
        txtSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubTotal.setText("0");
        txtSubTotal.setEnabled(false);
        pnlArticulo.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 125, -1));

        lblStock.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock.setText("Stock");
        pnlArticulo.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, 20));

        txtStock.setEditable(false);
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStock.setText("0");
        txtStock.setEnabled(false);
        pnlArticulo.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 125, -1));

        pnlVentas.add(pnlArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 460, 170));

        pnlTotal.setBackground(new java.awt.Color(153, 204, 255));
        pnlTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Total Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 12))); // NOI18N
        pnlTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarVenta.setText("Guardar");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });
        pnlTotal.add(btnGuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 130, 40));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Total");
        pnlTotal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 60, 20));

        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0");
        txtTotal.setEnabled(false);
        pnlTotal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 125, 40));

        pnlVentas.add(pnlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 920, 130));

        getContentPane().add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        new FrmBuscarVenta(this, false,
                "Buscar Cliente", "cliente", new String[]{"id", "CONCAT(nombre,' ',apellido) as nombre", "ruc"},
                null, (String[] fila) -> {
                    txtClienteId.setText(fila[0]);
                    txtCliente.setText(fila[1]);
                    txtRuc.setText(fila[2]);
                }
        ).setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArticuloActionPerformed
        limpiarArticulo();
        new FrmBuscarVenta(this, false,
                "Buscar Articulo", "articulo", new String[]{"id", "nombre", "precio", "stock"},
                null, (String[] fila) -> {
                    DefaultTableModel modelo = (DefaultTableModel) grdArticulos.getModel();
                    String articulo_id = fila[0];
                    for (int row = 0; row < modelo.getRowCount(); row++) {
                        String columna_id = modelo.getValueAt(row, 0).toString(); // columna 'id'
                        if (!articulo_id.equals(columna_id)) {
                            continue;
                        }
                        // Seleccionar la fila del articulo ya cargado
                        grdArticulos.setRowSelectionInterval(row, row);
                        // Cargar los valores desde la grilla
                        txtCantidad.setText(modelo.getValueAt(row, 2).toString());
                        txtSubTotal.setText(modelo.getValueAt(row, 4).toString());
                    }
                    txtArticuloId.setText(articulo_id);
                    txtArticulo.setText(fila[1]);
                    txtPrecio.setText(fila[2]);
                    txtStock.setText(fila[3]);
                }
        ).setVisible(true);
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
        // Obtener los datos de los campos
        String id = txtArticuloId.getText();
        String nombre = txtArticulo.getText();
        String cantidad = txtCantidad.getText();
        String precio = txtPrecio.getText();
        String subtotal = txtSubTotal.getText();
        int intCantidad = Integer.parseInt(cantidad);
        DefaultTableModel modelo = (DefaultTableModel) grdArticulos.getModel();
        int fila = grdArticulos.getSelectedRow();
        if (intCantidad > stock) {
            JOptionPane.showMessageDialog(btnAgregarArticulo, "La cantidad no debe superar el stock");
            return;
        }
        if (fila == -1) {
            // Fila no seleccionada
            if (intCantidad <= 0) {
                JOptionPane.showMessageDialog(btnAgregarArticulo, "Agregue la cantidad a vender");
                txtCantidad.requestFocus();
                return;
            }
            // Agregar la fila a la tabla
            modelo.addRow(new Object[]{id, nombre, cantidad, precio, subtotal});
        } else if (intCantidad <= 0) {
            // Eliminar la fila ya que cantidad = 0
            modelo.removeRow(fila);
        } else {
            // Modificar fila
            modelo.setValueAt(id, fila, 0);
            modelo.setValueAt(nombre, fila, 1);
            modelo.setValueAt(cantidad, fila, 2);
            modelo.setValueAt(precio, fila, 3);
            modelo.setValueAt(subtotal, fila, 4);
        }
        actualizarTotalFactura();
        limpiarArticulo();

    }//GEN-LAST:event_btnAgregarArticuloActionPerformed

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
        String total = txtTotal.getText();
        String fecha = java.time.LocalDate.now().toString();
        // --- Insertar en tabla venta ---
        boolean ok = BaseDatos.insertarRegistro(
                "venta",
                "cliente_id,fecha,total",
                clienteId + ", '" + fecha + "'" + ", " + total
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
            // Actualizar el stock
            BaseDatos.actualizarRegistro(
                    "articulo",
                    "stock = stock - " + cantidad,
                    "id = " + articuloId
            );
        }
        JOptionPane.showMessageDialog(this, "Venta registrada correctamente con ID " + ventaId);
        // Limpiar formulario
        limpiarVenta();
        limpiarArticulo();
        ((DefaultTableModel) grdArticulos.getModel()).setRowCount(0);
    }//GEN-LAST:event_btnGuardarVentaActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        String sCantidad = txtCantidad.getText();
        if (sCantidad.startsWith("0")) {
           sCantidad = sCantidad.replaceFirst("0", "");
           txtCantidad.setText(sCantidad);
        }
        if (sCantidad.isEmpty()) {
            sCantidad = "0";
            txtCantidad.setText(sCantidad);
        }
        int cantidad = Integer.parseInt(sCantidad);
        int precio = Integer.parseInt(txtPrecio.getText());
        int subtotal = cantidad * precio;
        txtSubTotal.setText(String.valueOf(subtotal));
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void grdArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdArticulosMouseClicked
        if (!(evt.getClickCount() == 2 && grdArticulos.getSelectedRow() != -1)) {
            return;
        }
        txtArticuloId.setText(Grilla.getValorSeleccionado(grdArticulos, "id"));
        txtArticulo.setText(Grilla.getValorSeleccionado(grdArticulos, "nombre"));
        txtCantidad.setText(Grilla.getValorSeleccionado(grdArticulos, "cantidad"));
        txtPrecio.setText(Grilla.getValorSeleccionado(grdArticulos, "precio"));
        txtSubTotal.setText(Grilla.getValorSeleccionado(grdArticulos, "subtotal"));
        Object[] fila = BaseDatos.getPrimeraFila("SELECT id,stock FROM articulo WHERE id="+txtArticuloId.getText());
        txtStock.setText(fila[1].toString());
    }//GEN-LAST:event_grdArticulosMouseClicked

    private void txtClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIdActionPerformed
        String buscar = txtClienteId.getText().trim().toUpperCase();
        if (buscar.isEmpty()) {
            return;
        }
        Object[] fila = BaseDatos.getPrimeraFila("SELECT id,CONCAT(nombre,' ',apellido),ruc "
                + "FROM cliente WHERE id=" + buscar);
        if (fila.length == 0) {
            JOptionPane.showMessageDialog(txtCliente, "No se ha encontrado el cliente");
            return;
        }
        txtClienteId.setText(fila[0].toString());
        txtCliente.setText(fila[1].toString());
        txtRuc.setText(fila[2].toString());
    }//GEN-LAST:event_txtClienteIdActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        String buscar = txtCliente.getText().trim().toUpperCase();
        if (buscar.isEmpty()) {
            return;
        }
        Object[] fila = BaseDatos.getPrimeraFila("SELECT id,CONCAT(nombre,' ',apellido),ruc "
                + "FROM cliente WHERE CONCAT(nombre,' ',apellido) LIKE '%" + buscar + "%'");
        if (fila.length == 0) {
            JOptionPane.showMessageDialog(txtCliente, "No se ha encontrado el cliente");
            return;
        }
        txtClienteId.setText(fila[0].toString());
        txtCliente.setText(fila[1].toString());
        txtRuc.setText(fila[2].toString());
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        String buscar = txtRuc.getText().trim().toUpperCase();
        if (buscar.isEmpty()) {
            return;
        }
        Object[] fila = BaseDatos.getPrimeraFila("SELECT id,CONCAT(nombre,' ',apellido),ruc "
                + "FROM cliente WHERE ruc LIKE '%" + buscar + "%'");
        if (fila.length == 0) {
            JOptionPane.showMessageDialog(txtCliente, "No se ha encontrado el cliente");
            return;
        }
        txtClienteId.setText(fila[0].toString());
        txtCliente.setText(fila[1].toString());
        txtRuc.setText(fila[2].toString());
    }//GEN-LAST:event_txtRucActionPerformed

    private void txtClienteIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteIdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            FrmCiudad ciudad = new FrmCiudad(null, true);
            ciudad.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            FrmBuscarVenta frm = new FrmBuscarVenta(this, false,
                    "Buscar Cliente", "cliente", new String[]{"id", "CONCAT(nombre,' ',apellido) as nombre", "ruc"},
                    null, (String[] fila) -> {
                        txtClienteId.setText(fila[0]);
                        txtCliente.setText(fila[1]);
                        txtRuc.setText(fila[2]);
                    }
            );
            frm.cboCriterio.setSelectedIndex(0);
            frm.txtBuscar.setText(txtClienteId.getText());
            frm.setVisible(true);
        }
    }//GEN-LAST:event_txtClienteIdKeyReleased

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            FrmCiudad ciudad = new FrmCiudad(null, true);
            ciudad.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            FrmBuscarVenta frm = new FrmBuscarVenta(this, false,
                    "Buscar Cliente", "cliente", new String[]{"id", "CONCAT(nombre,' ', apellido) as nombre", "ruc"},
                    null, (String[] fila) -> {
                        txtClienteId.setText(fila[0]);
                        txtCliente.setText(fila[1]);
                        txtRuc.setText(fila[2]);
                    }
            );
            frm.cboCriterio.setSelectedIndex(1);
            frm.txtBuscar.setText(txtCliente.getText());
            frm.setVisible(true);
        }
    }//GEN-LAST:event_txtClienteKeyReleased

    private void txtRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            FrmCiudad ciudad = new FrmCiudad(null, true);
            ciudad.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            FrmBuscarVenta frm = new FrmBuscarVenta(this, false,
                    "Buscar Cliente", "cliente", new String[]{"id", "CONCAT(nombre,' ',apellido) as nombre", "ruc"},
                    null, (String[] fila) -> {
                        txtClienteId.setText(fila[0]);
                        txtCliente.setText(fila[1]);
                        txtRuc.setText(fila[2]);
                    }
            );
            frm.cboCriterio.setSelectedIndex(1);
            frm.txtBuscar.setText(txtCliente.getText());
            frm.setVisible(true);
        }
    }//GEN-LAST:event_txtRucKeyReleased

    private void txtArticuloIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloIdActionPerformed
        String buscar = txtArticuloId.getText().trim().toUpperCase();
        if (buscar.isEmpty()) {
            return;
        }
        Object[] fila = BaseDatos.getPrimeraFila("SELECT id,nombre,precio,stock "
                + "FROM articulo WHERE id=" + buscar);
        if (fila.length == 0) {
            JOptionPane.showMessageDialog(txtCliente, "No se ha encontrado el articulo");
            return;
        }
        txtArticuloId.setText(fila[0].toString());
        txtArticulo.setText(fila[1].toString());
        txtPrecio.setText(fila[2].toString());
        txtStock.setText(fila[3].toString());
    }//GEN-LAST:event_txtArticuloIdActionPerformed

    private void txtArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloActionPerformed
        String buscar = txtArticulo.getText().trim().toUpperCase();
        if (buscar.isEmpty()) {
            return;
        }
        Object[] fila = BaseDatos.getPrimeraFila("SELECT id,nombre,precio,stock "
                + "FROM articulo WHERE nombre LIKE '%" + buscar + "%'");
        if (fila.length == 0) {
            JOptionPane.showMessageDialog(txtCliente, "No se ha encontrado el articulo");
            return;
        }
        txtArticuloId.setText(fila[0].toString());
        txtArticulo.setText(fila[1].toString());
        txtPrecio.setText(fila[2].toString());
        txtStock.setText(fila[3].toString());
    }//GEN-LAST:event_txtArticuloActionPerformed

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        char e  = evt.getKeyChar();
        if(!txtStock.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                txtArticuloId.requestFocus();
            }
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtArticuloIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArticuloIdKeyTyped
         char e  = evt.getKeyChar();
        if(!txtStock.getText().isEmpty()){
            if(e==KeyEvent.VK_ENTER){
                txtCantidad.requestFocus();
            }
        }
    }//GEN-LAST:event_txtArticuloIdKeyTyped

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
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JTable grdArticulos;
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
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JPanel pnlVentas;
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
