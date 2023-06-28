/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese 
una frase que puede ser una palabra o varias palabras separadas por un espacio en 
blanco y a través de los métodos set, se guardará la frase y la longitud de manera 
automática según la longitud de la frase ingresada. Deberá además implementar los 
siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
frase ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario. 
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
la frase resultante. 
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no. 
 */
package Servicios;

import Entidades.Cadena;

public class CadenaServicios {

    public int mostrarVocales(Cadena cad) {

        int contVoc = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < cad.getLongitud(); i++) {
            char c = (char) cad.charAt(i);
            if (vocales.contains(String.valueOf(c))) {
                contVoc++;
            }
        }

        return contVoc;
    }

    public String invertitFrase(Cadena cad) {

        String fraseInvertida = "";

        for (int i = cad.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(String.valueOf(cad.charAt(i)));

        }
        return fraseInvertida;

    }

    public void vecesRepetido(String letra, Cadena cad) {

        int contLet = 0;

        for (int i = 0; i < cad.getLongitud(); i++) {
            if (letra.equals(cad.charAt(i).toString())) {
                contLet++;
            }
        }

        System.out.println("El caracter '" + letra + "' en la frase se repite " + contLet + " veces.");

    }
    
    public void compararLongitud(String frase, Cadena cad){
        
        System.out.println("La longitud de la primer cadena es de " + cad.getLongitud());
        System.out.println("La longtiud de la frase nueva ingresada es de " + frase.length());
        System.out.println("La diferencia de los valores de longitud es de " + Math.abs((cad.getLongitud() - frase.length())) );
  
    }
    
    public void unirFrases(String frase, Cadena cad){
        
        System.out.println(cad.getFrase() + frase);
  
    }
    
    public String reemplazar(String letra, Cadena cad){
    
       return cad.getFrase().replace("a", letra);
    
    }
    
     public boolean contiene(String letra, Cadena cad){
    
       return cad.getFrase().contains(letra);
    
    }

}
