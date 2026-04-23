package Ejemplos;
public class ComplejidadLogaritmica {
    public void metodoComplejidadLogaritmica(){
        //El tiempo aumenta lentamente, 
        // típico de algoritmos que dividen el problema a la mitad en cada paso,
        //  como la búsqueda binaria.

        //Cabe aclarar que para poder cumplir este algoritmo es obligatorio que nuestro arreglo este previamente ordenado
        // Se declara el arreglo
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80};
        // declaramos variables necesarias para el funcionamiento de la busqueda binaria
        boolean find = false;
        int busca = 70;
        int inicio = 0;
        int fin = numeros.length - 1;
        int medio;

        while (inicio<=fin){
            medio = (inicio + fin)/2;
            if (numeros[medio]== busca){
                find=true;
                break;
            }else if(numeros[medio]<busca){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }

        }
        if (find){
            System.out.println("El numero " + busca + " se encuentra presente en el arreglo");
        }else{
            System.out.println("El numero " + busca + " no se encuentra presente en el arreglo");
        }
    }
    
}
