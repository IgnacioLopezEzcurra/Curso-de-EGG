/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionesmanosalaobra.entidades;

import java.util.ArrayList;
import java.util.List;


public class Equipo {
    
    private List<Jugador> jugadores;

    public Equipo() {
        
        jugadores = new ArrayList<>();
        
    }

    public Equipo(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

 @Override
    public String toString() {
        StringBuilder equipoString = new StringBuilder("Equipo:\n");
        for (Jugador jugador : jugadores) {
            equipoString.append(jugador.getNombre()).append(" ")
                        .append(jugador.getApellido()).append(" - ")
                        .append(jugador.getPosicion()).append(" (#")
                        .append(jugador.getNum()).append(")\n");
        }
        return equipoString.toString();
    }
    
    
    
}
