/*
Clase Velero (subclase de BarcoEspecial):

Atributos:
Número de mástiles (int)
Método:
Implementa calcularModuloEspecial() para sumar el número de mástiles al módulo normal.
 */
package herenciaextra1.entidades;

import java.util.Scanner;

public class Velero extends Barco {

    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    
    
    @Override
    public double calcularModulo() {
        return (eslora * 10) + numMastiles;
    }

    @Override
    public Barco crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---CREACION DE VELERO---");

        System.out.println("Ingrese la matricula del Velero");
        String matricula = leer.next();
        
        System.out.println("Ingrese la eslora en mts:");
        double eslora = leer.nextDouble();
        
        System.out.println("Ingrese el año de fabricacion:");
        int anioFab = leer.nextInt();

        System.out.println("Ingrese numero de mastiles");
        int numMast = leer.nextInt();

        return new Velero(numMast, matricula, eslora, anioFab);
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nVelero{" + "numMastiles=" + numMastiles + '}';
    }
    
    

}
