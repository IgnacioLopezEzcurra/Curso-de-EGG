/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package colleccionesej4.servicios;

import colleccionesej4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicios {

    Scanner leer;
    ArrayList<Pelicula> listaPelis;

    public PeliculaServicios() {
        this.listaPelis = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

//    public ArrayList<Pelicula> getListaPelis() {
//        return listaPelis;
//    }
//
//    public void setListaPelis(ArrayList<Pelicula> listaPelis) {
//        this.listaPelis = listaPelis;
//    }
    public void crearPelicula() {

        int opcion = 0;

        do {
            Pelicula peli = new Pelicula();
            System.out.println("¿Como se llama esta pelicula?");
            peli.setTitulo(leer.next());
            System.out.println("¿Quien es su director?");
            peli.setDirector(leer.next());
            System.out.println("¿Qué duración tiene?");
            peli.setDuracion(leer.nextDouble());
            listaPelis.add(peli);

            System.out.println("Desea agregar otra pelicula? "
                    + "Escoja '1' para Si, '2' para Salir.");
            opcion = leer.nextInt();

            while (opcion != 1 && opcion != 2) {
                System.out.println("Ha ingresado un numero incorrecto "
                        + "Escoja '1' para Si, '2' para Salir.");
                opcion = leer.nextInt();
            }

        } while (opcion != 2);

    }

    public void mostrarPeliculas() {

        for (Pelicula peliculas : listaPelis) {
            System.out.println(peliculas);
        }

    }

//     Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliculasMayorAUnaHora() {

        for (Pelicula peliculas : listaPelis) {

            if (peliculas.getDuracion() > 1) {
                System.out.println(peliculas);
            }

        }

    }

//        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void ordenarDuracionMenorMayor() {

        Collections.sort(listaPelis, (Pelicula p1, Pelicula p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));

    }

    public void ordenarDuracionMayorMenor() {
        ordenarDuracionMenorMayor();
        Collections.reverse(listaPelis);

    }

//    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorTitulo() {
        Collections.sort(listaPelis, (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()));
    }

    
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorDirector() {

        Collections.sort(listaPelis, (Pelicula p1, Pelicula p2) -> p1.getDirector().compareToIgnoreCase(p2.getDirector()));

    }


//    public List<Pelicula> listarPeliculasPorTitulo() {
//        Collections.sort(listarPeliculas(), new OrdenarPorTitulo());
//        return listarPeliculas();
//    }
//    
//    class OrdenarPorTitulo implements Comparator<Pelicula> {
//
//        @Override
//        public int compare(Pelicula a, Pelicula b) {
//            return a.getTitulo().toUpperCase().compareTo(b.getTitulo().toUpperCase());
//        }
//    }
}
