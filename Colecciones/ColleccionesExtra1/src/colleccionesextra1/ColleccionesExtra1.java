/*
En el main, se creará un ArrayList de tipo Producto que guardará todos los productos creados. A
continuación, tendrás que crear un bucle que solicite al usuario los datos de cada producto y los setee en
el objeto Producto correspondiente, que se agregará al ArrayList.
 */
package colleccionesextra1;

import colleccionesextra1.entidades.Producto;
import colleccionesextra1.servicios.ProductoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class ColleccionesExtra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Producto> listaProd = new ArrayList();
        String rta = "";
        ProductoServicio ps = new ProductoServicio();

        do {

            listaProd.add(ps.crearProducto());

            System.out.println("Desea crear otro producto?(Escriba 'si' o 'no')");
            rta = leer.next();

        } while (rta.equalsIgnoreCase("si"));

        for (Producto producto : listaProd) {
            System.out.println(producto);
        }

        System.out.println("PROBAMOS METODO VENTA");
        System.out.println(ps.venta(listaProd));
        System.out.println("-------------------------------------");
        System.out.println("Volvemos a imprimir lista actualizada");
        for (Producto producto : listaProd) {
            System.out.println(producto);
        }

        System.out.println("");
        System.out.println("PROBAMOS METODO REPOSICION");
        System.out.println(ps.reposicion(listaProd));
        System.out.println("-------------------------------------");
        System.out.println("Volvemos a imprimir lista actualizada");
        for (Producto producto : listaProd) {
            System.out.println(producto);
        }
        
        System.out.println("");
        System.out.println("PROBAMOS METODO ACTUALIZAR DATOS");
        ps.actualizar(listaProd);
        System.out.println("-------------------------------------");
        System.out.println("Volvemos a imprimir lista actualizada");
        for (Producto producto : listaProd) {
            System.out.println(producto);
        }
        
        System.out.println("");
        System.out.println("PROBAMOS METODO ELIMINAR");
        ps.eliminar(listaProd);
        System.out.println("-------------------------------------");
        System.out.println("Volvemos a imprimir lista actualizada");
        for (Producto producto : listaProd) {
            System.out.println(producto);
        }

    }

}
