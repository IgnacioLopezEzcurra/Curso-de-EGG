/*
    Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta 
    página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el 
    número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package colleccionesejex4.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<Integer, String> listaPostal = new HashMap();

    /*
            listaPostal.put(767, "Hattarvík");
            listaPostal.put(72300, "Pincé");
            listaPostal.put(7600, "Mar del Plata");
            listaPostal.put(4000, "San Miguel de Tucumán");
            listaPostal.put(2000, "Rosario");
            listaPostal.put(1900, "La Plata");
            listaPostal.put(5290000, "Osorno");
            listaPostal.put(72400, "Préval");
            listaPostal.put(72340, "Ponce Sur Le Loir");
            listaPostal.put(72350, "Pont de Braye ");

    
     */
    public void ingresarCodPost() {

        System.out.println("Se agregaran 10 codigos y ciudades:");

        listaPostal.put(767, "Hattarvík");
        listaPostal.put(72300, "Pincé");
        listaPostal.put(7600, "Mar del Plata");
        listaPostal.put(4000, "San Miguel de Tucumán");
        listaPostal.put(2000, "Rosario");
        listaPostal.put(1900, "La Plata");
        listaPostal.put(5290000, "Osorno");
        listaPostal.put(72400, "Préval");
        listaPostal.put(72340, "Ponce Sur Le Loir");
        listaPostal.put(72350, "Pont de Braye ");

    }

    public void mostrarLista() {

        for (Map.Entry<Integer, String> entry : listaPostal.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("[" + key + " " + value + "]");

        }

    }

    public void buscarCod() {

        int busc = 0;
        boolean bandera = true;

        System.out.println("\n Ingrese un codigo postal a buscar:");
        busc = leer.nextInt();

        for (Map.Entry<Integer, String> entry : listaPostal.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (key == busc) {

                System.out.println("La ciudad asociada a su codigo postal es " + value);
                bandera = true;
                break;
            } else {
                bandera = false;
            }

        }

        if (bandera == false) {
            System.out.println("Su codigo no se encuentra en la lista");
        }

    }

    public void agregarCodPost() {

        System.out.println("Ingrese un codigo posta y su respectiva ciudad a la lista:");
        System.out.print("Codigo: ");
        int cod = leer.nextInt();
        System.out.print("Ciudad: ");
        String ciudad = leer.next();

        listaPostal.put(cod, ciudad);

    }
    
    public void eliminar(){
    
        System.out.println("Elimne 3 ciudades a elección:");
        
        mostrarLista();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el codigo postal de la ciudad a eliminar: ");
            listaPostal.remove(leer.nextInt());
 
        }
        
        System.out.println("Así te quedo el mundo luego de eliminar las ciudades:");
        mostrarLista();
        
    }

}
