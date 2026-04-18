import Ejemplos.ComplejidadConstante;
import Ejemplos.ComplejidadCuadratica;
import Ejemplos.ComplejidadLineal;
import Ejemplos.ComplejidadLogaritmica;
import Ejemplos.ComplejidadLogaritmicaN;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        ComplejidadConstante ejemplo1 = new ComplejidadConstante();
        System.out.println(ejemplo1);

        ComplejidadLineal ejemplo2 = new ComplejidadLineal();
        System.out.println(ejemplo2);

        ComplejidadCuadratica ejemplo3 = new ComplejidadCuadratica();
        System.out.println(ejemplo3);

        ComplejidadLogaritmica ejemplo4= new ComplejidadLogaritmica();
        System.out.println(ejemplo4);

        ComplejidadLogaritmicaN ejemplo5= new ComplejidadLogaritmicaN();
        System.out.println(ejemplo5);

        System.out.println("Menu de opciones:\n"+
            "1.ComplejidadConstante \n" +
            "2.ComplejidadLineal \n" +
            "3.ComplejidadCuadratica \n" +
            "4.ComplejidadLogaritmica \n" +
            "5.0 log 0 \n"+ 
            "6.Salir del programa"
        );
        System.out.print("Ingresar la opcion del menu: ");
        byte numeroMenu=leer.nextByte();
        while (numeroMenu!=6) {
            switch (numeroMenu) {
                case 1:
                    System.out.println("Complejidad Constante - Prueba");    
                    ejemplo1.metodoComplejidadConstante();
                    break;
                case 2:
                    System.out.println("Complejidad Lineal - Prueba");    
                    ejemplo2.metodoComplejidadLineal();
                    break;
                case 3:
                    System.out.println("Complejidad Cuadratica - Prueba");    
                    ejemplo3.metodoComplejidadCuadratica();   
                    break;
                case 4:
                    System.out.println("Compljidad Logaritmica - Prueba");    
                    ejemplo4.metodoComplejidadLogaritmica();      
                    break;
                case 5: 
                    System.out.println("Complejidad O(n log n) - Prueba");    
                    ejemplo5.metodoComplejidadLogaritmicaN();     
                    break;
                case 6:    
                    System.out.println("Salir del programa");    
                    break;
                default:
                    break;
            }
            System.out.print("Ingresar la opcion del menu: ");
            numeroMenu=leer.nextByte();
        }

    }
    
    
}
