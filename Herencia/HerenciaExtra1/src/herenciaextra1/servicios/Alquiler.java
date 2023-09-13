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


public class Alquiler {
    
    private String nombre;
    private String dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posAmarre;
    private Barco barcoOcupante;
    
    // Constructor
    public Alquiler(String nombreCliente, String dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barcoOcupante) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posicionAmarre;
        this.barcoOcupante = barcoOcupante;
    }

   

    // Getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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
    
     // Método para calcular el precio del alquiler
    public double calcularPrecio() {
        // Calcular el número de días de ocupación
        long diferenciaEnTiempo = fechaDevolucion.getTime() - fechaAlquiler.getTime();
        int diasDeOcupacion = (int) (diferenciaEnTiempo / (1000 * 60 * 60 * 24));

        // Calcular el precio multiplicando los días de ocupación por el módulo del barco
        double precio = diasDeOcupacion * barcoOcupante.calcularModulo();

        return precio;
    }

    
}
