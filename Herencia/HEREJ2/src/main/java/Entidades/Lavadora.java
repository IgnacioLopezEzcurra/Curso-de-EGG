package Entidades;

public class Lavadora extends Electrodomestico{

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(String color, char consumoEnergetico, Double peso, Double carga) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
        precioFinal(peso);
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    public void precioFinal(Double peso) {
        this.precio += ((peso > 30d) ? 500d : 0d);
    }
}
