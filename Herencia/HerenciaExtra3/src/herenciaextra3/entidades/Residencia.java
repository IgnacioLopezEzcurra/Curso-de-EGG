
package herenciaextra3.entidades;

import java.util.Scanner;


public final class Residencia extends ExtraHotelero{
    
    protected int cantHab;
    protected boolean descuento;
    protected boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descuento, boolean campoDeportivo, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nResidencia{" + "cantHab=" + cantHab + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }

    @Override
    public Alojamiento crearAlojamiento() {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Creacion de un Residencia");
        System.out.println("Ingrese el nombre del alojamiento: ");
        String nombre = leer.next();
        System.out.println("Ingrese la direccion: ");
        String direccion = leer.next();
        System.out.println("Ingrese la localidad: ");
        String localidad = leer.next();
        System.out.println("Ingrese el nombre del gerente: ");
        String gerente = leer.next();
        
        System.out.println("Indique si este alojamiento es privado o no (true/false)");
        boolean privado = leer.nextBoolean();
        System.out.println("Indique la superficie del mismo: ");
        double superficie = leer.nextDouble();
        
        System.out.println("Ingrese la cantidad de habitaciones: ");
        int cantHab = leer.nextInt();
        System.out.println("¿Posee descuentos para los gremios? (true/false)");
        boolean descuento = leer.nextBoolean();
        System.out.println("¿Posee campo deportivo? (true/false)");
        boolean camp= leer.nextBoolean();
        
        return new Residencia (cantHab, descuento, camp, privado, superficie, nombre, direccion, localidad, gerente);
    }
    
    
    
}
