/*
EJERCICIO 11 
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package GuiaTeoricaTranscurso;
import java.util.Scanner; 

public class Ejercicio11 {
    
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Por favor ingrese una frase");
        String frase = leer.nextLine();
        
        String frase_cod = codificar(frase);
        
        System.out.println("La frase codificada queda asi: " + frase_cod);
        
 }
    
    public static String codificar (String frase){

  String frase_codificada = "";

  int longitud = frase.length();

    for (int i = 0; i < longitud; i++) {
           
    switch(frase.charAt(i)){

    case 'a':
    case 'A':
     frase_codificada = frase_codificada.concat("@");
     break;

    case 'e':
    case 'E':
     frase_codificada = frase_codificada.concat("#");
     break;

    case 'i':
    case 'I':
     frase_codificada = frase_codificada.concat("$");
     break;

    case 'o':
    case 'O':
     frase_codificada = frase_codificada.concat("%");
     break;

    case 'u':
    case 'U':
     frase_codificada = frase_codificada.concat("*");
     break;

    default:
     frase_codificada = frase_codificada.concat(String.valueOf(frase.charAt(i)));
   }

  }
    return frase_codificada;
 }
    
}

