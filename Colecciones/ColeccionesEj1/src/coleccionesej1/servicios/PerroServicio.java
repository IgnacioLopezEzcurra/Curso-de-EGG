/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. 

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada.
 */
package coleccionesej1.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicio {

    Scanner leer;

    private ArrayList<String> razas;

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }

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
        
        //AQUI COMIENZA CODIGO PARA EJERCICIO 2

        Iterator<String> it = razas.iterator();

        System.out.println("Ingrese un perro. Aquel que ingrese se eliminara de la lista en caso de encontrarse dentro de ella");
        String perro = leer.next();
        boolean aviso = false;

        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equals(perro)) {
                aviso = true;
                it.remove();
            }
        }

        if (aviso) {
            System.out.println("Tu perro se ha encontrado en la lista, será eliminado.");
        } else {
            System.out.println("Tu perro no se ha encontrado en la lista.");
        }
        
         for (String razasGuardadas : razas) {
            System.out.println(razasGuardadas);
        }

    }

}
