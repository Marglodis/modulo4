package session5;

import java.util.Scanner;

public class EvaluacionSession5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

        while (true) {
            System.out.println("\nElija una opción:");
            System.out.println("1.- Ver productos");
            System.out.println("2.- Agregar productos");
            System.out.println("3.- Modificar productos");
            System.out.println("4.- Salir");

            System.out.print("Seleccione una opción (1-4): ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    tienda.verProductos();
                    break;
                case 2:
                    tienda.agregarProducto();
                    break;
                case 3:
                    tienda.modificarProducto();
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicación...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija entre 1 y 4.");
                    break;
            }
        }

    }
}
