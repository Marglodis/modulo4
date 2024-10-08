package session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private static final int MAX_PRODUCTOS = 7;
    private ArrayList<Producto> productos = new ArrayList<>();

    public Tienda() {
        // Lista inicial de productos
        productos.add(new Producto("Chocolate", 500, "Chocolate amargo, 500 gr."));
        productos.add(new Producto("Leche", 800, "Leche entera, 1 litro."));
        productos.add(new Producto("Arroz", 900, "Arroz grado 2, 1 kilo."));
    }

    public void verProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            //%-15s: Alinea a la izquierda y reserva 15 caracteres para el texto.
            //%-10.2f: Alinea a la izquierda, reserva 10 caracteres para el valor numérico y lo muestra con dos decimales.
            //%-30s: Alinea a la izquierda y reserva 30 caracteres para la descripción

            // Imprimir encabezados de la tabla
            System.out.println(String.format("| %-15s | %-10s | %-30s |", "Nombre", "Valor", "Descripción"));
            System.out.println("|-----------------|------------|--------------------------------|");

            // Imprimir los productos
            for (Producto producto : productos) {
                System.out.println(String.format("| %-15s | %-10.2f | %-30s |", producto.nombre, producto.valor, producto.descripcion));
            }
        }
    }

    // Agregar producto
    public void agregarProducto() {
        if (productos.size() < MAX_PRODUCTOS) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el valor del producto: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingrese la descripcion del producto: ");
            String descripcion = scanner.nextLine();

            Producto nuevoProducto = new Producto(nombre, valor, descripcion);
            productos.add(nuevoProducto);
            System.out.println("Producto agregado con éxito.");
        } else {
            System.out.println("No se pueden agregar más de 7 productos.");
        }
    }

    // Modificar producto
    public void modificarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        boolean encontrado = false;

        for (Producto producto : productos) {
            if (producto.nombre.equalsIgnoreCase(nombre)) {
                encontrado = true;

                System.out.print("Ingrese el nuevo valor para " + producto.nombre + ": ");
                producto.valor = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer de la nueva línea

                System.out.print("Ingrese la nueva descripción para " + producto.nombre + ": ");
                producto.descripcion = scanner.nextLine();

                System.out.println("Producto " + producto.nombre + " modificado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
