/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida 
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido

 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int dim = leer.nextInt();

        int vector[] = new int[dim];

        rellenar(vector, dim);
        System.out.println("Su vector es el siguiente: ");
        imprimir(vector, dim);
        System.out.println("");
        System.out.println("Ingrese el numero que desea buscar en el vector: ");
        int bus = leer.nextInt();
        buscar(vector, dim, bus);
    }

    public static void rellenar(int vector[], int dim) {

        for (int i = 0; i < dim; i++) {

            vector[i] = (int) (Math.random() * 10);

        }

    }

    public static void imprimir(int vector[], int dim) {

        for (int i = 0; i < dim; i++) {

            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.println("[" + vector[i] + "]");

        }

    }

    public static void buscar(int vector[], int dim, int bus) {

        int cont = 0;
        int indice = 0;

        for (int i = 0; i < dim; i++) {

            if (vector[i] == bus) {

                cont = cont + 1;
                indice = i;
            }

        }

        if (cont == 0) {
            System.out.println("Su numero no ha sido encontrado");
        } else if (cont == 1) {
            System.out.println("Su numero ha sido encontrado " + cont + " vez");
        } else if (cont > 1) {
            System.out.println("Su numero ha sido encontrado " + cont + " veces");
        }

    }

}
