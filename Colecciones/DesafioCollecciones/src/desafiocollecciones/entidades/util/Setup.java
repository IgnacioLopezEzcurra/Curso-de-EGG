/*

 */
package desafiocollecciones.entidades.util;

import desafiocollecciones.entidades.Alojamiento;
import desafiocollecciones.entidades.Habitacion;
import desafiocollecciones.entidades.Persona;
import desafiocollecciones.entidades.Reserva;
import java.util.ArrayList;

public class Setup {

    ArrayList<Alojamiento> alo = new ArrayList<>();
    public ArrayList<Habitacion> hab = new ArrayList<>();
    ArrayList<Persona> per = new ArrayList<>();
    ArrayList<Reserva> res = new ArrayList<>();

    public Setup() {
        Habitacion h1 = new Habitacion(1, 2, true);
        Habitacion h2 = new Habitacion(2, 2, true);
        Habitacion h3 = new Habitacion(3, 2, true);
        Habitacion h4 = new Habitacion(4, 2, true);
        Habitacion h5 = new Habitacion(5, 2, true);

        Habitacion h6 = new Habitacion(6, 3, true);
        Habitacion h7 = new Habitacion(7, 3, true);
        Habitacion h8 = new Habitacion(8, 3, true);

        Habitacion h9 = new Habitacion(9, 1, true);
        Habitacion h10 = new Habitacion(10, 1, true);

        hab.add(h1);
        hab.add(h2);
        hab.add(h3);
        hab.add(h4);
        hab.add(h5);
        hab.add(h6);
        hab.add(h7);
        hab.add(h8);
        hab.add(h9);
        hab.add(h10);

    }
}
