/*
Vectores y Matrices en Java
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio14 {

 
   public static void main(String[] args) {
        // Código para obtener la cantidad de euros y la moneda a convertir por teclado
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la cantidad de euros: ");
        double cantidadEuros = leer.nextDouble();
        
        leer.nextLine();
        
        System.out.println("Por favor indique a que moneda desea convertir: ");
        String moneda = leer.nextLine();

        // Llamada a la función de conversión
        convertirMoneda(cantidadEuros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        // Código para realizar la conversión de euros a la moneda especificada
        double  conversion = 0;
        
        if(moneda.equalsIgnoreCase("libra")){
            conversion = euros*0.86;
        }else if (moneda.equalsIgnoreCase("dolar")){
            conversion = euros*1.28611;
        }else if(moneda.equalsIgnoreCase("yen")) {
            conversion = euros*129.852;
        }

        // Código para mostrar el mensaje indicando el cambio
        System.out.println("La cantidad de euros convertida a " + moneda + " es: " + conversion);
    }
    
}
