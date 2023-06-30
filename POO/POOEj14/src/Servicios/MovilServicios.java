/*
14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que 
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda 
almacenar cada producto con su información. Crear una entidad Movil con los atributos 
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
correspondiente al código. A continuación, se implementarán los siguientes métodos: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo 
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;


public class MovilServicios {
    
        public void ingresarCodigo(Movil movil) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int codigo[] = new int[7];
        System.out.println("Ingrese el codigo del movil");

        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Cargue el valor del subindice N°" + (i + 1));
           codigo[i] = leer.nextInt();
        }
        
        movil.setCodigo(codigo);
        
    }

    public Movil cargarCelular() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Usted esta por cargar un nuevo celular");
        System.out.println("Ingrese marca del movil: ");
        String marca = leer.nextLine();
        
        System.out.println("Ingrese modelo del movil: ");
        String modelo = leer.nextLine();
        
        System.out.println("Ingrese precio del movil: ");
        int precio = leer.nextInt();
        
        System.out.println("Ingrese cantidad memoria Ram: ");
        int memoriaRam = leer.nextInt();
        
        System.out.println("Ingrese almacenamiento disponible: ");
        int almacenamiento = leer.nextInt();
        
        Movil movil = new Movil (marca, modelo, precio, memoriaRam, almacenamiento);
        ingresarCodigo(movil); // Llamada al método ingresarCodigo() para ingresar los valores del codigo
        
        return movil;

    }
    
}
