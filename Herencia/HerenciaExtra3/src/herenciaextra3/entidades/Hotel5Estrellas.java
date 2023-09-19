package herenciaextra3.entidades;

import java.util.Scanner;

public class Hotel5Estrellas extends Hotel4Estrellas {

    protected int cantSalonConf;
    protected int cantSuites;
    protected int cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantSalonConf, int cantSuites, int cantLimosinas, boolean gimnasio, String nombreRest, int capacidadRest, int cantHab, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capacidadRest, cantHab, numCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonConf = cantSalonConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        calcularPrecioHab();
    }

    public int getCantSalonConf() {
        return cantSalonConf;
    }

    public void setCantSalonConf(int cantSalonConf) {
        this.cantSalonConf = cantSalonConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHotel5Estrellas{" + "cantSalonConf=" + cantSalonConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.*/
    @Override
    public void calcularPrecioHab() {

        super.calcularPrecioHab();
        this.precioHab += (15 * cantLimosinas);

    }

    @Override
    public Alojamiento crearAlojamiento() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Creacion de un HOTEL 5 **** ESTRELLAS");
        System.out.println("Ingrese el nombre del alojamiento: ");
        String nombre = leer.next();
        System.out.println("Ingrese la direccion: ");
        String direccion = leer.next();
        System.out.println("Ingrese la localidad: ");
        String localidad = leer.next();
        System.out.println("Ingrese el nombre del gerente: ");
        String gerente = leer.next();

        System.out.println("Indique la cantidad de habitaciones:");
        int hab = leer.nextInt();
        System.out.println("Indique la cantidad de camas:");
        int camas = leer.nextInt();
        System.out.println("Indique la cantidad de pisos:");
        int pisos = leer.nextInt();

        System.out.println("Indique si posee gimnasio (true/false)");
        boolean gim = leer.nextBoolean();
        System.out.println("Indique el nombre del Restaurante:");
        String rest = leer.next();
        System.out.println("Indique la capacidad del Restaurante:");
        int capRest = leer.nextInt();
        
        System.out.println("Indique cantidad de salones de conferencia:");
        int conf = leer.nextInt();
        System.out.println("Indique cantidad de suites:");
        int suites = leer.nextInt();
        System.out.println("Indique cantidad de limousines:");
        int limo = leer.nextInt();
        
        return new Hotel5Estrellas(conf, suites, limo, gim, rest, capRest, 
                hab, camas, pisos, nombre, direccion, localidad, gerente);

    }

}
