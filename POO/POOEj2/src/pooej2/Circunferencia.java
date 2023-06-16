/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto. 
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
package pooej2;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Circunferencia {
    
    //Atributo radio privado 
    private double radio;
    
    /**
     a) Método constructor que inicialice el radio pasado como parámetro.
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda 
    * en el atributo del objeto. 
     */
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir el radio");
        this.radio = leer.nextDouble();
    }
    
    /**
     d) Método area(): para calcular el área de la circunferencia (Area = PI * radio↑2).
     */
    public double area(double radio) {
        double area = PI * (radio*radio);
        return area;
    }
    
    /**
     *e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * radio).
     */
    public double perimetro(double radio) {
        double perimetro = 2* PI * radio;
        return perimetro;
    }   
    
}
