
package herenciaextra3.entidades;

import java.util.Scanner;


public final class Camping extends ExtraHotelero{
    
    protected int capMaxCarpas;
    protected int canBanios;
    protected boolean restaurante;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int canBanios, boolean restaurante, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.canBanios = canBanios;
        this.restaurante = restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCanBanios() {
        return canBanios;
    }

    public void setCanBanios(int canBanios) {
        this.canBanios = canBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCamping{" + "capMaxCarpas=" + capMaxCarpas + ", canBanios=" + canBanios + ", restaurante=" + restaurante + '}';
    }

    @Override
    public Alojamiento crearAlojamiento() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Creacion de un CAMPING");
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
        
        System.out.println("Ingrese la cantidad maxima de carpas: ");
        int cantMaxCarpas = leer.nextInt();
        System.out.println("Indique la cantidad de baños: ");
        int cantBanios = leer.nextInt();
        System.out.println("Tiene restaurante?");
        boolean rest = leer.nextBoolean();
        
        return new Camping(cantMaxCarpas, cantBanios, rest, privado, superficie, nombre, direccion, localidad, gerente);
        
    }
    
    
    
}
