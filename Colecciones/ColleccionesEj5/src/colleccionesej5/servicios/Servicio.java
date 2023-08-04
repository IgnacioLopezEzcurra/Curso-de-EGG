/*
5.
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario.
 */
package colleccionesej5.servicios;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Servicio {

    private final Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
    private TreeSet<String> listaPaises = new TreeSet();

    public void agregarPais() {
        
        String rta = "";

        do {

            System.out.println("Ingrese país a agregar a la lista");
            listaPaises.add(leer.next());
            
            System.out.println("¿Desea guardar otro país? S/N");
            rta = leer.next();
            
                 while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado un numero incorrecto "
                        + "Escoja 'S' para Si, 'N' para Salir.");
                rta = leer.next();
            }
            
        } while (rta.equalsIgnoreCase("s"));
        
        System.out.println("---LISTA COMPLETA ALFABETICAMENTE---");
        for (String listaPaise : listaPaises) {
            System.out.println(listaPaise);
        }
        
       Iterator<String> it = listaPaises.iterator();

        System.out.println("Ingrese un pais. Aquel que ingrese se eliminara de la lista en caso de encontrarse dentro de ella");
        String pais = leer.next();
        boolean aviso = false;

        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equalsIgnoreCase(pais)) {
                aviso = true;
                it.remove();
            }
        }

        if (aviso) {
            System.out.println("Tu país se ha encontrado en la lista, será eliminado.");
        } else {
            System.out.println("Tu país no se ha encontrado en la lista.");
        }
        
         for (String paisElegido : listaPaises) {
            System.out.println(paisElegido);
        } 

    }
    
    

}
