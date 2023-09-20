/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones
 */
package excepcionesej4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesEj4 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese dos números como cadenas
            System.out.print("Ingrese el primer número: ");
            String numero1Str = scanner.nextLine();

            System.out.print("Ingrese el segundo número: ");
            String numero2Str = scanner.nextLine();

            // Convertir las cadenas a enteros usando parseInt()
            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);
           
                // Realizar la división
                double resultado = (double) numero1 / numero2;
                System.out.println("Resultado de la división: " + resultado);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese números válidos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no se puede convertir a entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            scanner.close();
        }
    }
}
