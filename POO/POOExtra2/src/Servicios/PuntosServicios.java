/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link: 
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html 
 */
package Servicios;
import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicios {
    
      public Puntos crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        return new Puntos(x1, y1, x2, y2);
        
    }

    public double calcularDistancia(Puntos punto) {
        double distancia = Math.sqrt(Math.pow(punto.getX2() - punto.getX1(), 2) + Math.pow(punto.getY2() - punto.getY1(), 2));
        return distancia;
    }
    
}
