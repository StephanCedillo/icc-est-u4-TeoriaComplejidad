package Ejemplos;

import java.util.Arrays;

public class ComplejidadCuadratica {
    public void metodoComplejidadCuadratica(){
        int [] arreglo = {4,3,2,5,1,7,6};
        System.out.println(Arrays.toString(arreglo));
        // El tiempo aumenta al cuadrado del tamaño de entrada, frecuente en algoritmos ineficientes
        // Usualmente se usa con bucles anidados 
        for ( int i = 0 ; i < arreglo.length; i++){
            for (int j = 1 + i; j <arreglo.length; j++){
                if (arreglo [i] > arreglo [j]){
                    int temp = arreglo[i];
                    arreglo [i] = arreglo[j];
                    arreglo [j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arreglo));
    }
    
}
