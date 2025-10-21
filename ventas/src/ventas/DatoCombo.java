package ventas;

public class DatoCombo {

    int codigo;
    String nombre;

    public DatoCombo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int toInt() {
        return codigo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
