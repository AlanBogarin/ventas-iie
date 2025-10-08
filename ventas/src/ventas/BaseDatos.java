package ventas;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BaseDatos {
    final String host = "localhost:3306";
    final String baseDatos = "ventas";
    final String usuario = "root";
    final String clave = "1234";
    static Connection conexion = null;
    static Statement sentencia;

    public BaseDatos() {
        this.hayConexion();
    }

    public boolean hayConexion() {
        if (conexion != null) return true;
        String url = "jdbc:mysql://" + host + "/" + baseDatos + "?characterEncoding=utf8";
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean borrarRegistro(String tabla, String condicion) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            JOptionPane optionPane = new JOptionPane();
            Object[] opciones = {"Si", "No"};

            int ret = optionPane.showOptionDialog(null, "Esta seguro de ELIMINAR el REGISTRO? ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (ret == JOptionPane.YES_OPTION) {
                s.executeUpdate("delete from " + tabla + " where " + condicion);
            }
        } catch (SQLException e) {
            if (e.getErrorCode() == 1451) {
                JOptionPane.showMessageDialog(null, "El registro esta relacionado con otros registros\nno podrá borrarlo.",
                        "Atencion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio Un error" + e.getMessage(), "Atencion",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            return false;
        }
        return true;
    }

    public boolean borrarRegistroSinPreguntar(String tabla, String condicion) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("delete from " + tabla + " where " + condicion);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha eliminado el registro seleccionado\nPuede estar usándose en otra tabla", "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertarRegistro(String tabla, String campos, String valores) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("insert into " + tabla + " (" + campos + ") values (" + valores + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error al insertar \n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertarRegistro(String tabla, String valores) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("insert into " + tabla + " values (" + valores + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error al insertar \n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean actualizarRegistro(String tabla, String campos, String criterio) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("update " + tabla + " set " + campos + " where " + criterio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error\n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public ResultSet consultarRegistros(String sql) {
        ResultSet rs = null;
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = s.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return rs;
    }

    public void cargarCombo(JComboBox combo, String campos, String tabla) {
        ResultSet rsC;
        try {
            sentencia = (Statement) conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsC = sentencia.executeQuery("select " + campos + " from " + tabla);
            ArrayList<DatosCombo> camposCombo;
            camposCombo = new ArrayList();
            while (rsC.next()) {
                camposCombo.add(new DatosCombo(rsC.getInt(1), rsC.getString(2)));
            }
            for (DatosCombo nombre : camposCombo) {
                combo.addItem(nombre);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar combo\n" + e.getMessage(), "Llenar Combo - " + combo.getName(), JOptionPane.ERROR_MESSAGE);
        }

    }

    public void cierraConexion() {
        try {
            conexion.close();
        } catch (Exception e) {

        }
    }

    public Connection miConexion() {
        return this.conexion;
    }
}
