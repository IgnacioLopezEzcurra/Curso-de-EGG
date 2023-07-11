/*
12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
 Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual. 
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
 Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior. 
 */
package Servicios;

import Entidades.Persona;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Usted esta por crear una nueva persona");
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Fecha de nacimiento (dia/mes/año)");
        System.out.println("Ingrese su día: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes: ");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese su año: ");
        int anio = leer.nextInt();
        Date fechaNac = new Date(anio - 1900, mes, dia);

        return new Persona(nombre, fechaNac);

    }

    public void calcularEdad(Persona per) {
        LocalDate fechaNacimiento = per.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int días = periodo.getDays();

        System.out.println("La edad de la persona es " + años + " años, " + meses + " meses y " + días + " días.");
    }
    
    public boolean menorQue(Persona persona, int edad) {
        LocalDate fechaNacimiento = persona.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int años = periodo.getYears();
        return periodo.getYears() < edad;
    }
    
 
    public void mostrarPersona(Persona persona) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + dateFormat.format(persona.getFechaNac()));
        calcularEdad(persona);
    }

    

}
