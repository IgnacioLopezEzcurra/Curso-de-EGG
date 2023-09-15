/*
Clase YatesDeLujo (subclase de BarcoEspecial):

Atributos:
Potencia en CV (int)
Número de camarotes (int)
Método:
Implementa calcularModuloEspecial() para sumar la potencia en CV y el número de camarotes al módulo normal.
 */
package herenciaextra1.entidades;

import java.util.Scanner;


public class YateDeLujo extends Barco{
    
    private int potenciaCv;
    private int numCamarotes;

    public YateDeLujo() {
    }


    public YateDeLujo(int potenciaCv, int numCamarotes, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaCv = potenciaCv;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    
    
    @Override
    public double calcularModulo() {
        return (eslora * 10) + potenciaCv + numCamarotes;
    }

    @Override
    public Barco crearBarco() {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---CREACION DE YATE DE LUJO---");
        
        System.out.println("Ingrese la matricula del Yate de Lujo");
       String matricula = leer.next();
        
        System.out.println("Ingrese la eslora en mts:");
        double eslora = leer.nextDouble();
        
        System.out.println("Ingrese el año de fabricacion:");
        int anioFab = leer.nextInt();
        
        System.out.println("Ingrese su potencia en CV");
        int potCv = leer.nextInt();
        
        System.out.println("Ingrese numero de camarotes:");
        int camarotes = leer.nextInt();
        
        return  new YateDeLujo(potCv, camarotes, matricula, eslora, anioFab);

    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nYateDeLujo{" + "potenciaCv=" + potenciaCv + ", numCamarotes=" + numCamarotes + '}';
    }
    
    

    
}
