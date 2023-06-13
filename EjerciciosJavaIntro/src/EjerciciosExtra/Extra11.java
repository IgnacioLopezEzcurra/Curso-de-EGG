/*
11. Escribir un programa que lea un numero entero y devuelva el
número de dígitos que componen ese número. Por ejemplo, si introducimos
el número 12345, el programa deberá devolver 5. Calcular la cantidad de 
dígitos matemáticamente utilizando el operador de división. Nota: recordar 
que las variables de tipo entero truncan los números o resultados.
 */
package EjerciciosExtra;
import java.util.Scanner;

public class Extra11 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        int dig = 0;
        int resto = -1;
        
        do{
            
        resto = num/10;
        num = resto;
        dig = dig + 1;
        }while(resto != 0);
        
        System.out.println("La cantidad de dígitos del número ingresado es " + dig);
        
    }
    
}
