
package herenciaextra3.entidades;


public abstract class Hotel extends Alojamiento{
    
    protected int cantHab;
    protected int numCamas;
    protected int cantPisos;
    protected double precioHab;

    public Hotel() {
    }

    public Hotel(int cantHab, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHab=" + cantHab + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + '}';
    }
    
    public abstract void calcularPrecioHab();
    
    
    
}
