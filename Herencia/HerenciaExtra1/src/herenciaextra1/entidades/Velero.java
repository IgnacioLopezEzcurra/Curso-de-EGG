/*
Clase Velero (subclase de BarcoEspecial):

Atributos:
Número de mástiles (int)
Método:
Implementa calcularModuloEspecial() para sumar el número de mástiles al módulo normal.
 */
package herenciaextra1.entidades;


public class Velero extends Barco{
    
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.numMastiles = numMastiles;
    }

    @Override
    public double calcularModulo() {
        return (eslora * 10) + numMastiles;
    }
      




}
