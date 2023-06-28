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
package pooej8;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

public class POOEj8 {
    
    public static void main(String[] args) {
        
        CadenaServicios cs = new CadenaServicios();
        Cadena c1 = new Cadena();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese una frase: ");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        
        System.out.println("---------------------");
        System.out.println("Cuantas vocales hay?: " + cs.mostrarVocales(c1));
        
        System.out.println("---------------------");
        System.out.println("La frase invertida es asi: " + cs.invertitFrase(c1));
        
        System.out.println("---------------------");
        System.out.println("Por favor ingrese un caracter");
        cs.vecesRepetido(leer.nextLine(), c1);
        
        System.out.println("---------------------");
        System.out.println("Ingrese una nueva frase");
        cs.compararLongitud(leer.nextLine(), c1);
        
        System.out.println("---------------------");
        System.out.println("Ingrese una nueva frase y a continuacion la uniremos con la primera");
        cs.unirFrases(leer.nextLine(), c1);
        System.out.println("---------------------");
        System.out.println("Escoja un caracter. Este caracter reemplazara a todas las letras 'a' de la frase"
                + " incluidas las mayúsculas.");
        System.out.println(cs.reemplazar(leer.nextLine(), c1));
        
        System.out.println("---------------------");
        System.out.println("Ingrese una letra para verificar si se encuentra en la frase: ");
        System.out.println(cs.contiene(leer.nextLine(), c1));
        
    }
    
}
