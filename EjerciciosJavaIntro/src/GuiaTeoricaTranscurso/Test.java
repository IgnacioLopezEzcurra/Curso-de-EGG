
package GuiaTeoricaTranscurso;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        int num = 6686;
        int num2 = 53;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        
        
       int resta = num - num2; 
       int suma = num + num2;
       double div = num / num2;
       int mult = num * num2;
       boolean com = num < num2;
       
               
       System.out.println(suma);  
       System.out.println(resta); 
       System.out.println(div); 
       System.out.println(mult); 
       System.out.println(com); 
       
       System.out.println("Hola!");
       System.out.println("Mundo!");
       
       System.out.println("Hola Mundo! me llamo " + nombre + " y tengo " + edad + " años.");
    }
    
}
