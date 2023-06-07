/*
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dim;

        do {

            System.out.println("Ingrese el tamaño de la matriz. No debe ser mayor a 10.");
            dim = leer.nextInt();

        } while (dim < 1 || dim >= 10);

        int matriz[][] = new int[dim][dim];

        System.out.println("Los valores ingresados a la matriz deben ser entre el 1 y el 9.");

        armarMatriz(matriz, dim);

        System.out.println("La matriz creada es: ");
        imprimir(matriz, dim);

        verificar(matriz, dim);

    }

    public static void armarMatriz(int matriz[][], int dim) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {
                System.out.println("Ingrese valor para la posicion [" + i + "]" + "[" + j + "]");
                matriz[i][j] = leer.nextInt();
            }

        }

    }

    public static void imprimir(int matriz[][], int dim) {

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }

    }

    public static void verificar(int matriz[][], int dim) {

        int suma1, suma2, sumaFil, sumaCol, aux;
        boolean verificar;

        verificar = false;
        suma1 = 0;
        suma2 = 0;
        aux = 0;

        //	--------------------Sumatoria de diagonales ------------
        for (int i = 0; i < dim; i++) {
//		Diagonal principal
            suma1 = suma1 + matriz[i][i];
//		Diagonal inversa
            suma2 = suma2 + matriz[i][dim - i - 1];
        }

//	Mostrar "Suma de la diagonal principal " suma1	
//	Mostrar "Suma de la diagonal inversa " suma2
        if (suma1 != suma2) {
            System.out.println("La matriz es mágica: " + verificar);
        }

        if (suma1 == suma2) {

            aux = suma1;
            verificar = true;

            //	--------------------Sumatoria de filas y columnas ------------
            for (int i = 0; i < dim; i++) {

                sumaCol = 0;
                sumaFil = 0;
                for (int j = 0; j < dim; j++) {

                    sumaCol = sumaCol + matriz[j][i];
                    sumaFil = sumaFil + matriz[i][j];
                    if (sumaCol == sumaFil && sumaCol == aux) {

                        verificar = true;
                    } else {

                        verificar = false;
                    }

                }

                System.out.println("la suma de la columna " + i + " es " + sumaCol);
                System.out.println("la suma de la fila " + i + " es " + sumaFil);

            }

            System.out.println("La matriz es mágica: " + verificar);

        }

    }

}
