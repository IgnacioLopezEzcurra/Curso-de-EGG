/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al 
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la 
columna de la matriz M en la cual empieza el primer elemento de la submatriz P
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        int matriz[][] = new int[10][10];
        int matrizB[][] = new int[3][3];

        rellenarA(matriz);
        System.out.println("Su matriz de 10 x 10 es la siguiente: ");
        imprimirA(matriz);
        System.out.println("");
        rellenarB(matrizB);
        System.out.println("Su matriz de 3 x 3  es la siguiente: ");
        imprimirB(matrizB);
        System.out.println("");
        

    }

    public static void rellenarA(int matriz[][]) {
        System.out.println("Vamos a rellenar la Matriz A");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println("Ingrese valor para la posicion [" + i + "]" + "[" + j + "]");
                matriz[i][j] = leer.nextInt();
            }

        }

    }
    
     public static void rellenarB(int matriz[][]) {
        System.out.println("Vamos a rellenar la Matriz B de 3x3");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor para la posicion [" + i + "]" + "[" + j + "]");
                matriz[i][j] = leer.nextInt();
            }

        }

    }

    public static void imprimirA(int matriz[][]) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }

    }
    
    public static void imprimirB(int matriz[][]) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }

    }
    
    
     public static void buscarSubmatriz(int matriz[][], int matrizB[][]) {
         
         //hago recorrido de la matriz mas grande

        for (int i = 0; i < 10; i++) {
            
            int posFila = -1;
            int posColumna = -1;
            boolean bandera = false;

            for (int j = 0; j < 10; j++) {
                
                if(matriz[i][j] == matrizB[0][0]){  // si llega a encontrar un valor que comience en el primer valor de la primera posicion de la submatriz
                    posFila = i;                    // entonces analizo a partir de ese punto si se encuentra la submatriz dentro de la matriz mas grande.
                    posColumna = j;
                    
                    for (int k = posFila; k < posfila+2; k++) {
                        
                        for (int l = posColumna; l < posColumna+2; l++) {
                            
                            if(matriz[k][l] == matrizB[i][j]){
                                
                                bandera = true;
      
                        }
                            
                        }
                        
                    }
                    
                
                }
                
                
            }

        }

    }

}
