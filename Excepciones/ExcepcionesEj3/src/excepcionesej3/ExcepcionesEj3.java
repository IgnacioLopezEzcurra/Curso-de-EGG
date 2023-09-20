/*
    3- Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
    números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
    para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
    una división con los dos numeros y mostrar el resultado.
 */

package excepcionesej3;

import java.util.Scanner;


public class ExcepcionesEj3 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números como cadenas
        System.out.print("Ingrese el primer número: ");
        String numero1Str = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2Str = scanner.nextLine();

        // Convertir las cadenas a enteros usando parseInt()
        try {
            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);

            // Verificar si el segundo número es cero antes de realizar la división
            if (numero2 != 0) {
                // Realizar la división
                double resultado = (double) numero1 / numero2;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese números válidos.");
        } finally {
            scanner.close();
        }
        
    }
    
}
