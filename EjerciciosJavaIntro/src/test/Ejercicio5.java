
package test;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) { 
 Scanner leer = new Scanner(System.in); 
 System.out.println("Ingresa tu nombre");
 String nombre = leer.nextLine();
 
 System.out.println("Ingresa tu edad");
 int edad = leer.nextInt();
 System.out.println("Hola " + nombre + " tienes " + edad + " años.");
 }
}
    

