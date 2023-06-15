
package pooej1;
import Entidades.Libro;
import java.util.Scanner;

public class POOEj1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Vamos a cargar los valores del primer elemento: ");
        Libro l1 = new Libro (leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        
        System.out.println(l1);
 
    }
    
}
