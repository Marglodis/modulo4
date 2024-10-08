package modulo5;

public class Producto {
    String nombre;
    double valor;
    String descripcion;

    public Producto(String nombre, double valor, String descripcion) {
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre + " - " + valor + " - " + descripcion;
    }
}
