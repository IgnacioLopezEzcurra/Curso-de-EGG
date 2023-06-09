/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package EjerciciosExtra;
import java.util.Scanner;

public class Extra6 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a evaluar su altura");
        int cantidad = leer.nextInt();
        double personas[] = new double [cantidad]; 
        
        ingresarAlturas(personas, cantidad);
        System.out.println("");
        promedioGeneral(personas, cantidad);
        System.out.println("");
        promedio160(personas, cantidad);
        
    }
    
    public static void ingresarAlturas(double personas [], int cantidad){
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la altura de la persona N° " + (i+1));
            personas [i] = leer.nextDouble();
        }
    
    }
    
     public static void promedioGeneral(double personas [], int cantidad){
        
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
           suma = suma + personas[i];
        }
        
        promedio = suma / cantidad;
        
         System.out.println("EL promedio total de estaturas es " + promedio);
    
    }
     
     public static void promedio160(double personas [], int cantidad){
        int cont = 0;
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            
            if(personas[i] < 1.60){
            suma = suma + personas[i];
            cont = cont + 1;          
            }
           
        }
        
        promedio = suma / cont;
        
         System.out.println("EL promedio de las personas menores a 1,60 mts es " + promedio);
    
    }
    
}
