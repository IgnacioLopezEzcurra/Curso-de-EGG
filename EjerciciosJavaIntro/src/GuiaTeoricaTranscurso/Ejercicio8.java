/*
EJERCICIO 8 
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta.
 */
package GuiaTeoricaTranscurso;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String args[]){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la nota:");
        int nota = leer.nextInt();
        
        
       while (nota < 0 || nota > 10){
            
           System.out.println("La nota ingresada no esta entre 0 y 10 vuelva a ingresar una nueva nota");
           nota = leer.nextInt();
       }
        System.out.println("Felicidades, la nota esta entre 0 y 10");
    }

}
