/*
1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas 
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán 
además definir los métodos getters y setters correspondientes. 
 */
package pooextra1;

import Entidades.Cancion;


public class POOExtra1 {


    public static void main(String[] args) {
        
        Cancion cancion = new Cancion();
        
        System.out.println(cancion.getAutor() + "← aca esta el autor vacio, y aca el titulo vacio tambien →" + cancion.getTitulo() + "←");
        
    }
    
}
