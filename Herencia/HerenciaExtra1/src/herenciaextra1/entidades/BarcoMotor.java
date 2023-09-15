/*
Clase BarcoMotor (subclase de BarcoEspecial):

Atributos:
Potencia en CV (int)
Método:
Implementa calcularModuloEspecial() para sumar la potencia en CV al módulo normal.
 */

package herenciaextra1.entidades;
import java.util.Scanner;

public class BarcoMotor extends Barco{
    
    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return (eslora * 10) + potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    

    @Override
    public Barco crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---CREACION DE BARCO A MOTOR---");
        
        
        System.out.println("Ingrese la matricula del Barco a Motor");
        String matricula = leer.next();
        
        System.out.println("Ingrese la eslora en mts:");
        double eslora = leer.nextDouble();
        
        System.out.println("Ingrese el año de fabricacion:");
        int anioFab = leer.nextInt();
        
        System.out.println("Ingrese su potencia en CV");
        int potenciaCV = leer.nextInt();
        
        return new BarcoMotor(potenciaCV, matricula, eslora, anioFab);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }



    

    
}
