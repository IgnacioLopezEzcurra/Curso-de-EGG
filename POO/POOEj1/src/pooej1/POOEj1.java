
package pooej1;
import Entidades.Libro;
import Servicios.ServicioLibro;
import java.util.Scanner;

public class POOEj1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        ServicioLibro sl = new ServicioLibro();
        System.out.println("Vamos a cargar el primer libro");
        Libro l1 = sl.cargarLibro();
        ServicioLibro.mostrar(l1);
        System.out.println("---------------");  
        
        //Otro objeto Libro
        System.out.println("Ahora vamos a cargar otro libro");
        Libro l2 = sl.cargarLibro();
        ServicioLibro.mostrar(l2);
       
 
    }
    
}
