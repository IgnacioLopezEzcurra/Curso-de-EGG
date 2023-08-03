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
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package colleccionesej4;

import colleccionesej4.entidades.Pelicula;
import colleccionesej4.servicios.PeliculaServicios;
import java.util.Collections;

public class ColleccionesEj4 {

    public static void main(String[] args) {

        PeliculaServicios ps = new PeliculaServicios();
        ps.crearPelicula();
        System.out.println("\n---AQUI IMPRIMIMOS TODA LA LISTA---");
        ps.mostrarPeliculas();

        System.out.println("\n---AQUI IMPRIMIMOS LAS MAYORES A 1 HORA---");
        ps.mostrarPeliculasMayorAUnaHora();

        System.out.println("\n---AQUI IMPRIMIMOS DURACION DE MENOR A MAYOR---");
        ps.ordenarDuracionMenorMayor();
        ps.mostrarPeliculas();

        System.out.println("\n AHORA AL REVES");
        ps.ordenarDuracionMayorMenor();
        ps.mostrarPeliculas();

        System.out.println("\n---AQUI IMPRIMIMOS POR DIRECTOR ALFABETICAMENTE---");
        ps.ordenarPorDirector();
        ps.mostrarPeliculas();

        System.out.println("\n---AQUI IMPRIMIMOS POR TITULO ALFABETICAMENTE---");
        ps.ordenarPorTitulo();
        ps.mostrarPeliculas();
    }

}
