/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
Java.
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio3 {

   
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("Su frase en mayusculas queda asi: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("Su frase en minúsculas queda asi: " + frase.toLowerCase());
        
        
    }
    
}
