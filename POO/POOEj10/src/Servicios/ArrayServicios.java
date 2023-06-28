/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. 
 */
package Servicios;

import Entidades.Array;
import java.util.Arrays;


public class ArrayServicios {
    
    public void llenarArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random()*10;
        }
    }
    
    public void imprimirArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
    }
    
    public void ordenarArreglo(double[] arreglo){
        Arrays.sort(arreglo);
    }
    
      public void llenarArregloB(double[] arreglo, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arreglo[i];
        }
        
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }
    }
    
}
