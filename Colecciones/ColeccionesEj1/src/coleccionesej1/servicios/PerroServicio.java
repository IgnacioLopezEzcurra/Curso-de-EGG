/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package coleccionesej1.servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {

    Scanner leer;

    private ArrayList<String> razas;

    public PerroServicio() {
        this.razas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarListaRazas() {

        int opcion = 0;
        do {
            System.out.println("Ingrese una raza de perro: ");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("Desea guardar otro perro? "
                    + "Escoja '1' para Si, '2' para Salir.");
            opcion = leer.nextInt();
            
            while (opcion != 1 && opcion != 2) {
                System.out.println("Ha ingresado un numero incorrecto "
                        + "Escoja '1' para Si, '2' para Salir.");
                opcion = leer.nextInt();
            }

        } while (opcion != 2);

        // Al salir de la carga imprimimos
        System.out.println("La lista de razas es la siguiente:");
        for (String razasGuardadas : razas) {
            System.out.println(razasGuardadas);
        }
        System.out.println("La cantidad de razas de perros en la lista es de " + razas.size());

    }

}
