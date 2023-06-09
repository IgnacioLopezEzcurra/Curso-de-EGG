/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los 
números serán introducidos por el usuario. Realice dos versiones del programa, una 
usando el bucle “while” y otra con el bucle “do - while”.
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a evaluar:");
        int cant = leer.nextInt();
        double numeros[] = new double[cant];
        
        ingresarNumeros(numeros, cant);
        System.out.println("");
        promedioGeneral(numeros, cant);

    }

    public static void ingresarNumeros(double numeros[], int cant) {

        Scanner leer = new Scanner(System.in);
        int i = 0;

        while (i < cant) {
            System.out.println("Ingrese el valor del número N° " + (i + 1));
            numeros[i] = leer.nextDouble();
            i++;
        }

    }

    public static void promedioGeneral(double numeros[], int cant) {

        double promedio = 0;
        double suma = 0;
        int i = 0;

        while (i < cant) {
            suma = suma + numeros[i];
            i++;
        }

        promedio = suma / cant;

        System.out.println("EL promedio total de los numeros ingresados es es " + promedio);

    }

}
