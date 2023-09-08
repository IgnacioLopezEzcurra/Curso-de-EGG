package Entidades;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(String color, char consumoEnergetico, Double peso, Double resolucion, boolean sintonizadorTDT) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        precioFinal(resolucion, sintonizadorTDT);
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    public void precioFinal(Double resolucion, boolean sintonizadorTDT) {

        this.precio *= ((resolucion > 40) ? 1.3d: 1d);
        this.precio += ((sintonizadorTDT) ? 500d : 0d);
    }

}
