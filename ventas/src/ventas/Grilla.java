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
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

class DecimalRenderer extends DefaultTableCellRenderer {

    final DecimalFormat formatter;

    public DecimalRenderer(DecimalFormat pattern) {
        this.formatter = pattern;
        setHorizontalAlignment(JLabel.RIGHT);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Number) {
            Number number = (Number) value;
            value = formatter.format(number.doubleValue());
        }
        return super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
    }
}

public class Grilla {

    public static void configurarModelo(JTable grilla, String[] columnas) {
        DefaultTableModel dm = new DefaultTableModel();
        dm.setDataVector(new Object[][]{}, columnas);
//        for (String columna : columnas) {
//            dm.addColumn(columna);
//        }
//        grilla.getTableHeader().setReorderingAllowed(false);
        grilla.setModel(dm);
//        for (int cont2 = 0; cont2 <= columnas.length - 1; cont2++) {
//            grilla.getColumnModel().getColumn(cont2).setPreferredWidth(ancho[cont2]);
//        }
    }

    public static void alinear(JTable grilla, String columna) {
        final DecimalFormat formato = new DecimalFormat("###,##0.00");
        grilla.getColumn(columna).setCellRenderer(new DecimalRenderer(formato));
    }

    public static void cargarGrilla(JTable grilla, String tabla, String[] campos) {
        String sql = "Select ";
        DefaultTableModel modelo = (DefaultTableModel) grilla.getModel();
        grilla.selectAll();
        int[] filas = grilla.getSelectedRows();
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
            ResultSet rs = BaseDatos.consultar(sql);
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
            grilla.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar cargar la grilla" + ex.toString(), "Grilla", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void filtrarGrilla(JTable grilla, String texto, int columna) {
        DefaultTableModel modelo = (DefaultTableModel) grilla.getModel();
        TableRowSorter gridFiltrado = new TableRowSorter(modelo);
        gridFiltrado.setRowFilter(RowFilter.regexFilter(texto, columna));
        grilla.setRowSorter(gridFiltrado);
    }

    public static String getValorSeleccionado(JTable grilla, String columna) {
        TableModel model = grilla.getModel();
        for (int idx = 0; idx < model.getColumnCount(); idx++) {
            if (!columna.equals(model.getColumnName(idx))) {
                continue;
            }
            return (String) grilla.getValueAt(grilla.getSelectedRow(), idx);
        }
        return null;
    }
}
