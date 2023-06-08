/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package EjerciciosExtra;
import java.util.Scanner;

public class Extra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir:");
        int min = leer.nextInt();
        double resto = 3456 % 1440;
        System.out.println("resto es " + resto);
        convertir(min);
       
    }
    
        public static void convertir(int min) {

        int dias = min / 1440; // 1 día tiene 1440 minutos (24 horas * 60 minutos)
        int horas = (min % 1440) / 60; // Calcula el residuo de los minutos restantes y lo divide por 60 para obtener las horas
        int minutosRestantes = min% 60; // Calcula el residuo para obtener los minutos restantes

        System.out.println("Equivalente: " + dias + " día(s), " + horas + " hora(s) y " + minutosRestantes + " minuto(s).");

    }
    
}
