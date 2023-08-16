/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.

EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionesmanosalaobra;

import java.util.Scanner;
import relacionesmanosalaobra.entidades.Dni;
import relacionesmanosalaobra.entidades.Equipo;
import relacionesmanosalaobra.entidades.Jugador;
import relacionesmanosalaobra.entidades.Persona;


public class RelacionesManosALaObra {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Ejercicio 1 de Manos a la obra
        Persona perso = new Persona();
        perso.setNombre("Ignacio");
        perso.setApellido("López Ezcurra");
        Dni dni = new Dni();
        
        perso.setDni(dni);
        perso.getDni().setSerie("A");
        perso.getDni().setNum("37010524");
        
        System.out.println(perso);
        
        // Ejercicio 2 de Manos a la obra
        
        
        Equipo boke = new Equipo();
        
        
        
        for (int i = 0; i < 3; i++) {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese el nombre del jugador");
            jugador.setNombre(leer.next());
            System.out.println("Ingrese el apellido del jugador");
            jugador.setApellido(leer.next());
            System.out.println("Ingrese la posicion del jugador");
            jugador.setPosicion(leer.next());
            System.out.println("Ingrese el numero del jugador");
            jugador.setNum(leer.next());
            
            boke.getJugadores().add(jugador);
        }
        
        System.out.println(boke);
        
    }
    
}
