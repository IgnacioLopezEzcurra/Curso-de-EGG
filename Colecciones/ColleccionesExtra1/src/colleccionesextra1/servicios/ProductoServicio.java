/*
• Método venta(): El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al método. El método se
decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método reposición(): El usuario ingresa el nombre del producto que quiere reponer y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto al método. El método incrementa de a uno,
como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
usuario. Esto sucederá cada vez que se produzca una reposición de un producto.
• Método toString para mostrar los datos de los productos.
 */
package colleccionesextra1.servicios;

import colleccionesextra1.entidades.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto() {

        Producto produc = new Producto();

        System.out.println("Ingrese nombre del producto");
        produc.setNombre(leer.next());
        System.out.println("Ingrese categoría del producto");
        produc.setCategoria(leer.next());
        System.out.println("Ingrese precio del producto");
        produc.setPrecio(leer.nextDouble());
        System.out.println("Ingrese cantidad de inventario del producto");
        produc.setCant_inventario(leer.nextInt());

        return produc;

    }

    public boolean venta(ArrayList<Producto> lista) {

        System.out.println("Ingrese el nombre del producto que desea comprar:");
        String prodAComprar = leer.next();
        boolean resultado = true;

        for (Producto producto : lista) {
            if (producto.getNombre().equals(prodAComprar)) {

                if (producto.getCant_inventario() > 0) {
                    resultado = true;
                    producto.setCant_inventario(producto.getCant_inventario() - 1);
                } else {
                    System.out.println("No hay disponibilidad en stock");
                    resultado = false;
                }

                break;
            } else {
                resultado = false;
//                break;
            }
        }

        return resultado;
    }

    public boolean reposicion(ArrayList<Producto> lista) {

        System.out.println("Ingrese el nombre del producto que desea reponer:");
        String prodAReponer = leer.next();
        boolean resultado = true;

        for (Producto producto : lista) {
            if (producto.getNombre().equals(prodAReponer)) {

                resultado = true;
                producto.setCant_inventario(producto.getCant_inventario() + 1);
                break;
            } else {
                resultado = false;
            }
        }

        return resultado;
    }

    public void actualizar(ArrayList<Producto> lista) {

        System.out.println("Ingrese el nombre del producto que desea actualizar:");
        String prodActualizar = leer.next();
        boolean resultado = true;

        for (Producto producto : lista) {
            if (producto.getNombre().equals(prodActualizar)) {
                resultado = true;
                System.out.println("Ingrese nuevo nombre del producto");
                producto.setNombre(leer.next());
                System.out.println("Ingrese nueva categoría del producto");
                producto.setCategoria(leer.next());
                System.out.println("Ingrese nuevo precio del producto");
                producto.setPrecio(leer.nextDouble());
                break;
            } else {
                resultado = false;
            }
        }

        if (!resultado) {
            System.out.println("El producto ingresado no existe en la lista.");
        }

    }

    public void eliminar(ArrayList<Producto> lista) {

        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        String prodEliminar = leer.next();
        boolean resultado = true;

        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto aux = it.next();

            if (aux.getNombre().equals(prodEliminar)) {
                resultado = true;
                it.remove();
                break;
            } else{
            resultado = false;
            }
        }

        if (!resultado) {
            System.out.println("El producto ingresado no existe en la lista.");
        }

    }

}
