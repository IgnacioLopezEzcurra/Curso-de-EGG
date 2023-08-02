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
package colleccionesej3.servicios;

import colleccionesej3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer;

    private ArrayList<Alumno> listaAlumnos;

    public ArrayList<Alumno> getAlumno() {
        return listaAlumnos;
    }

    public void setAlumno(ArrayList<String> alumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public AlumnoServicio() {
        this.listaAlumnos = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearAlumno() {

        String rta = "";

        int notas = 0;

        do {
            //Nace nuevo alumno e ingresamos su nombre
            int cont = 1;
            Alumno alu = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            alu.setNombre(leer.next());

            //Ahora deberiamos ingresar sus 3 notas y guardarlas en SU lista de SU atributo
            do {
                System.out.println("Ingrese la nota n°" + cont + " del alumno " + alu.getNombre());
                notas = leer.nextInt();
                alu.getNotas().add(notas);
                cont = cont + 1;

            } while (cont <= 3);

            System.out.println("Desea crear otro alumno?(Escriba 'si' o 'no')");
            rta = leer.next();

            listaAlumnos.add(alu);

        } while (rta.equalsIgnoreCase("si"));

    }

    public void imprimirListaAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }

    }
    
    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                ArrayList<Integer> notas = alumno.getNotas();
                double promedio = 0;
                for (int nota : notas) {
                    promedio += nota;
                }
                promedio /= notas.size();
                return promedio;
            }
        }
        return -1; // Si no se encuentra el alumno, se devuelve -1 como indicador de que no se encontró.
    }
    

}
