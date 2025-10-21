package ventas;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Combo {

    public static void cargarCombo(
            JComboBox<DatoCombo> combo,
            String tabla,
            String campos,
            String condicion
    ) {
        condicion = condicion == null ? "" : (" where " + condicion);
        ResultSet r = BaseDatos.consultar(
                "select " + campos + " from " + tabla + condicion, false);
        try {
            while (r.next()) {
                combo.addItem(new DatoCombo(r.getInt(1), r.getString(2)));
            }
            combo.setSelectedIndex(-1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar combo\n" + e.getMessage(),
                    "Llenar Combo - " + combo.getName(), JOptionPane.ERROR_MESSAGE);
        }
    }
}
