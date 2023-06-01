/*
13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio13 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Por favor ingrese los N elementos por lado de un cuadrado: ");
       int lado = leer.nextInt();
       String [][] matriz = new String [lado][lado];
       
        System.out.println("");
        System.out.println("Su cuadrado queda asi: ");
        
        for (int i = 0; i < lado; i++) {
            
            for (int j = 0; j < lado; j++) {
                
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = " ";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
       
       
    }
    
}
