package ventas;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BaseDatos {

    static final String HOST = "localhost:3306";
    static final String BASE_DATOS = "ventas";
    static final String USUARIO = "root";
    static final String CLAVE = "1234";
    static Connection conexion = null;
    static Statement sentencia;

    String tabla;

    public BaseDatos(String tabla) {
        this.tabla = tabla;
        crearConexion();
    }

    public static boolean crearConexion() {
        if (conexion != null) {
            return true;
        }
        String url = "jdbc:mysql://" + HOST + "/" + BASE_DATOS + "?characterEncoding=utf8";
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexion = DriverManager.getConnection(url, USUARIO, CLAVE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());
            return false;
        }
        return true;
    }

    public void cerrarConexion() {
        if (conexion == null) {
            return;
        }
        try {
            conexion.close();
        } catch (SQLException e) {
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public boolean borrarRegistro(String condicion) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            Object[] opciones = {"Si", "No"};

            int ret = JOptionPane.showOptionDialog(
                    null,
                    "Esta seguro de ELIMINAR el REGISTRO? ",
                    "Pregunta",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
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

    public boolean borrarRegistroSinPreguntar(String condicion) {
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

    public boolean insertarRegistro(String campos, String valores) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("insert into " + tabla + " (" + campos + ") values (" + valores + ")");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error al insertar \n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertarRegistro(String valores) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("insert into " + tabla + " values (" + valores + ")");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error al insertar \n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean actualizarRegistro(String campos, String criterio) {
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate("update " + tabla + " set " + campos + " where " + criterio);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error\n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public ResultSet consultar(String sql) {
        ResultSet rs = null;
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = s.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return rs;
    }

    public void cargarCombo(JComboBox combo, String campos) {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar combo\n" + e.getMessage(), "Llenar Combo - " + combo.getName(), JOptionPane.ERROR_MESSAGE);
        }
    }
}
