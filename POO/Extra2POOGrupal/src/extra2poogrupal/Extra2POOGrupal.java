/*
ejercicio 1:
Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.

El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
manipular los textos.

El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.

Metodos de ambas entidades (realizar los metodos en las clases de
servicio):
Crear Película
Crear Alquiler
Listar todas las películas disponibles
Listar todas los alquileres
Buscar una película por título (Decir si se existe o no)
Buscar una película por género (Decir si se existe o no)
Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
interés.)

El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
contrario. El programa debe terminar cuando el usuario elija la opción de salir.

Deben:
Se deben crear al menos 5 películas, junto con todos sus datos.
Se deben realizar 3 alquileres de películas.
Mostrar todas las películas cargadas.
Mostrar todos los alquileres realizados.
Será importante que al realizar el programa, hacer sus respectivos servicios (AlquilerService y PeliculaService)
 */
package extra2poogrupal;

import Entidades.Alquiler;
import Entidades.Pelicula;
import Servicios.AlquilerServicios;
import Servicios.PeliculaServicios;


public class Extra2POOGrupal {

  
    public static void main(String[] args) {
        
        AlquilerServicios as = new AlquilerServicios();
        PeliculaServicios ps = new PeliculaServicios();
        
        Pelicula [] listaPeli = new Pelicula[2]; // aca creamos un vector que almacena 5 objetos "Pelicula"
        
        for (int i = 0; i < 2; i++) {
            listaPeli[i] = ps.crearPelicula();
        }
        
        
        Alquiler alquiler1 = as.crearAlquiler(listaPeli, ps);
        System.out.println("Aca vamos a listar a ver si afecto a la lista");
        ps.listarPelicula(listaPeli);
        
        System.out.println(alquiler1.toString());
     
    }
    
}
