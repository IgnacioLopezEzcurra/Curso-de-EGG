/*
Bucles y sentencias de salto break y continue
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.
 */

package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo: ");
        int limite = leer.nextInt();
        int suma = 0;
        
        System.out.println("A continuacion ingrese numeros hasta que la suma de estos supere el limite inicial");
        
        do {
          
            int nuevo = leer.nextInt();
            suma = suma + nuevo;
    
        }while (suma < limite);
        
            System.out.println("La suma de los numeros introducidos a superado el valor limite( " + limite + "), la suma es " + suma);
        
    }
    
}
