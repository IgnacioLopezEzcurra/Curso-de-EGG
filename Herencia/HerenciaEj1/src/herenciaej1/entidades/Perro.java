/*

1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
siguiente:


 */

package herenciaej1.entidades;


public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }
    
    

    @Override
    public void Alimentarse() {
        System.out.println("Hola soy " + this.nombre + " el perro y me alimento de " + this.alimento);
    }
 
}
