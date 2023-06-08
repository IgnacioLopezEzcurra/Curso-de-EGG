
package test;

import java.util.Scanner;

public class Ejercicio11B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase por favor:");
        String frase = leer.nextLine();

        String fraseCodificada = codificador(frase);

        System.out.println(fraseCodificada);

    }

    public static String codificador(String frase){
        String fraseCodificada = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            switch (letra) {
                case 'a':
                    letra = '@';
                    break;
                case 'e': 
                    letra = '#';
                    break;
                case 'i':
                    letra = '$';
                    break;
                case 'o':
                    letra = '%';
                    break;
                case 'u':
                    letra = '*';
                    break;
                case ' ':
                    letra = ' ';
                    break;
                default:
                    letra = letra;
            }
            fraseCodificada += letra;
        }
         return fraseCodificada;
      }

}
