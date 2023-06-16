package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {

    

    public Libro cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Introducir Titulo");
        String Titulo = leer.next();
        System.out.println("Introducir Autor");
        String Autor = leer.next();
        System.out.println("Introducir cantidad de paginas");
        int NumPaginas = leer.nextInt();
        
        return new Libro (ISBN, Titulo, Autor, NumPaginas);
    }

    public static void mostrar(Libro l1) {
        System.out.println("Los datos del libro ingresado son: ");
        System.out.println("ISBN: "+l1.getISBN()+"\nTitulo: "+l1.getTitulo()+"\nAutor: "+l1.getAutor()+"\nNúmeros de paginas: "+l1.getNumPaginas());
    }

}
