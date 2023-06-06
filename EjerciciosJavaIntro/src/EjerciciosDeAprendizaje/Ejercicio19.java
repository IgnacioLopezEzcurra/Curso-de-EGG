/*
19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

       
        int matriz[][] = new int[3][3];
        int matrizB[][] = new int[3][3];

        rellenar(matriz);
        System.out.println("Su matriz A es la siguiente: ");
        imprimir(matriz);
        System.out.println("");

        transponer(matriz, matrizB);
        System.out.println("Su matriz B transpuesta es la siguiente: ");
        imprimir(matrizB);
        System.out.println("");
        antiSimetrica(matriz, matrizB);

    }

    public static void rellenar(int matriz[][]) {
        System.out.println("Vamos a rellenar la Matriz A");
     Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor para la posicion [" + i + "]" + "[" + j + "]");
                matriz[i][j] = leer.nextInt();
            }

        }

    }

    public static void imprimir(int matriz[][]) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }

    }

    public static void transponer(int matriz[][], int matrizB[][]) {

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 3; i++) {
                matrizB[j][i] = matriz[i][j];
            }
            
            

        }

    }
    
    
     public static void antiSimetrica(int matriz[][], int matrizB[][]) {

         boolean bandera = false;
         
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] == -matriz[i][j]){
                bandera = true;
                }
            }

        }

        if(bandera == true){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz NO es antisimetrica");
        }
    }

}
