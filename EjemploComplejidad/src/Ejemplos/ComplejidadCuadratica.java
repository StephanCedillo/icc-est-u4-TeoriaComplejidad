package Ejemplos;

import java.util.Arrays;

public class ComplejidadCuadratica {
    public void metodoComplejidadCuadratica(){
        int [] arreglo = {4,3,2,5,1,7,6};
        System.out.println(Arrays.toString(arreglo));
        for ( int i = 0 ; i < arreglo.length; i++){
            for (int j = 0; j <arreglo.length-i-1; j++){
                if (arreglo [j] > arreglo [j+1]){
                    int temp = arreglo[j];
                    arreglo [j] = arreglo[j+1];
                    arreglo [j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arreglo));
    }
    
}
