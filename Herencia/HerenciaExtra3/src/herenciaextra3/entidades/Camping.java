
package herenciaextra3.entidades;


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
        return "Camping{" + "capMaxCarpas=" + capMaxCarpas + ", canBanios=" + canBanios + ", restaurante=" + restaurante + '}';
    }
    
    
    
}
