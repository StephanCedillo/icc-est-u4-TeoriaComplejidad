package Ejemplos;
import java.util.Random;
public class ComplejidadLineal {
    public void metodoComplejidadLineal(){
        Random random = new Random();
        int tamaño = 1000000;
        int [] arreglo1 = new int[tamaño];
        for (int i = 0; i<arreglo1.length;i++){
            arreglo1[i] = random.nextInt(10);
        }
        //El tiempo de ejecucion aumenta cada vez tengamos mas datos
        for (int i = 0; i < arreglo1.length;i++){
             System.out.println(arreglo1[i]);
        }
    }
}
