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
package desafiocollecciones.entidades;


public class Alojamiento {
    
    private Reserva reserva;
    public static int idAloj = 0;

    public Alojamiento() {
    }

    public Alojamiento(Reserva reserva, int idAloj) {
        this.reserva = reserva;
        this.idAloj = idAloj++;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getId() {
        return idAloj;
    }

    public void setId(int idAloj) {
        this.idAloj = idAloj;
    }
    
    
    
}
