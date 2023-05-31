/*EJERCICIO 10 
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **  */


package GuiaTeoricaTranscurso;
import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String args[]){
    
        Scanner leer = new Scanner(System.in);
        int cont = 0;
   
        do{
            String asterisco = "";
            cont = cont + 1;
            System.out.println("Por favor ingrese el numero:");
            int num = leer.nextInt();
            
            while(num>20||num<1){
            System.out.println("Su numero no esta comprendido entre 1 y 20");
            System.out.println("Por favor ingrese un numero comprendido entre 1 y 20");
            num = leer.nextInt();
            }
            
            for (int i = 0; i < num; i++) {
            asterisco = asterisco + "*";
         }
             System.out.println(num + asterisco);
        }while(cont < 4);
    }
}
