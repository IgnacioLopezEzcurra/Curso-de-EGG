/*
Clase BarcoMotor (subclase de BarcoEspecial):

Atributos:
Potencia en CV (int)
Método:
Implementa calcularModuloEspecial() para sumar la potencia en CV al módulo normal.
 */

package herenciaextra1.entidades;


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



    

    
}
