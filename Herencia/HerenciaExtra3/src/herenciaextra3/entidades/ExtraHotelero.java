
package herenciaextra3.entidades;


public abstract class ExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected double superficie;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return super.toString() + "\nExtraHotelero{" + "privado=" + privado + ", superficie=" + superficie + '}';
    }
    
    
    
}
