/*
Clase Barco (abstracta):

Atributos:
Matrícula (String)
Eslora en metros (double)
Año de fabricación (int)
Método:
calcularModulo(): Calcula el módulo del barco multiplicando por 10 los metros de eslora.
 */
package herenciaextra1.entidades;


public abstract class Barco {
    
    protected String matricula;
    protected double eslora;
    protected int anioFab;

    protected Barco() {
    }

    protected Barco(String matricula, double eslora, int anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFab=" + anioFab + '}';
    }
    
    
    
    
    public abstract double calcularModulo();
    public abstract Barco crearBarco();
    
        
        
}
    

