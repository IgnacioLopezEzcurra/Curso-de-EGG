/*
Realizar una aplicación de Gimnasio, que permita tener agregar clientes, y rutinas. Para ello, vamos a utilizar diferentes
clases y metodos.

CLASES:
• Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo
(cadena de caracteres)
• Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
descripcion
• Crea una clase ServicioCliente y una clase ServicioRutina.
 */
package Entidades;

public class Cliente {

    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", objetivo=" + objetivo + '}';
    }
    
    
    

}
