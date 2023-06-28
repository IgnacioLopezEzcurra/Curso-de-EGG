/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
se puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;
import java.util.Date;
import java.util.Scanner;

public class POOEj11 {

    
    public static void main(String[] args) {
        
        // Obtener la fecha actual
        Date fechaActual = new Date();
        System.out.println("La fecha actual es: " + fechaActual);

        // Pedir al usuario el día, mes y año
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt() - 1;  // Restar 1 al mes, ya que en la clase Date los meses comienzan desde 0

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Crear la fecha utilizando el constructor de la clase Date
        Date fechaIngresada = new Date(anio - 1900, mes, dia);  // Restar 1900 al año, ya que en la clase Date los años se cuentan a partir de 1900

        // Mostrar la fecha ingresada
        System.out.println("Fecha ingresada: " + fechaIngresada);

        // Calcular la diferencia de años entre la fecha ingresada y la fecha actual
        int diferenciaAnios = fechaActual.getYear() - fechaIngresada.getYear();

        // Mostrar la diferencia de años
        System.out.println("Diferencia de años: " + diferenciaAnios);
        
    }
    
}
