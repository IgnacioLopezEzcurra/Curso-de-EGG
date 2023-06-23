/*
Cuadrado
Rectángulo
Triangulo
Circulo
Hexágono
Pentágono
Rombo
 */
package Entidades;


public class Figura {
    
    private String tipo;
    private Double area, perimetro;

    public Figura() {
    }

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" + "tipo=" + tipo + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
    
}
