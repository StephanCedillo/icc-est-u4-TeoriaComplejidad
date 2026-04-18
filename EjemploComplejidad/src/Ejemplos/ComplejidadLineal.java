package Ejemplos;
import java.util.Arrays;
public class ComplejidadLineal {
    public void metodoComplejidadLineal(){
        int sum = 0;
        int [] arreglo1 = {1,3,5,6,2,8};
        System.out.println(Arrays.toString(arreglo1));
        for (int i = 0; i < arreglo1.length;i++){
             sum += arreglo1[i];
        }
        System.out.println(sum);
    }
}
