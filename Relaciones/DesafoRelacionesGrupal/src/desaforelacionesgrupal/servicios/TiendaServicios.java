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
package desaforelacionesgrupal.servicios;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static desaforelacionesgrupal.DesafioRelacionesGrupal.scanner;

import desaforelacionesgrupal.entidades.Producto;
import desaforelacionesgrupal.entidades.Tienda;

public class TiendaServicios {
    private List<Tienda> tiendas;
    private List<Producto> productos;

    // Creo dos listas para los ids de Tienda y de Producto, con la idea de no repetirlos
    private List<Integer> idTiendasUtilizados = new ArrayList<>();
    private List<Integer> idProductosUtilizados = new ArrayList<>();
    // Inicializo dos variables que son las que voy a utilizar para los ID incrementando ambos
    // A medida que creo y borro productos y tiendas
    private int ultimoIdTienda = 0;
    private int ultimoIdProducto = 0;


    // Constructor, donde inicializo las listas cuando se crea TS en el main
    public TiendaServicios() {
        this.tiendas = new ArrayList<>();
        this.productos = new ArrayList<>();
        crearTiendas();
        crearProductos();
    }







    public void crearProducto(String nombreProducto, double precioProducto, int cantidadProducto) {
        // Implementa la lÃ³gica para obtener un nuevo ID Ãºnico
        int nuevoId = obtenerNuevoIdProducto();
        Producto nuevoProducto = new Producto(nuevoId, nombreProducto, precioProducto, cantidadProducto);

        productos.add(nuevoProducto);
        System.out.println("Producto creado exitosamente.");
    }

    private int obtenerNuevoIdProducto() {
        // Primero le agrego el valor + 1 al ID, para tener un numero nuevo
        int nuevoIdProducto = ultimoIdProducto + 1;
        // Compara el numero nuevo con la lista de IDs usados, si ya existe, le suma otro
        // hasta que encuentre un valor que no exista
        while (idProductosUtilizados.contains(nuevoIdProducto)) {
            nuevoIdProducto++;
        }
        // Una vez que lo encuentra agrega ese numero a la lista de IDs ya usados
        idProductosUtilizados.add(nuevoIdProducto);
        // Agrega ese numero al contador que hicimos al principio "ultimoIdProducto"
        ultimoIdProducto = nuevoIdProducto;
        return nuevoIdProducto;
    }

    public void crearTienda(String direccion, String nombre) {
        int nuevoIdTienda = obtenerNuevoIdTienda();
        Tienda nuevaTienda = new Tienda(nuevoIdTienda, direccion, nombre, new ArrayList<>());
        tiendas.add(nuevaTienda);
        System.out.println("Tienda creada exitosamente.");
    }

    private int obtenerNuevoIdTienda() {
        int nuevoIdTienda = ultimoIdTienda + 1;
        while (idTiendasUtilizados.contains(nuevoIdTienda)) {
            nuevoIdTienda++;
        }
        idTiendasUtilizados.add(nuevoIdTienda);
        ultimoIdTienda = nuevoIdTienda;
        return nuevoIdTienda;
    }

    public void modificarTienda(int idTiendaModificar, String nuevaDireccion, String nuevoNombre) {
        Tienda tiendaModificar = encontrarTiendaPorId(idTiendaModificar);
        if (tiendaModificar != null) {
            tiendaModificar.setDireccion(nuevaDireccion);
            tiendaModificar.setNombre(nuevoNombre);
            System.out.println("Tienda modificada exitosamente.");
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void eliminarTienda(int idTiendaEliminar) {
        boolean tiendaEliminada = false;

        Iterator<Tienda> tiendaBuscada = tiendas.iterator();
        while (tiendaBuscada.hasNext()) {
            Tienda tienda = tiendaBuscada.next();
            if (tienda.getId() == idTiendaEliminar) {
                tiendaBuscada.remove();
                tiendaEliminada = true;
                break;
            }
        }

        if (tiendaEliminada) {
            System.out.println("Tienda eliminada exitosamente.");
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void mostrarTiendas() {
        System.out.println("Lista de Tiendas:");
        for (Tienda tienda : tiendas) {
            System.out.println("ID: " + tienda.getId() + " | Nombre: " + tienda.getNombre() + " | DirecciÃ³n: " + tienda.getDireccion());
        }
    }

    public void mostrarProductos() {
        for (Tienda tienda : tiendas) {
            System.out.println("Productos en la tienda '" + tienda.getNombre() + "':");
            for (Producto producto : tienda.getProductos()) {
                System.out.println(producto);
            }
            System.out.println();
        }
    }



    public void modificarProducto(int idProducto) {
        Producto producto = encontrarProductoPorId(idProducto);
        if (producto != null) {
            System.out.println("Ingrese nuevo nombre del producto: ");
            String nuevoNombre = scanner.next();
            producto.setNombre(nuevoNombre);
            System.out.println("Ingrese nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            producto.setPrecio(nuevoPrecio);
            System.out.println("Ingrese nueva cantidad del producto: ");
            int nuevaCantidad = scanner.nextInt();
            producto.setCantidad(nuevaCantidad);
            System.out.println("Producto modificado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(int idProductoEliminar) {
        boolean productoEliminado = false;

        for (Tienda tienda : tiendas) {
            Iterator<Producto> productoBuscado = tienda.getProductos().iterator();
            while (productoBuscado.hasNext()) {
                Producto producto = productoBuscado.next();
                if (producto.getId() == idProductoEliminar) {
                    productoBuscado.remove();
                    productoEliminado = true;
                    break;
                }
            }
        }

        if (productoEliminado) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void agregarProductoATienda(int idTienda, int idProducto, int cantidad) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto producto = encontrarProductoPorId(idProducto);
            if (producto != null) {
                for (int i = 0; i < cantidad; i++) {
                    tienda.getProductos().add(producto);
                }
                System.out.println("Producto agregado a la tienda exitosamente.");
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public Producto encontrarProductoPorId(int idProducto) {
        for (Tienda tienda : tiendas) {
            for (Producto producto : tienda.getProductos()) {
                if (producto.getId() == idProducto) {
                    return producto;
                }
            }
        }
        // Si no se encuentra el producto con el ID dado en ninguna tienda
        return null;
    }

    public Tienda encontrarTiendaPorId(int idTienda) {
        for (Tienda tienda : tiendas) {
            if (tienda.getId() == idTienda) {
                return tienda;
            }
        }
        // Si no se encuentra la tienda con el ID dado
        return null;
    }

    public void eliminarProductoDeTienda(int idTienda, int idProducto) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Iterator<Producto> iter = tienda.getProductos().iterator();
            while (iter.hasNext()) {
                Producto producto = iter.next();
                if (producto.getId() == idProducto) {
                    iter.remove();
                    System.out.println("Producto eliminado de la tienda exitosamente.");
                    return;
                }
            }
            System.out.println("Producto no encontrado en la tienda.");
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void venderProducto(int idTienda, int idProducto, int cantidad) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto producto = encontrarProductoPorId(idProducto);
            if (producto != null) {
                if (cantidad <= producto.getCantidad()) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    System.out.println("Venta realizada exitosamente.");
                } else {
                    System.out.println("No hay suficientes productos en la tienda.");
                }
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void mostrarStockProductoEnTienda(int idTienda, int idProducto) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto producto = encontrarProductoPorId(idProducto);
            if (producto != null) {

                System.out.println("Cantidad del producto '" + producto.getNombre() +
                        "' en la tienda '" + tienda.getNombre() + "': " + producto.getCantidad());
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void crearProductos() {
        // Crea los productos y los agrega a la lista
        productos.add(new Producto(1, "Lavadora", 299.99, 10));
        productos.add(new Producto(2, "Refrigerador", 499.99, 15));
        productos.add(new Producto(3, "Televisor", 199.99, 20));
        productos.add(new Producto(4, "Microondas", 89.99, 12));
        productos.add(new Producto(5, "Aspiradora", 129.99, 8));
        productos.add(new Producto(6, "Cafetera", 39.99, 25));
        productos.add(new Producto(7, "Licuadora", 49.99, 18));
        productos.add(new Producto(8, "Batidora", 34.99, 14));
        productos.add(new Producto(9, "Plancha de Ropa", 19.99, 30));
        productos.add(new Producto(10, "Tostadora", 24.99, 22));
        productos.add(new Producto(11, "Ventilador", 59.99, 20));
        productos.add(new Producto(12, "Ventilador de Techo", 89.99, 15));
        productos.add(new Producto(13, "Olla ElÃ©ctrica", 74.99, 10));
        productos.add(new Producto(14, "MÃ¡quina de Pan", 94.99, 8));
        productos.add(new Producto(15, "Freidora de Aire", 79.99, 12));
    }

    public void crearTiendas() {
        // Idem con las tiendas
        Tienda tienda1 = new Tienda(1, "Brasil 123", "Mercado Libre", new ArrayList<>());
        Tienda tienda2 = new Tienda(2, "Nicaragua 277", "Supermercados TOP", new ArrayList<>());
        Tienda tienda3 = new Tienda(3, "Avenida ColÃ³n 3001", "CETROGAR", new ArrayList<>());

        tiendas.add(tienda1);
        tiendas.add(tienda2);
        tiendas.add(tienda3);
    }

    public void mostrarListaProductosDisponibles() {
        System.out.println("Lista de productos disponibles:");
        for (Producto producto : productos) {
            System.out.println(producto.getId() + " - " + producto.getNombre() + " - Precio: " + producto.getPrecio());
        }
    }

    public void mostrarListaTiendasDisponibles() {
        System.out.println("Lista de tiendas disponibles:");
        for (Tienda tienda : tiendas) {
            System.out.println("ID: " + tienda.getId() + " - Nombre: " + tienda.getNombre() + " - DirecciÃ³n: " + tienda.getDireccion());
        }
        System.out.println();
    }

}
