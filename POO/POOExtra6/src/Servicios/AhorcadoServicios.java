/*
6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos 
con los parámetros que sean necesarios: 
 Constructores, tanto el vacío como el parametrizado. 
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra 
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas 
máximas, el valor que ingresó el usuario y encontradas en 0. 
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length. 
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. 
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades. 
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 
 Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main. 
Un ejemplo de salida puede ser así: 
Ingrese una letra: 
a 
Longitud de la palabra: 6 
Mensaje: La letra pertenece a la palabra 
Número de letras (encontradas, faltantes): (3,4) 
Número de oportunidades restantes: 4 
---------------------------------------------- 
Ingrese una letra: 
z 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Número de letras (encontradas, faltantes): (3,4) 
Número de oportunidades restantes: 3 
--------------------------------------------- 
Ingrese una letra: 
b 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Número de letras (encontradas, faltantes): (4,3) 
Número de oportunidades restantes: 2 
---------------------------------------------- 
Ingrese una letra: 
u 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Número de letras (encontradas, faltantes): (4,3) 
Número de oportunidades restantes: 1 
---------------------------------------------- 
Ingrese una letra: 
q 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Mensaje: Lo sentimos, no hay más oportunidades 

 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;


public class AhorcadoServicios {
    
    public void crearJuego(Ahorcado a){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la palabra");
        String palabra = leer.nextLine();
        System.out.println("Ingrese cantidad de jugadas maximas");
        int jugadas = leer.nextInt();
        
        a.setTamanoPalabra(palabra.length());
        
        for (int i = 0; i < palabra.length(); i++) {
            a.getPalabra()[i]= String.valueOf(palabra.charAt(i));
        }
        
        a.setCantJugadas(jugadas);
        a.setCantLetrasEncontradas(0);
    }
    
    public void longitud(Ahorcado a){
    
        System.out.println("Longitud de la palabra: " + a.getPalabra().length);
    
    }
    
//     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. 

    public void buscar(String letra, Ahorcado a){
        
        boolean bandera = false;
    
        for (int i = 0; i < a.getPalabra().length; i++) {
            if(a.getPalabra()[i].equals(letra)){
                bandera = true;
            }
        }
        
        if(bandera){
        System.out.println("La letra ingresada es parte de la palabra");
        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }
        
    }
    
//    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
//busque una letra que no esté, se le restará uno a sus oportunidades. 
    
    public boolean encontradas(String letra, Ahorcado a){
    
         boolean bandera = false;
    
        for (int i = 0; i < a.getPalabra().length; i++) {
            if(a.getPalabra()[i].equals(letra)){
                bandera = true;
            }
        }
        
        if(bandera==false){
        a.setCantJugadas(a.getCantJugadas()-1);
        }
        
        return bandera;
        
    }
    
    public void intentos(Ahorcado a){
        System.out.println("A usted le quedan " + a.getCantJugadas() + " intentos");
    }
    
//    Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra o 
//se quede sin intentos. Este método se llamará en el main. 
//Un ejemplo de salida puede ser así: 
//Ingrese una letra: 
//a 
//Longitud de la palabra: 6 
//Mensaje: La letra pertenece a la palabra 
//Número de letras (encontradas, faltantes): (3,4) 
//Número de oportunidades restantes: 4 
//---------------------------------------------- 
    
    public void juego(){
    
        
        crearJuego();
        
    
    }
    
}
