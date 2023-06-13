/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package EjerciciosExtra;
import java.util.Scanner;

public class Extra9 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero, el cual sera el dividendo:  ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero, el cual será el divisor: ");
        int num2 = leer.nextInt();
        
        System.out.println("");
        System.out.println("La división es " + num1 + "/" + num2);
        cocienteResto(num1, num2);
        
    }
    
    public static void cocienteResto(int num1, int num2){
    
        int resto = 0;
        int cociente = 0;
        
        do{
            resto = num1 - num2;
            num1 = resto;
            cociente = cociente + 1;
        
        }while(resto>num2);
        
        System.out.println("El cociente es " + cociente);
        System.out.println("El residuo es " + resto);
    
    }
    
}
