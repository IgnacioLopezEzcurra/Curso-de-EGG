/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
    generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
    de rango).
 */
package excepcionesej2.entidades;


public class Cajonera {
    
    private int cajonera[];

    public Cajonera() {
    }

    public Cajonera(int tamaño) {
        this.cajonera = new int[tamaño];
    }

    public int[] getCajonera() {
        return cajonera;
    }

    public void setCajonera(int[] cajonera) {
        this.cajonera = cajonera;
    }

    @Override
    public String toString() {
        return "Cajonera{" + "cajonera=" + cajonera + '}';
    }
    
    public void asignarValor(int indice, int valor) {
        try {
            cajonera[indice] = valor;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            System.out.println("El índice está fuera de rango.");
        } catch (Exception e) {
            System.out.println("Tu array no esta inicializado");
        }
    }
    
}
