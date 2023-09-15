
package herenciaextra3.entidades;


public class Hotel4Estrellas extends Hotel {

    protected boolean gimnasio;
    protected String nombreRest;
    protected int capacidadRest;
    
    //Spring Boot

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(boolean gimnasio, String nombreRest, int capacidadRest, int cantHab, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, numCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
        calcularPrecioHab();
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capacidadRest=" + capacidadRest + '}';
    }
    
    
    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. (true)
• $30 si el tipo del gimnasio es B. (false)
*/
    
    @Override
    public void calcularPrecioHab() {
        
        this.precioHab = 50 + (double)(cantHab*numCamas); 
        
        
        if(gimnasio) this.precioHab += 50;
        else this.precioHab += 30;
        
       if(capacidadRest < 30) this.precioHab += 10;
       else if (capacidadRest >= 30 && capacidadRest <= 50) this.precioHab += 30;
       else this.precioHab += 50;
    }
    
}
