/*

 */
package colleccionesextra1.entidades;


public class Producto {
    
    
    private String nombre;
    private String categoria;
    private double precio;
    private Integer cant_inventario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, Integer cant_inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cant_inventario = cant_inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCant_inventario() {
        return cant_inventario;
    }

    public void setCant_inventario(Integer cant_inventario) {
        this.cant_inventario = cant_inventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", cant_inventario=" + cant_inventario + '}';
    }
    
    
    
    
}
