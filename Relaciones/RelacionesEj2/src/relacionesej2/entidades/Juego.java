/*
2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica 
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. 
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package relacionesej2.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver revolver;
    private Scanner leer;

    public Juego() {
        jugadores = new ArrayList();
        revolver = new Revolver();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    /*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.*/
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        System.out.println("Indique la cantidad de jugadores, podrán ser hasta 6 como máximo.");
        int cant = leer.nextInt();

        switch (cant) {
            case 1:
                System.out.println("Se ha seleccionado 1 jugador, por favor ingrese sus datos.");
                Jugador jugador = new Jugador();
                System.out.print("Nombre: ");
                jugador.setNombre(leer.next());
                jugador.setId(1);
                jugadores.add(jugador);
                break;

            case 2:
                System.out.println("Se ha seleccionado 2 jugadores, por favor ingresen sus datos.");

                for (int i = 0; i < 2; i++) {
                    Jugador jugador2 = new Jugador();
                    System.out.print("Nombre del Jugador N°" + (i + 1) + " ");
                    jugador2.setNombre(leer.next());
                    jugador2.setId(i + 1);
                    jugadores.add(jugador2);
                }

                break;

            case 3:
                System.out.println("Se ha seleccionado 3 jugadores, por favor ingresen sus datos.");

                for (int i = 0; i < 3; i++) {
                    Jugador jugador3 = new Jugador();
                    System.out.print("Nombre del Jugador N°" + (i + 1) + " ");
                    jugador3.setNombre(leer.next());
                    jugador3.setId(i + 1);
                    jugadores.add(jugador3);
                }
                break;

            case 4:
                System.out.println("Se ha seleccionado 4 jugadores, por favor ingresen sus datos.");

                for (int i = 0; i < 4; i++) {
                    Jugador jugador4 = new Jugador();
                    System.out.print("Nombre del Jugador N°" + (i + 1) + " ");
                    jugador4.setNombre(leer.next());
                    jugador4.setId(i + 1);
                    jugadores.add(jugador4);
                }
                break;

            case 5:
                System.out.println("Se ha seleccionado 5 jugadores, por favor ingresen sus datos.");

                for (int i = 0; i < 5; i++) {
                    Jugador jugador5 = new Jugador();
                    System.out.print("Nombre del Jugador N°" + (i + 1) + " ");
                    jugador5.setNombre(leer.next());
                    jugador5.setId(i + 1);
                    jugadores.add(jugador5);
                }
                break;

            case 6:
                System.out.println("Se ha seleccionado 6 jugadores, por favor ingresen sus datos.");

                for (int i = 0; i < 6; i++) {
                    Jugador jugador6 = new Jugador();
                    System.out.print("Nombre del Jugador N°" + (i + 1) + " ");
                    jugador6.setNombre(leer.next());
                    jugador6.setId(i + 1);
                    jugadores.add(jugador6);
                }
                break;

            default:
                System.out.println("Por defecto la cantidad de jugadores será de 6.");
                for (int i = 0; i < 6; i++) {
                    Jugador jugador6 = new Jugador();
                    System.out.print("Nombre del Jugador N°" + (i + 1) + " ");
                    jugador6.setNombre(leer.next());
                    jugador6.setId(i + 1);
                    jugadores.add(jugador6);
                }
                break;
        }

        revolver.llenarRevolver();

    }

    /*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    public void ronda() {

        System.out.println("\n Comienza el juego!");

        for (int i = 0; i < jugadores.size(); i++) {

            System.out.println("\n Turno del jugador " + jugadores.get(i).getNombre() + " N°" + jugadores.get(i).getId());

            System.out.println("(verifico el estado del jugador) El jugador esta mojado? " + jugadores.get(i).getMojado());
            System.out.print("Verificamos la posicion Actual y del Agua, si son iguales el jugador se moja,"
                    + "\n sino continua al siguiente ");
            System.out.println(revolver.toString());
            System.out.println("\n Procede a disparar");
            

            if (jugadores.get(i).disparo(revolver)) {

                System.out.println("El jugador se ha mojado! fin del juego");
                break;

            } else {

                System.out.println("El jugador no se ha mojado, continua el siguiente.");

            }

            if (i == jugadores.size() - 1) {

                i = -1;

            }

        }

    }

}
