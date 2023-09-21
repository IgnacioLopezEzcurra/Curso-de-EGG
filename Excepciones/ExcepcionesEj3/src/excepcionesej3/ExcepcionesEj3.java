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
//        System.out.print("Ingrese el primer número: ");
//        String numero1Str = scanner.nextLine();
//
//        System.out.print("Ingrese el segundo número: ");
//        String numero2Str = scanner.nextLine();

        // Convertir las cadenas a enteros usando parseInt()
//        try {
//            int numero1 = Integer.parseInt(numero1Str);
//            int numero2 = Integer.parseInt(numero2Str);
//
//            // Verificar si el segundo número es cero antes de realizar la división
//            if (numero2 != 0) {
//                // Realizar la división
//                double resultado = (double) numero1 / numero2;
//                System.out.println("Resultado de la división: " + resultado);
//            } else {
//                System.out.println("No se puede dividir por cero.");
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Ingrese números válidos.");
//        } finally {
//            scanner.close();
//        }
        System.out.println("Ingrese un numero");
        String num1str = scanner.nextLine();
        System.out.println("Ingrese el segundo");
        String num2str = scanner.nextLine();
        
        DivisionNumero div = new DivisionNumero();
        
        try{
            
        int num1 = Integer.parseInt(num1str);
        int num2 = Integer.parseInt(num2str);
        
        double resultado = div.dividir(num1, num2);
        System.out.println("La division es " + resultado);
        
        /* En Java, dividir un double por 0 no arrojará una excepción ArithmeticException como lo haría con los enteros (int o long). 
        En cambio, cuando divides un número de punto flotante (float o double) por 0, obtendrás un valor especial llamado "Infinity" o
        "NaN" (Not-a-Number), dependiendo de las circunstancias. Esto se debe a que los números de punto 
        flotante en Java siguen las especificaciones del estándar IEEE 754 para aritmética de punto flotante.
        
        Dado que no se lanza una excepción en estos casos, es importante tener en cuenta y manejar estos valores especiales 
        en tu código si trabajas con operaciones de punto flotante para evitar comportamientos inesperados o errores.

        Por ejemplo, puedes verificar si un valor es Infinity o NaN utilizando métodos proporcionados por la clase Double, como Double.isInfinite()
        o Double.isNaN(), y tomar las acciones adecuadas en consecuencia.
        */
        
        } catch (ArithmeticException a) {
        
            System.out.println("Error: " + a);
        
        }
        
        
        catch  (Exception e){
        
            System.out.println("Algo fallo");
            System.out.println("El error es de tipo " + e.toString());
            
        }
        
        
        
        
        
        
    }
    
}
