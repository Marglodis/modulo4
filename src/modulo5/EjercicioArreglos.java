package modulo5;

import java.util.Scanner;

public class EjercicioArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String asignaturas[] = new String[5];
        Double promedios[] = new Double[5];
        Double suma = 0.0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la asignatura #" + (i + 1) + ": ");
            asignaturas[i] = sc.nextLine();

            System.out.print("Ingrese el promedio de " + asignaturas[i] + ": ");
            promedios[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < promedios.length; i++) {
            suma += promedios[i];
        }
        double promedioFinal = suma / promedios.length;

        // Mostrar las asignaturas y sus promedios
        System.out.println("\nSus notas son las siguientes:");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i] + ": " + promedios[i]);
        }
        System.out.printf("\nSu promedio general es: %.2f\n", promedioFinal);
        sc.close();
    }

}
