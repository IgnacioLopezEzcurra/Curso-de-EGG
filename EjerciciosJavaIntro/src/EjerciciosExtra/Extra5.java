/*
5. Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;

        do {
            System.out.println("Por favor ingrese una letra que represente la clase de un socio A, B o C: ");
            letra = leer.nextLine();

        } while (!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("B") && !letra.equalsIgnoreCase("C"));
        

        System.out.println("Ahora ingrese el costo del tratamiento: ");
        double costo = leer.nextInt();
        
        importe(letra, costo);

    }

    public static void importe(String letra, double costo) {

        switch (letra) {

            case "A":
            case "a":
                costo = costo / 2;
                System.out.println("El total a pagar del paciente es " + costo);
                break;
            case "B":
            case "b":
                costo = costo * 0.35;
                System.out.println("El total a pagar del paciente es " + costo);
                break;
            case "C":
            case "c":
                System.out.println("El total a pagar del paciente es " + costo);
                break;

        }
    }

}
