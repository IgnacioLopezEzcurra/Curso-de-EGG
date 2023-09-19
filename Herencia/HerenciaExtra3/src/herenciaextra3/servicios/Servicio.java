/*
Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
 */
package herenciaextra3.servicios;

import herenciaextra3.entidades.Alojamiento;
import herenciaextra3.entidades.Hotel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servicio {

    Scanner leer;
    ArrayList<Alojamiento> lista;

    public ArrayList<Alojamiento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alojamiento> lista) {
        this.lista = lista;
    }

    public Servicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        lista = new ArrayList<Alojamiento>();
    }

    public void menu() {

        System.out.println("---BIENVENIDO AL SISTEMA DE COMPAÑIA TURISTICA---");
        System.out.println("Escoja una opcion"
                + "\n   1- Ver todos los alojamientos"
                + "\n 2- Ver todos los hoteles de mas caro a mas barato"
                + "\n 3- Ver todos los campings con restaurante"
                + "\n 4- Ver todas las residencias que tienen descuento.");

        int rta = leer.nextInt();

        switch (rta) {
            case 1:
                verTodosLosAlojamientos(lista);
                break;
            case 2:
                verHotelesCaroBarato(lista);
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Pusiste cualquier numero capo.");
        }

    }

    private void verTodosLosAlojamientos(ArrayList<Alojamiento> alojamientos) {

        for (Alojamiento alojamiento : alojamientos) {
            System.out.println("---Aqui tenemos guardado a: ----");
            System.out.println(alojamiento.toString());
            System.out.println("-------------------");
        }

    }

    private void verHotelesCaroBarato(ArrayList<Alojamiento> lista) {
        Collections.sort(Alojamiento, (hotel1, hotel2) -> Double.compare(hotel2.getPrecio(), hotel1.getPrecio()));

    }
    
    

}
