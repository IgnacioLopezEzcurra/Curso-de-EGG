/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals()
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio12 {

   
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido al simulador del dispositivo RS232"
                + "Las cadenas a ingresar deben tener un formato \n" +
"fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que \n" +
"ser X y el último tiene que ser una O. ");
        
        System.out.println("");
        
        System.out.println("Las secuencias leídas que respeten el formato se consideran correctas, la secuencia \n" +
"especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia \n" +
"distinta de FDE, que no respete el formato se considera incorrecta. ");
        
        String cadena = "";
        int correctas = 0;
        int incorrectas = 0;
        
        do{
            
            System.out.println("Por favor ingrese una cadena: ");
            cadena = leer.nextLine();
            
            if(cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O") || cadena.equals("&&&&&")){
            
                correctas = correctas + 1;
            
            }else{
            
                incorrectas = incorrectas + 1;
                
            }
            
            
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("");
        System.out.println("INFORME FINAL");
        System.out.println("La cantidad de lecturas correctas fueron " + correctas);
        System.out.println("La cantidad de lecturas incorrectas fueron " + incorrectas);
    }
    
}
