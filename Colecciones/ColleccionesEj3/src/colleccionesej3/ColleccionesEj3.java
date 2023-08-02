/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main.
 */
package colleccionesej3;

import colleccionesej3.entidades.Alumno;
import colleccionesej3.servicios.AlumnoServicio;
import java.util.Scanner;

public class ColleccionesEj3 {

    public static void main(String[] args) {

        AlumnoServicio as = new AlumnoServicio();

        as.crearAlumno();

        as.imprimirListaAlumnos();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno para calcular su promedio final:");
        String nombreAlumno = leer.nextLine();

        double promedioFinal = as.notaFinal(nombreAlumno);
        if (promedioFinal != -1) {
            System.out.println("El promedio final de " + nombreAlumno + " es: " + promedioFinal);
        } else {
            System.out.println("No se encontró al alumno " + nombreAlumno + " en la lista.");
        }

    }

}
