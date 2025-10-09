package ventas;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

class DecimalRenderer extends DefaultTableCellRenderer {

    final DecimalFormat formatter;

    public DecimalRenderer(DecimalFormat pattern) {
        this.formatter = pattern;
        setHorizontalAlignment(JLabel.RIGHT);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        if (value instanceof Number number) {
            value = formatter.format(number.doubleValue());
        }

        return super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
    }
}

public class Grilla {

    String tabla;
    BaseDatos bd;

    public Grilla(String tabla) {
        this.tabla = tabla;
        bd = new BaseDatos(tabla);
    }

    public void configurarModelo(JTable nombregrilla, String[] columnas, int[] ancho) {
        DefaultTableModel dm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        dm.setDataVector(
                new Object[][]{},
                new String[]{});
        for (String columna : columnas) {
            dm.addColumn(columna);
        }
        nombregrilla.getTableHeader().setReorderingAllowed(false);
        nombregrilla.setModel(dm);
        for (int cont2 = 0; cont2 <= columnas.length - 1; cont2++) {
            nombregrilla.getColumnModel().getColumn(cont2).setPreferredWidth(ancho[cont2]);
        }
    }

    public void alinear(JTable grilla, String columna) {
        final DecimalFormat formato = new DecimalFormat("###,##0.00");
        grilla.getColumn(columna).setCellRenderer(new DecimalRenderer(formato));
    }

    public void cargarGrilla(JTable nombregrilla, String[] campos) {
        String sql = "Select ";
        DefaultTableModel modelo = (DefaultTableModel) nombregrilla.getModel();
        nombregrilla.selectAll();
        int[] filas = nombregrilla.getSelectedRows();
        for (int i = (filas.length - 1); i >= 0; --i) {
            modelo.removeRow(i);
        }
        for (int cont = 0; cont < campos.length; cont++) {
            if (cont < 1) {
                sql = sql + campos[cont];
            } else {
                sql = sql + ", " + campos[cont];
            }
        }
        try {
            sql = sql + " from " + tabla;
            ResultSet rs = bd.consultar(sql);
            String[] valores = new String[campos.length];
            int fila = 0;
            while (rs.next()) {
                for (int cont2 = 0; cont2 < campos.length; cont2++) {
                    valores[cont2] = rs.getString(cont2 + 1);
                }
                modelo.addRow(new Object[]{});
                for (int col = 0; col < valores.length; col++) {
                    modelo.setValueAt(valores[col], fila, col);
                }
                fila = fila + 1;
            }
            nombregrilla.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar cargar la grilla" + ex.toString(), "Grilla", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void filtrarGrilla(JTable nombregrilla, String texto, int columna) {
        DefaultTableModel modelo = (DefaultTableModel) nombregrilla.getModel();
        TableRowSorter gridFiltrado = new TableRowSorter(modelo);
        gridFiltrado.setRowFilter(RowFilter.regexFilter(texto, columna));
        nombregrilla.setRowSorter(gridFiltrado);
    }

}
