/*
Realizar una aplicación de Gimnasio, que permita tener agregar clientes, y rutinas. Para ello, vamos a utilizar diferentes
clases y metodos.

CLASES:
• Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo
(cadena de caracteres)
• Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
descripcion
• Crea una clase ServicioCliente y una clase ServicioRutina.

 */
package extra3poogrupal;

import Entidades.Cliente;
import Entidades.Rutina;
import Servicios.ServicioCliente;
import Servicios.ServicioRutina;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra3POOGrupal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCliente sc = new ServicioCliente();
        ServicioRutina sr = new ServicioRutina();

        ArrayList<Rutina> listaRutina = new ArrayList<Rutina>();

        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        //Creamos diferentes objetos Clientes
        for (int i = 0; i < 2; i++) {
            Cliente c = sc.registrarCliente();
            lista.add(c);
        }

        sc.obtenerClientes(lista);
        System.out.println("Indique que cliente quiere actualizar, ingrese su ID");
        sc.actualizarCliente(leer.nextInt(), lista);
        System.out.println("Indique que cliente quiere eliminar segun su ID:");
        sc.eliminarCliente(leer.nextInt(), lista);
        sc.obtenerClientes(lista);

        for (int i = 0; i < 2; i++) {
            Rutina r = sr.crearRutina();
            listaRutina.add(r);
        }
        System.out.println("Aca te imprimo la lista de rutinas");
        sr.obtenerRutinas(listaRutina);

        System.out.println("Indique que rutina quiere actualizar segun su ID");
        sr.actualizarRutina(leer.nextInt(), listaRutina);
        sr.obtenerRutinas(listaRutina);

        System.out.println("Elimine una rutina segun su ID");
        sr.eliminarRutina(leer.nextInt(), listaRutina);
        sr.obtenerRutinas(listaRutina);

    }

}
