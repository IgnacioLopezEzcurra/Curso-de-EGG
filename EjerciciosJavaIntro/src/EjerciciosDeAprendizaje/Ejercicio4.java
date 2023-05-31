/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;


public class Ejercicio4 {


    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de grados centigrados: ");
        double c = leer.nextDouble();
        double f = 32 + (9 * c / 5);
        System.out.println("");
        System.out.println("Sus " + c + "° grados centígrados equivalen a " + f + "° grados Fahrenheit");
    }
    
}
