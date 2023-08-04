/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package colleccionesej6.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    private final Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private HashMap<String, Double> listaProductos = new HashMap();

    public void introducirElemento() {

        String rta = "";

        do {

            System.out.println("Ingrese un producto a agregar a la lista:");
//            String nombre = leer.next();
//            System.out.println("Ingrese el precio del producto:");
//            double precio = leer.nextDouble();
//            listaProductos.put(nombre, precio);
            listaProductos.put(leer.next(), leer.nextDouble());

            System.out.println("¿Desea otro producto? S/N");
            rta = leer.next();

            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una letra incorrecta "
                        + "Escoja 'S' para Si, 'N' para Salir.");
                rta = leer.next();
            }

        } while (rta.equalsIgnoreCase("s"));

        System.out.println("\n---LISTA COMPLETA DE PRODUCTOS---");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }

    public void modificarPrecio() {

        String prodMod = "";
        boolean bandera = true;

        System.out.println("Que producto desea modificar su precio?");
        prodMod = leer.next();
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            if (prodMod.equalsIgnoreCase(key)) {
                System.out.println("Ingrese el nuevo precio de " + key);
                entry.setValue(leer.nextDouble());
                bandera = false;
                break;
//                    value = leer.nextDouble();                   
            }

        }

        if (bandera = true) {

            System.out.println("El producto no se encuentra en la lista");

        }

    }

    public void mostrar() {

        System.out.println("\n---LISTA COMPLETA DE PRODUCTOS---");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }

    public void eliminar() {

        String prodMod = "";
        boolean bandera = true;

        System.out.println("Que producto desea eliminar?");
        prodMod = leer.next();
        
//        if(listaProductos.remove(prodMod)){
//        
//            System.out.println("El producto ha sido eliminado");
//            
//        }
        
//        public void eliminarProducto() {
//        System.out.println("Ingrese el nombre del producto a eliminar");
//        productos.remove(leer.next().toUpperCase()); // cambiar a un leer
//    }
        
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            if (prodMod.equalsIgnoreCase(key)) {
                listaProductos.remove(key);
                bandera = false;
                break;
//                    value = leer.nextDouble();                   
            }

        }

        if (bandera == true) {

            System.out.println("El producto no se encuentra en la lista");

        }

    }

    public void introducirDiezAleatorios() {

        double num = 0;

        listaProductos.put("1", num);
        listaProductos.put("2", num);
        listaProductos.put("3", num);
        listaProductos.put("4", num);

        System.out.println("\n---LISTA COMPLETA DE PRODUCTOS---");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }

}
