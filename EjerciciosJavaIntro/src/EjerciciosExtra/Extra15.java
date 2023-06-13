/*
15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package EjerciciosExtra;
import java.util.Scanner;

public class Extra15 {

 
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        System.out.println("Que operación desea realizar con ellos? Escoja una opcion: ");
        System.out.println("1) SUMAR");
        System.out.println("2) RESTAR");
        System.out.println("3) MULTIPLICAR");
        System.out.println("4) DIVIDIR");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
            sumar(num1, num2);
            break;
            case 2:
                restar(num1, num2);
                break;
            case 3:
                multiplicar(num1, num2);
                break;
            case 4:  
                dividir(num1, num2);
                break;
            default:
                System.out.println("Ha ingresado una opción invalida");
                break;
        }
      
    }
    
     public static void sumar (int num1, int num2) {

        int sumar;
        
        sumar = num1 + num2;
        
         System.out.println("La suma de los numeros es " + sumar);

    }
     
     public static void restar (int num1, int num2) {

        int resta;
        
        resta = num1 - num2;
        
         System.out.println("La resta de los numeros es " + resta);

    }
     
     public static void multiplicar(int num1, int num2) {

        int mult;
        
        mult = num1 * num2;
        
         System.out.println("El producto de los numeros es " + mult);

    }
    
    public static void dividir(double num1, double num2) {

        double div;
        
        div = num1 / num2;
        
         System.out.println("La división de los numeros es " + div);

    }
    
}
