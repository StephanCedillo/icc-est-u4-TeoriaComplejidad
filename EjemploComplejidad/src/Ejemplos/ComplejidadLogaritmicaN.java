package Ejemplos;

import java.util.Arrays;

public class ComplejidadLogaritmicaN {

    public void metodoComplejidadLogaritmicaN() {
        int[] datos = {9, 4, 8, 3, 1, 2, 5, 7, 6};
        int objetivo = 5;

        // Ordenar el arreglo ( este es un requisito inicial )
        Arrays.sort(datos);

        int left = 0;
        int right = datos.length - 1;
        int resultado = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (datos[mid] == objetivo) {
                resultado = mid;
                break;
            } else if (datos[mid] < objetivo) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (resultado != -1) {
            System.out.println("Elemento " + objetivo + " encontrado en el índice " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}