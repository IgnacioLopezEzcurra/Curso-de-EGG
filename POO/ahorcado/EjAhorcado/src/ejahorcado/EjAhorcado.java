/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejahorcado;

import java.util.Scanner;
import servicio.Service;

/**
 *
 * @author maria
 */
public class EjAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        Service ser = new Service ();
        
        //ser.crearJuego();
        //ser.longitud();
//        System.out.println("Escribe una letra");
//        String letra = leer.next();
        //ser.buscar(letra);
        
        ser.juego();
        
    }
    
}
