/*
Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las reservas desde internet. el
hotel cuenta con 10 Habitaciones, de las cuales:
Habitacion 1 - 5: Entran 2 personas
Habitacion 6 - 8: Entran hasta 3 personas
Habitacion 9 - 10: Entra 1 sola persona
Realizar un programa en donde se muestren la siguiente información:

• Persona (Nombre, Edad, DNI, País)
• Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
• Reserva (ID, Numero de habitación, cantidad de personas, fechas)
• Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
será necesario guardar el id de la reserva)

    IMPORTANTE
    • Se debe realizar un CRUD que sea necesario. (Crear, Leer, Modificar o Eliminar)
    • El programa debe tener un menú para las diferentes opciones.
    • Podrás crear los métodos que sean necesarios para que el programa sea más completo.
    • Se deberá subir a GitHub y compartir entre integrantes del mismo equipo.
    • Se deberán realizar las pruebas unitarias en JUnit para los métodos creados. (Solo si sobra tiempo)
 */
package desafiocollecciones.servicios;

import desafiocollecciones.entidades.Habitacion;
import desafiocollecciones.entidades.Reserva;
import desafiocollecciones.entidades.util.Setup;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelServicios extends Setup {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//    List<Setup> listaSet = new ArrayList<>();
//    public Setup listSetup;
    public int buscarHabitacion(int cant) {
        int retorno = 0;
        for (Habitacion habitacion : hab) {

            if (habitacion.getCapacidad() == cant) {

                retorno = habitacion.getNumHab();
            }

        }
        return retorno;
    }

    public void crearReserva(ArrayList<Reserva> reserva) {
        
        
        System.out.println("Por favor complete los datos para su reserva");

        System.out.print("¿Cuantas personas van alojarse?");
        int cant = leer.nextInt();

        switch (cant) {
            case 1:
                buscarHabitacion(cant);

                break;
            case 2:
                buscarHabitacion(cant);

                break;
            case 3:
                buscarHabitacion(cant);

                break;
            default:
                System.out.println("No disponemos de habitaciones para su solicitud.");
                throw new AssertionError();
        }

        /*
         private int id;
    private int numHab;
    private int cantPersonas;
    private LocalDate fechaIng;
    private LocalDate fechaEg;
         */
    }

}
