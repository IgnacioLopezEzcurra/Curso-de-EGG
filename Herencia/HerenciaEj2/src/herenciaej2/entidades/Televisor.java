/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos: 
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos 
heredados. 

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar 
el precio final de los dos electrodomésticos. 
 */
package herenciaej2.entidades;

public class Televisor extends Electrodomestico {

    private double pulgadas;
    private boolean TDT;
    private Electrodomestico electrodomestico;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public Electrodomestico getElectrodomestico() {
        return electrodomestico;
    }

    public void setElectrodomestico(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    @Override
    public double precioFinal(Electrodomestico elec) {
        this.setPrecio(super.precioFinal(elec));

        if (pulgadas > 40) {
            this.setPrecio(this.getPrecio() * 1.30); // EL ORDEN DE ESTOS CONDICIONALES AFECTA AL RESULTADO FINAL
        }

        if (TDT == true) {
            this.setPrecio(this.getPrecio() + 500);
        }

        return this.getPrecio();
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", TDT=" + TDT + ", electrodomestico=" + electrodomestico + '}';
    }
    
    
}
