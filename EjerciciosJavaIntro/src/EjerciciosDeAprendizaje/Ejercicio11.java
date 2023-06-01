/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
del programa, caso contrario se vuelve a mostrar el menú.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora, por favor ingrese el primer numero: ");
        double num1 = leer.nextDouble();
        System.out.println("Ahora ingrese el segundo numero: ");
        double num2 = leer.nextDouble();
        boolean bandera = true;
        int opcion; // Movido antes del bucle

        do {
            System.out.println("Bienvenido al MENU PRINCIPAL.");

            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");

            System.out.println("Por favor, escoja una opción: ");

            opcion = leer.nextInt();
          

            switch (opcion) {

                case 1:
                    System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es igual a " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("La division de " + num1 + " / " + num2 + " es igual a " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String siNo = leer.next();

                    if (siNo.equalsIgnoreCase("S")) {
                        opcion = 5;
                        bandera = false;
                    } else if (siNo.equalsIgnoreCase("N")) {
                        opcion = 0;
                        bandera = true;
                    }
                    break;
            }

        } while (opcion != 5 || bandera == true);
        System.out.println("Ha escogido salir. PROGRAMA FINALIZADO.");
    }

}
