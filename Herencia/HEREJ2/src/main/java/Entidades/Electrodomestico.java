package Entidades;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    private static final Double PRECIO_BASE = 1000d;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, Double peso) {
        this.precio = precioFinal(comprobarConsumoEnergetico(consumoEnergetico), peso);
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    private char comprobarConsumoEnergetico(char letra) {

        char letraM = Character.toUpperCase(letra);

        return switch (letraM) {
            case 'A' -> letraM;
            case 'B' -> letraM;
            case 'C' -> letraM;
            case 'D' -> letraM;
            case 'E' -> letraM;
            case 'F' -> letraM;
            default -> 'F';
        };
    }

    private String comprobarColor(String color) {

        String colorM = color.toLowerCase();

        return switch (colorM) {
            case "blanco" -> colorM;
            case "negro" -> colorM;
            case "rojo" -> colorM;
            case "gris" -> colorM;
            default -> "blanco";
        };
    }

    private double precioFinal(char letra, Double peso) {

        Double precioConsumo = 0d;
        Double precioPeso;

        switch (letra) {
            case 'A' -> precioConsumo = 1000d;
            case 'B' -> precioConsumo = 800d;
            case 'C' -> precioConsumo = 600d;
            case 'D' -> precioConsumo = 500d;
            case 'E' -> precioConsumo = 300d;
            case 'F' -> precioConsumo = 100d;
        }

        if (peso < 80) {
            if (peso < 50) {
                if (peso < 20) {
                    if (peso < 1) {
                        precioPeso = 0d;
                    } else {
                        precioPeso = 100d;
                    }
                } else {
                    precioPeso = 500d;
                }
            } else {
                precioPeso = 800d;
            }
        } else {
            precioPeso = 1000d;
        }

        return (precioPeso + precioConsumo + PRECIO_BASE );
    }


}


