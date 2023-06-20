/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej4;

import java.util.Scanner;

public class Rectangulo {

    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introduce la base:");
        this.base = leer.nextDouble();
        System.out.println("Introduce la altura:");
        this.altura = leer.nextDouble();
    }

    public double calcularSuperficie() {
        double sup = base * altura;
        System.out.print("La superficie es: ");
        return sup;
    }

    public double calculaPerimetro() {
        double per = (base + altura) * 2;
        System.out.print("El perimetro es: ");
        return per;
    }
    
    public void dibujar(double base, double altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
     public void dibujarSinRelleno(double base, double altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                
                if(i == 0 || i == altura-1 || j == 0 || j == base - 1){
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
                
            }
            System.out.println("");
        }
    }

}
