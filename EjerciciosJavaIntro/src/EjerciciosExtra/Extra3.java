/*
 switch(letra){
            
            case "a", "A", "e", "E", "i", "I", "o", "O", "u","U":
                System.out.println("Se ha detectado una vocal.");
                System.out.println("La vocal es " + letra);
                break;
                
            default: 
                System.out.println("La letra ingresada no es una vocal");
                System.out.println("La letra ingresada es " + letra);
        
        }
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();

        switch (letra) {

            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("Se ha detectado una vocal.");
                System.out.println("La vocal es " + letra);
                break;

            default:
                System.out.println("La letra ingresada no es una vocal");
                System.out.println("La letra ingresada es " + letra);
                break;

        }

    }

}
