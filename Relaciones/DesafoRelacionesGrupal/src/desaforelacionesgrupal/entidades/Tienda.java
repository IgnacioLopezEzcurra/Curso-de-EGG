/*
Se necesita una app para una cadena de tiendas en la cual queremos
almacenar los distintos productos que venderemos y el precio que
tendran,
Ademas, se necesita que la app cuente con las funciones basicas.
(Estas las realizaremos en la clase de servicio)
Las funciones son basicas son:
CrearProducto()
MostrarProductos()
ModificarProducto()
EliminarProducto()
Cada producto tiene que tener como atributos: id, nombre, y debe tener
asociado un precio.

La app, tambien debe contener las diferentes tiendas. Cada tienda, tendrá como atributos: ID de tienda, Lista de productos,
direccion, representante de la tienda.
Las funciones de la tienda son:
CrearTienda()
MostrarTiendas()
ModificarTienda()
EliminarTienda()
Además:
AgregarProductos(): Agrega el producto elegido y la cantidad.
VenderProductos(): Vende cierta cantidad del producto.
EliminarProductos(): Elimina el Producto de esa tienda.
StockProductos(): Nos devuelve cuantos productos hay.
Nota:
- Cada tienda tendrá una lista de productos diferentes con sus respectivos stocks.

Una vez realizado el programa:
- Crear 3 tiendas.
- Crear 15 productos.
- Asociar a cada tienda, 5 productos de los creados. (algunos productos pueden repetirse, pero no todos)
- Agregar cantidad de stock de cada producto a la tienda
- Realizar algunas ventas
- Calcular el stock restante.
Nota: Agregar o modificar funciones para que se realice correctamente lo que se pide. (Por ejemplo; No se
puede vender cierto producto si es que no hay stock.)

 */

package desaforelacionesgrupal.entidades;

import java.util.ArrayList;
import java.util.List;


public class Tienda {
    private int id;
    private String direccion;
    private String Nombre;
    private List<Producto> productos;

    public Tienda(int id,String direccion, String Nombre, List<Producto> productos) {
        this.id = id;
        this.direccion = direccion;
        this.Nombre = Nombre;
        this.productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", representante='" + Nombre + '\'' +
                ", productos=" + productos +
                '}';
    }
}