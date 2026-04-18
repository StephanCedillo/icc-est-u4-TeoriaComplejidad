package Ejemplos;

import java.util.Arrays;

public class ComplejidadLogaritmica {
    public void metodoComplejidadLogaritmica(){
        //El tiempo aumenta lentamente, 
        // típico de algoritmos que dividen el problema a la mitad en cada paso,
        //  como la búsqueda binaria.
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80};
        int indice = Arrays.binarySearch(numeros, 70); 
    }
    
}
