/*
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
 
package Entidades;


public class Pelicula {
    
    private String titulo, genero;
    private int anio, duracion;
    private boolean disponibilidad;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duracion, boolean disponibilidad) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

 
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
       @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + '}';
    }
    

    
}
