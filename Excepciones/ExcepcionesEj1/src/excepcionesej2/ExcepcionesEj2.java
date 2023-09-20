/*
    2- Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
    generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
    de rango).
 */
package excepcionesej2;

import excepcionesej2.entidades.Cajonera;


public class ExcepcionesEj2 {


    public static void main(String[] args) {
        
        Cajonera caj = new Cajonera();
        Cajonera caj2 = new Cajonera(5);
        // Intentamos asignar valores en índices fuera de rango
        caj.asignarValor(0, 10);
        caj2.asignarValor(1, 20);
        caj.asignarValor(10, 30); // Esto provocará una excepción ArrayIndexOutOfBoundsException
        
    }
    
}
