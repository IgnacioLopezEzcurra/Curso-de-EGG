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

import java.time.LocalDate;


public class Reserva {
    
    public static int id = 0;
    private int numHab;
    private int cantPersonas;
    private LocalDate fechaIng;
    private LocalDate fechaEg;

    public Reserva() {
    }

    public Reserva(int id, int numHab, int cantPersonas, LocalDate fechaIng, LocalDate fechaEg) {
        this.id = id++;
        this.numHab = numHab;
        this.cantPersonas = cantPersonas;
        this.fechaIng = fechaIng;
        this.fechaEg = fechaEg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LocalDate getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(LocalDate fechaIng) {
        this.fechaIng = fechaIng;
    }

    public LocalDate getFechaEg() {
        return fechaEg;
    }

    public void setFechaEg(LocalDate fechaEg) {
        this.fechaEg = fechaEg;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", numHab=" + numHab + ", cantPersonas=" + cantPersonas + ", fechaIng=" + fechaIng + ", fechaEg=" + fechaEg + '}';
    }
    
    
    
    
}
