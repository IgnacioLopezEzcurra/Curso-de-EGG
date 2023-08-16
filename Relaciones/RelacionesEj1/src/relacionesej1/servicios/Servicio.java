/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesej1.servicios;

import java.util.Scanner;
import relacionesej1.entidades.Perro;
import relacionesej1.entidades.Persona;


public class Servicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        
        Perro p1 = new Perro();
    
//        String nombre, String raza, String edad, String tamaño
                
        System.out.println("Ingrese el nombre del perro:");
        p1.setNombre(leer.next());
        
        System.out.println("Ingrese raza del perro:");
        p1.setRaza(leer.next());
        
        System.out.println("Ingrese edad del perro");
        p1.setEdad(leer.next());
        
        System.out.println("Ingrese tamaño del perro:");
        p1.setTamanio(leer.next());
        
        return p1;
        
    }
    
    public Persona crearPersona(Perro perro){

        Persona perso = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        perso.setNombre(leer.next());
        
        System.out.println("Ingrese el apellido de la persona");
        perso.setApellido(leer.next());
        
        System.out.println("Ingrese la edad de la persona");
        perso.setEdad(leer.next());
        
        System.out.println("Ingrese el documento de la persona");
        perso.setDocumento(leer.next());
        
        perso.setPerro(perro);
        
        return perso;
        
    }
    
     public Persona crearPersonaYPerro(){

        Persona perso = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        perso.setNombre(leer.next());
        
        System.out.println("Ingrese el apellido de la persona");
        perso.setApellido(leer.next());
        
        System.out.println("Ingrese la edad de la persona");
        perso.setEdad(leer.next());
        
        System.out.println("Ingrese el documento de la persona");
        perso.setDocumento(leer.next());
        
        perso.setPerro(crearPerro());
        
        return perso;
        
    }
    
}
