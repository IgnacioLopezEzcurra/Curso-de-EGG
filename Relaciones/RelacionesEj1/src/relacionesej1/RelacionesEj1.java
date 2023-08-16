/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesej1;

import relacionesej1.entidades.Perro;
import relacionesej1.entidades.Persona;
import relacionesej1.servicios.Servicio;

public class RelacionesEj1 {

    public static void main(String[] args) {

        Servicio ser = new Servicio();

        Perro perro1 = ser.crearPerro();
        Persona perso1 = ser.crearPersona(perro1);

        Perro perro2 = ser.crearPerro();
        Persona perso2 = ser.crearPersona(perro2);

        System.out.println("---Persona 1---");

        System.out.println(perso1);

        System.out.println("\n---Persona 2---");
        System.out.println(perso2);

        Persona perso3 = ser.crearPersonaYPerro();

        System.out.println("\n---Persona 3---");
        System.out.println(perso3);

    }

}
