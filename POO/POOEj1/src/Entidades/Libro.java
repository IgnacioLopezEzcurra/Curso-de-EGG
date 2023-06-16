/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas. 
 */
package Entidades;

import java.util.Scanner;

public class Libro {
    
    Scanner leer = new Scanner(System.in);

    //Atributos
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumPaginas;

    //Constructor Vacio
    public Libro() {
    }

    //Constructor con todos los atributos
    public Libro(int ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    //GETTERS && SETTERS
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    //METODOS PERSONALIZADOS
    public void cargar(int ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }
    
    public String mostrar(int ISBN, String Titulo, String Autor, int NumPaginas){
    
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    } 

    @Override //ESTO ES EL METODO TO STRING
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }

}
