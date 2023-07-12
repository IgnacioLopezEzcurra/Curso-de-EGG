/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Service {
  
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado a1 = new Ahorcado();
    
    //crea un nuevo objeto Ahorcado
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra para jugar");
        String pal = leer.next();
        String[] palabraSecreta = new String[pal.length()]; 
        
        for (int i = 0; i < pal.length(); i++) {
            palabraSecreta[i] = pal.substring(i, i+1);
        }
        
        a1.setPalabraSecreta(palabraSecreta);
        
        System.out.println("Ingresa la cantidad de jugadas maximas");
        a1.setCantidadIntentos(leer.nextInt());
        
        a1.setCantidadLetras(0);
        
        return a1;
    }
    
    public void longitud() {
        System.out.println("Longitud de la palabra: " + a1.palabraSecreta.length);
    }
    
    public void buscar(String letra) {

        //for (int i = 0; i < a1.getPalabraSecreta().length; i++) {
            /*boolean encontrado = false;
            if (a1.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                encontrado= true;
                System.out.println("La letra se encuentra");
                
            } else {
                System.out.println("La letra no se encuentra");
            }
                
        }*/
           
        boolean encontrado = false;
        for (int i = 0; i < this.a1.getPalabraSecreta().length; i++) {
            if (a1.getPalabraSecreta() [i].equals(letra)) {
                encontrado = true;
                this.a1.setCantidadLetras(a1.getCantidadLetras() +1);              
            }
        }
        if (encontrado) {
            System.out.println("La letra " + letra + " está en la palabra.");
        } else {
            System.out.println("La letra " + letra + " no está en la palabra.");
            a1.setCantidadIntentos((a1.getCantidadIntentos() -1)) ;
        }
        System.out.println(a1.getCantidadLetras());
        System.out.println("faltan encontrar " + (this.a1.getPalabraSecreta().length - a1.getCantidadLetras()));
        System.out.println("quedan " + a1.getCantidadIntentos()+ " intentos");
    }
    
    public void juego() {
        crearJuego();
        String letraDos =" ";
        while (this.a1.getCantidadIntentos() > 0 && this.a1.getCantidadLetras()< this.a1.getPalabraSecreta().length) {
            
            System.out.println("Escribe una letra");
            String letra = leer.next();
            for (int i = 0; i < letraDos.length(); i++) {
                System.out.println(letraDos.substring(i,i+1));
                if (letraDos.substring(i,i+1).equalsIgnoreCase(letra)){
                    System.out.println("la letra ya fue ingresada");
                } else{
                     letraDos = letraDos.concat(letra);
                     System.out.println(letraDos);
                     buscar(letra);
                     break;
                                  
                }
            }
        }
        if (this.a1.getCantidadLetras() == this.a1.getPalabraSecreta().length) {
            System.out.println("¡Felicidades, ganaste! La palabra era: " + Arrays.toString(this.a1.getPalabraSecreta()));
        } else {
            System.out.println("¡Lo siento, perdiste! La palabra era: " + Arrays.toString(this.a1.getPalabraSecreta()));
            System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n" +
"            xx                xx\n" +
"      #############           xx\n" +
"      ##         ##           xx\n" +
"      #  ~~   ~~  #           xx\n" +
"      #  ()   ()  #           xx\n" +
"      (     ^     )           xx\n" +
"       |         |            xx\n" +
"       |  {===}  |            xx\n" +
"        \\ xxxxx /             xx\n" +
"       /  -----  \\            xx\n" +
"    ---  |%\\ /%|  ---         xx\n" +
"   /     |%%%%%|     \\        xx\n" +
"         |%/ \\%|              xx\n" +
"                              xx \n" +
"                              xx\n" +
"                        xxxxxxxxxxxxx");
        }
    }
}