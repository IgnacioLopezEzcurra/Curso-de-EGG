/*
Clase YatesDeLujo (subclase de BarcoEspecial):

Atributos:
Potencia en CV (int)
Número de camarotes (int)
Método:
Implementa calcularModuloEspecial() para sumar la potencia en CV y el número de camarotes al módulo normal.
 */
package herenciaextra1.entidades;


public class YatesDeLujo extends Barco{
    
    private int potenciaCv;
    private int numCamarotes;

    public YatesDeLujo() {
    }


    public YatesDeLujo(int potenciaCv, int numCamarotes, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaCv = potenciaCv;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return (eslora * 10) + potenciaCv + numCamarotes;
    }

    
}
