/*
1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros
 */
package relacionesextra1.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesextra1.entidades.Perro;
import relacionesextra1.entidades.Persona;

public class Servicio {

    Scanner leer;
    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;

    public Servicio() {
        this.personas = new ArrayList();
        this.perros = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPerros() {

        System.out.println("Ingrese la cantidad de perros que desee crear: ");
        int cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {
            Perro p1 = new Perro();
            System.out.println("Ingrese el nombre del perro n°" + (i + 1));
            p1.setNombre(leer.next());

            System.out.println("Ingrese raza del perro n°" + (i + 1));
            p1.setRaza(leer.next());

            System.out.println("Ingrese edad del perro n°" + (i + 1));
            p1.setEdad(leer.next());

            System.out.println("Ingrese tamaño del perro n°" + (i + 1));
            p1.setTamanio(leer.next());

            perros.add(p1);
        }

    }

    public void crearPersonas() {

        System.out.println("Ingrese la cantidad de personas que desee crear: ");
        int cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {
            Persona perso = new Persona();
            System.out.println("Ingrese el nombre de la persona n°" + (i + 1));
            perso.setNombre(leer.next());

            System.out.println("Ingrese el apellido de la persona n°" + (i + 1));
            perso.setApellido(leer.next());

            System.out.println("Ingrese la edad de la persona n°" + (i + 1));
            perso.setEdad(leer.next());

            System.out.println("Ingrese el documento de la persona n°" + (i + 1));
            perso.setDocumento(leer.next());

            personas.add(perso);
        }

    }

    public void adoptarPerro() {

        for (Persona persona : personas) {
            System.out.println("¿Que perro desea adoptar " + persona.getNombre() + "?");
            System.out.println("---Los perros son los siguientes---");

            for (Perro perro : perros) {
                System.out.println(perro);
            }
            System.out.println("\nPor favor ingrese a continuacion el nombre del perro que desee adoptar:");

            String nombre = leer.next();
            boolean bandera = false;

            for (int i = 0; i < perros.size(); i++) {

                if (nombre.equalsIgnoreCase(perros.get(i).getNombre())) {
                    persona.setPerro(perros.get(i));
                    perros.remove(i);
                    bandera = true;
                    break;
                }

            }

            if (!bandera) {
                System.out.println("El perro no existe o ya ha sido adoptado.");
            }

        }

    }

    public void mostrarPersonaYPerro() {

        for (Persona persona : personas) {

            if (persona.getPerro() == null) {

                System.out.println("El es " + persona.getNombre()
                        + " y no ha adoptado ningun perro");
            } else {
                System.out.println("El es " + persona.getNombre()
                        + " y su perro es " + persona.getPerro());
            }

        }

    }

    public void mostrarPerros() {

        for (Perro perro : perros) {
            System.out.println(perro);
        }

    }

}
