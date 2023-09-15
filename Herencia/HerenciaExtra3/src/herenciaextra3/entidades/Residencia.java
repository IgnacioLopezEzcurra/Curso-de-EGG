
package herenciaextra3.entidades;


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
        return "Residencia{" + "cantHab=" + cantHab + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
}
