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
import java.util.Comparator;
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

//    private void verHotelesCaroBarato(ArrayList<Alojamiento> lista) {
//        Collections.sort(Alojamiento, (hotel1, hotel2) -> Double.compare(hotel2.getPrecio(), hotel1.getPrecio()));
//
//    }
//
//    public static Comparator<Hotel> verHotelesCaroBarato = new Comparator<Hotel>() { // Creamos un objeto comparator 
//
//        // Usamos el override para traer un metodo de otra clase y poder usarlo
//        @Override
//        public int compare(Hotel t, Hotel t1) {// Le pasamos dos objetos a comparar
//            return Double.compare(t.getPrecioHab(), t1.getPrecioHab()); // Los comparamos usando el get y el compareTo
//        }
//    };
    
    public static Comparator<Alojamiento> compararHotelesAscendente = new Comparator<Alojamiento>() {
    @Override
    public int compare(Alojamiento alojamiento1, Alojamiento alojamiento2) {
        if (alojamiento1 instanceof Hotel && alojamiento2 instanceof Hotel) {
            // Ambos alojamientos son instancias de Hotel (pueden ser Hotel4Estrellas o Hotel5Estrellas)
            Hotel hotel1 = (Hotel) alojamiento1;
            Hotel hotel2 = (Hotel) alojamiento2;

            // Realizar la comparación de hoteles basada en el criterio deseado (por ejemplo, el precio)
            return Double.compare(hotel1.getPrecioHab(), hotel2.getPrecioHab());
        } else {
            // Si alguno de los alojamientos no es un Hotel, puedes manejarlo aquí según tu lógica
            // Por ejemplo, si deseas que los no-hoteles vengan antes o después, puedes hacerlo aquí
            return 0; // O alguna otra lógica de comparación adecuada
        }
    }
};

}
