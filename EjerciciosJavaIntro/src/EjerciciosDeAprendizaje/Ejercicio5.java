/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        
        System.out.println("El doble de " + num + " es " + num*2);
        System.out.println("El triple de " + num + " es " + num*3);
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
    }
    
}
