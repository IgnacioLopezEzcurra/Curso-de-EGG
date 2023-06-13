/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la 
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int cant = leer.nextInt();
        System.out.println("Ingrese la cantidad de hijos que tendran estas familias: ");
        int hijos = leer.nextInt();

        int familia[][] = new int[cant][hijos];
        rellenar(familia, cant, hijos);
        System.out.println("");
        imprimir(familia, cant, hijos);
        System.out.println("");
        edadMedia(familia, cant, hijos);

    }

    public static void rellenar(int matriz[][], int familia, int hijo) {
        System.out.println("Vamos a rellenar la edad de los hijos");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < familia; i++) {

            for (int j = 0; j < hijo; j++) {
                System.out.println("Ingrese la edad de la familia N° [" + (i+1) + "]" + " hijo N° " + "[" + (j+1) + "]");
                matriz[i][j] = leer.nextInt();
            }

        }

    }

    public static void imprimir(int matriz[][], int f, int h) {

        for (int i = 0; i < f; i++) {

            for (int j = 0; j < h; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }

    }

    public static void edadMedia(int matriz[][], int f, int h) {

        for (int i = 0; i < f; i++) {

            double media = 0;
            int cont = 0;

            for (int j = 0; j < h; j++) {
                media = media + matriz[i][j];
                cont = cont + 1;
            }
            media = media / cont;
            System.out.println("La edad media de la familia " + (i + 1) + " es " + media);

        }

    }

}
