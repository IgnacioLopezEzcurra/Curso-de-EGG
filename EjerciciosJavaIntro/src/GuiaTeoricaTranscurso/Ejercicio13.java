/*
EJERCICIO 13 y 14
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
 */


package GuiaTeoricaTranscurso;
import java.util.Scanner;


public class Ejercicio13 {
    
    public static void main(String args[]){
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la dimension de su equipo: ");
        int dim = leer.nextInt();
        
         // Descartar el carácter de nueva línea restante en el búfer
         leer.nextLine();
        
    String [] Equipo = new String[dim];
    
        for (int i = 0; i < dim; i++) {
           
            System.out.println("Por favor ingrese el nombre del integrante N°" + (i+1));
            Equipo[i] = leer.nextLine();
        }
        
        
        for (int i = 0; i < dim; i++) {
            
            System.out.println("El nombre del integrante N°" + (i+1) + " es " + Equipo[i]);
            
        }
    
    }
    
    
}
