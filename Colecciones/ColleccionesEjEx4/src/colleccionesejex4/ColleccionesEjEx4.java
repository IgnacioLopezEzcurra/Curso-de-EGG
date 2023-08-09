/*
    Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta 
    página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el 
    número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */

package colleccionesejex4;

import colleccionesejex4.servicios.Servicio;


public class ColleccionesEjEx4 {

 
    public static void main(String[] args) {
        
        Servicio serv = new Servicio();
        
        serv.ingresarCodPost();
//        serv.mostrarLista();
//        serv.buscarCod();
//        serv.agregarCodPost();
//        serv.mostrarLista();
        serv.eliminar();
        
        
    }
    
}
