/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores. 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 

 */
package Servicios;

import Entidades.Matematica;

public class MatematicaServicios {

    public double devolverMayor(Matematica ob) {

        if (ob.getNum1() > ob.getNum2()) {
            return ob.getNum1();
        } else {
            return ob.getNum2();
        }

    }

    public double calcularPotencia(Matematica ob) {

        double mayor = Math.round(Math.max(ob.getNum1(), ob.getNum2()));
        double menor = Math.round(Math.min(ob.getNum1(), ob.getNum2()));

        return Math.pow(mayor, menor);

    }
    
        public double calculaRaiz(Matematica ob) {
            
        double menor = Math.round(Math.min(ob.getNum1(), ob.getNum2()));
        double valorAbsoluto = Math.abs(menor);
        
        return Math.sqrt(valorAbsoluto);
    }

}
