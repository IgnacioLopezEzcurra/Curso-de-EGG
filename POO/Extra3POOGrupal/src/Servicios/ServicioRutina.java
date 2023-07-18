/*
La clase "ServicioRutina" debe tener los siguientes métodos de CRUD:
• crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
• obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
• actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
• eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.

• En el método principal (main):

Una vez terminado de codear, realizar lo siguiente
• Crea al menos cinco clientes con datos ficticios.
• Crea al menos cinco rutinas con datos ficticios.
• Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
• Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
• Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
• Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
• Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
• Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
• Elimina uno de los clientes existentes y muestra la lista de clientes final.
• Elimina una de las rutinas existentes y muestra la lista de rutinas final.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Rutina;
import java.util.ArrayList;

public class ServicioRutina {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rutina crearRutina() {

        Rutina rutina = new Rutina();

        System.out.println("Ingrese el id de la rutina");
        rutina.setId(leer.nextInt());
        System.out.println("Ingrese el nombre de la rutina");
        rutina.setNombre(leer.next());
        System.out.println("Ingrese la duracion en minutos");
        rutina.setDuracion(leer.nextInt());
        System.out.println("Ingrese el nivel de dificultad de la rutina");
        rutina.setNivelDificultad(leer.next());
        System.out.println("Describa la rutina");
        rutina.setDescripcion(leer.next());

        return rutina;
    }

    public ArrayList<Rutina> obtenerRutinas(ArrayList<Rutina> lista) {

        for (Rutina rutina : lista) {
            System.out.println("Rutina: " + rutina.toString());
        }

        return lista;
    }

    public void actualizarRutina(int id, ArrayList<Rutina> lista) {

        boolean bandera = false;

        for (Rutina rutina : lista) {

            if (rutina.getId() == id) {

                System.out.println("Actualice el nivel de dificultad de la rutina");
                rutina.setNivelDificultad(leer.next());
                System.out.println("Actualice la duracion de la rutina");
                rutina.setDuracion(leer.nextInt());
                bandera = true;
                break;
            }

        }

        if (!bandera) {
            System.out.println("La rutina no se ha encontrado.");
        }

    }

    public void eliminarRutina(int id, ArrayList<Rutina> lista) {

        boolean bandera = false;

        for (Rutina rutina : lista) {

            if (rutina.getId() == id) {
                lista.remove(rutina);
                bandera = true;
                break;
            }

        }

        if (!bandera) {
            System.out.println("La rutina no se ha encontrado.");
        }

    }

}
