/*EJERCICIO 6 
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
alguno de ellos es mayor a 25.*/
package GuiaTeoricaTranscurso;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String args[]){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Por favor ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        if(num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros (" + num1 + " y " + num2 + ") son mayores a 25");
        } else if (num1 > 25){
        System.out.println("El numero " + num1 + " es mayor a 25.");
     } else if (num2 > 25){
             System.out.println("El numero " + num2 + " es mayor a 25");
        } else 
         System.out.println("Ninguno de los numero ingresados es mayor a 25");
    }
    
}
