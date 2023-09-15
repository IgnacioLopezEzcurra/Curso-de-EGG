/*

1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.

Clase Alquiler:

Atributos:
Nombre del cliente (String)
Documento del cliente (String)
Fecha de alquiler (Date)
Fecha de devolución (Date)
Posición del amarre (int)
Barco que lo ocupará (instancia de la clase Barco)
Método:
calcularPrecio(): Calcula el precio del alquiler multiplicando el número de días de ocupación por el módulo del barco correspondiente.
 */
package herenciaextra1.servicios;

import herenciaextra1.entidades.Barco;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {

    private String nombre;
    private String dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posAmarre;
    private Barco barcoOcupante;

    // Constructor
    public Alquiler(String nombre, String dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barcoOcupante) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barcoOcupante = barcoOcupante;
    }

    public Alquiler() {
       
    }
    
    public Alquiler crearAlquiler(Barco barco){
        Alquiler alqui = new Alquiler();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del inquilino");
        alqui.setNombre(leer.next());
        
        System.out.println("Ingrese el dni:");
        alqui.setDni(leer.next());
        
          // Pedir la fecha de alquiler al usuario
        System.out.print("Ingrese la fecha de alquiler (AAAA-MM-DD): ");
        String fechaAlquilerStr = leer.next();
        
        // Pedir la fecha de devolución al usuario
        System.out.print("Ingrese la fecha de devolución (AAAA-MM-DD): ");
        String fechaDevolucionStr = leer.next();
        
        // Convertir las cadenas ingresadas a objetos LocalDate
         alqui.setFechaAlquiler(LocalDate.parse(fechaAlquilerStr)); 
         alqui.setFechaDevolucion(LocalDate.parse(fechaDevolucionStr));
         
         System.out.println("Ingrese la posicion de amarre:");
         alqui.setPosAmarre(leer.nextInt());
         
        alqui.setBarcoOcupante(barco);
        
        return alqui;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarcoOcupante() {
        return barcoOcupante;
    }

    public void setBarcoOcupante(Barco barcoOcupante) {
        this.barcoOcupante = barcoOcupante;
    }

//     // Método para calcular el precio del alquiler
//    public double calcularPrecio() {
//        // Calcular el número de días de ocupación
//        long diferenciaEnTiempo = fechaDevolucion.getTime() - fechaAlquiler.getTime();
//        int diasDeOcupacion = (int) (diferenciaEnTiempo / (1000 * 60 * 60 * 24));
//
//        // Calcular el precio multiplicando los días de ocupación por el módulo del barco
//        double precio = diasDeOcupacion * barcoOcupante.calcularModulo();
//
//        return precio;
//    }
    
    // Método para calcular el precio del alquiler
    public double calcularPrecio() {
        // Calcular el número de días de ocupación
        long diferenciaEnDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

        // Calcular el precio multiplicando los días de ocupación por el módulo del barco
        double precio = diferenciaEnDias * barcoOcupante.calcularModulo();

        return precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + "\n, dni=" + dni + 
                "\n, fechaAlquiler=" + fechaAlquiler + 
                "\n, fechaDevolucion=" + fechaDevolucion + 
                "\n, posAmarre=" + posAmarre + 
                "\n, barcoOcupante=" + barcoOcupante + '}';
    }
    
    

}
