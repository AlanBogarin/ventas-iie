package ventas;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BaseDatos {

    static final String HOST = "localhost:3306";
    static final String BASE_DATOS = "ventas";
    static final String USUARIO = "root";
    static final String CLAVE = "1234";
    static Connection conexion = null;

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

    public static void cerrarConexion() {
        if (conexion == null) {
            return;
        }
        try {
            conexion.close();
        } catch (SQLException e) {
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static boolean borrarRegistro(String tabla, String condicion) {
        crearConexion();
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

    public static boolean borrarRegistroSinPreguntar(String tabla, String condicion) {
        crearConexion();
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

    public static boolean insertarRegistro(String tabla, String campos, String valores) {
        crearConexion();
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

    public static boolean insertarRegistro(String tabla, String valores) {
        crearConexion();
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

    public static boolean actualizarRegistro(String tabla, String campos, String criterio) {
        crearConexion();
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

    public static ResultSet consultar(String sql) {
        return consultar(sql, false);
    }
    
    public static ResultSet consultar(String sql, boolean paraActualizar) {
        crearConexion();
        ResultSet rs = null;
        try {
            Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    paraActualizar ? ResultSet.CONCUR_UPDATABLE : ResultSet.CONCUR_READ_ONLY);
            return s.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio Un error"
                    + e.getMessage(), "Atencion", JOptionPane.INFORMATION_MESSAGE);
        }
        return rs;
    }
}
