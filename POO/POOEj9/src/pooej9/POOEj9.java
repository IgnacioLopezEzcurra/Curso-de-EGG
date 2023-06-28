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
package pooej9;

import Entidades.Matematica;
import Servicios.MatematicaServicios;


public class POOEj9 {


    public static void main(String[] args) {
       
        Matematica ob1 = new Matematica();
        ob1.setNum1(Math.random() * 10);
        ob1.setNum2(Math.random() * 10);
        
        MatematicaServicios ms = new MatematicaServicios();
        
        System.out.println("Este es el num 1: " + ob1.getNum1() + " y este es el num 2: " + ob1.getNum2());
        
        System.out.println("Que numero es mayor?: " + ms.devolverMayor(ob1));
        
        System.out.println("-----------------------------");
        System.out.println("Su potencia es " + ms.calcularPotencia(ob1));
        
        System.out.println("-----------------------------");
        System.out.println("Su raiz es " + ms.calculaRaiz(ob1));

    }
    
}
