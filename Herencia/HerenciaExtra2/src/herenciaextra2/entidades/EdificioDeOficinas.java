/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. 
Estos métodos serán abstractos y los implementarán las siguientes clases: 
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */

package herenciaextra2.entidades;


public class EdificioDeOficinas extends Edificio{
    
    private int numOficinas;
    private int cantPersonasPorOficinas;
    private int numPisos;
    
    

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonasPorOficinas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasPorOficinas = cantPersonasPorOficinas;
        this.numPisos = numPisos;
    }    

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasPorOficinas() {
        return cantPersonasPorOficinas;
    }

    public void setCantPersonasPorOficinas(int cantPersonasPorOficinas) {
        this.cantPersonasPorOficinas = cantPersonasPorOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    
    @Override
    public double calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void cantPersonas(){
    
    
    }
    
}
