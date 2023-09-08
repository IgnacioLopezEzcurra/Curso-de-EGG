/*
4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */

package herenciaej4;

import herenciaej4.entidades.Circulo;
import herenciaej4.entidades.Rectangulo;
import java.util.Scanner;


public class HerenciaEj4 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Circulo circulo = new Circulo();
        
        System.out.println("Ingrese el radio del circulo:");
        circulo.setRadio(leer.nextDouble());
        
        System.out.println("El radio del circulo es " + circulo.getRadio());
        System.out.println("El area del circulo es " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es " + circulo.calcularPerimetro());
        
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese la base del rectangulo:");
        rec.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo:");
        rec.setAltura(leer.nextDouble());
        System.out.println("El area del rectangulo es " + rec.calcularArea());
        System.out.println("El perimetro del rectangulo es " + rec.calcularPerimetro());
    }
    
}
