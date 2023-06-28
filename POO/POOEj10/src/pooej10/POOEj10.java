/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. 

 */
package pooej10;

import Entidades.Array;
import Servicios.ArrayServicios;

public class POOEj10 {

    public static void main(String[] args) {

        Array A = new Array(50);
        Array B = new Array(20);

        ArrayServicios as = new ArrayServicios();

        as.llenarArreglo(A.getArreglo());
        System.out.println("--------ARREGLO A--------");
        as.imprimirArreglo(A.getArreglo());
        System.out.println("");
        
        System.out.println("--------ORDENAR DE MENOR A MAYOR--------");
        System.out.println("");
        as.ordenarArreglo(A.getArreglo());
        as.imprimirArreglo(A.getArreglo());
        System.out.println("");
        System.out.println("--------COPIAR LOS PRIMEROS 10 de 'A' y sumarlos a 'B'--------");
        System.out.println("");
        System.out.println("--------ARREGLO B--------");

        as.llenarArregloB(A.getArreglo(), B.getArreglo());
        as.imprimirArreglo(B.getArreglo());

    }

}
