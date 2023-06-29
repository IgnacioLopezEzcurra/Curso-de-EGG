/*
13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un 
programa para organizar la información de cada curso. Para ello, crearemos una clase 
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, 
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde 
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los 
nombres de cada alumno. A continuación, se implementarán los siguientes métodos: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el 
nombre de cada alumno. 
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor 
al atributo alumnos 
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
se repite el encuentro. 
 */
package Servicios;

import java.util.Scanner;
import Entidad.Curso;

public class CursoServicios {

    public void cargarAlumnos(Curso curso) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String alumno[] = new String[5];
        System.out.println("Ingrese los nombres de los alumnos");

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Cargue el alumno N°" + (i + 1));
            alumno[i] = leer.nextLine();
        }
        
        curso.setAlumnos(alumno);
        
    }

    public Curso crearCurso() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Usted esta por crear un nuevo curso");
        System.out.println("Ingrese su nombre del curso: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese turno del curso: ");
        String turno = leer.nextLine();
        
        System.out.println("Ingrese cantidad horas por dia: ");
        int cantHorasPorDia = leer.nextInt();
        
        System.out.println("Ingrese cantidad dias por semana: ");
        int cantDiasPorSemana = leer.nextInt();
        
        System.out.println("Ingrese precio por hora: ");
        double precioPorHora = leer.nextDouble();
        
        Curso curso = new Curso(nombre, turno, cantHorasPorDia, cantDiasPorSemana, precioPorHora );
        cargarAlumnos(curso); // Llamada al método cargarAlumnos() para ingresar los nombres de los alumnos
        
        return curso;

    }
    
    public double calcularGananciaSemanal(Curso curso){
    
        return curso.getCantidadDiasPorSemana()*curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getAlumnos().length;
    
    }

}
