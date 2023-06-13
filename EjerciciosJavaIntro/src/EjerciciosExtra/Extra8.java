/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, cont, par, impar;
        cont = 0;
        par = 0;
        impar = 0;

        do {
            System.out.println("Ingrese un numero entero: ");
            num = leer.nextInt();
            if (num > 0) {
                cont = cont + 1;

                if (num % 2 == 0) {
                    par = par + 1;

                } else {
                    impar = impar + 1;
                }
            }

        } while (num % 5 != 0);
        
        System.out.println("La cantidad de números leídos fueron " + cont);
        System.out.println("La cantidad de numeros pares fueron " + par);
        System.out.println("La cantidad de números impares fueron " + impar);

    }

}
