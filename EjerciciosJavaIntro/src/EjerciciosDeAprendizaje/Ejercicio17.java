/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int dim = leer.nextInt();

        int vector[] = new int[dim];
        
        rellenar(vector, dim);
        System.out.println("Su vector es el siguiente: ");
        imprimir(vector, dim);
        System.out.println("");
        buscarDigitos(vector, dim);
    }
    
     public static void rellenar(int vector[], int dim) {
         Scanner leer = new Scanner(System.in);

        for (int i = 0; i < dim; i++) {
            
            System.out.println("Ingrese el valor del vector [" + i + "]");
            vector[i] = leer.nextInt();

        }

    }
    
      public static void imprimir(int vector[], int dim) {

        for (int i = 0; i < dim; i++) {

            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.println("[" + vector[i] + "]");

        }

    }
      
       public static void buscarDigitos(int vector[], int dim) {
           
           int unDig, dosDig, tresDig, cuaDig, cinDig;
           unDig = 0;
           dosDig = 0;
           tresDig = 0;
           cuaDig = 0;
           cinDig = 0;
           
           boolean bandera;
           bandera = false;

        for (int i = 0; i < dim; i++) {
            
            if(vector[i]>= 0 && vector[i]<10){
            unDig = unDig + 1;
            }
            
            if(vector[i]>= 10 && vector[i]<100){
            dosDig = dosDig + 1;
            }
            
             if(vector[i]>= 100 && vector[i]<1000){
            tresDig = tresDig + 1;
            }
             
              if(vector[i]>= 1000 && vector[i]<10000){
            cuaDig = cuaDig + 1;
            }
              
               if(vector[i]>= 10000 && vector[i]<100000){
            cinDig = cinDig + 1;
            }
               
             if(vector[i]>= 100000){
            bandera = true;
            }   
        }
        
           System.out.println("La cantidad de numeros con un digito son " + unDig);
           System.out.println("La cantidad de numeros con dos digitos son " + dosDig);
           System.out.println("La cantidad de numeros con tres digitos son " + tresDig);
           System.out.println("La cantidad de numeros con cuatro digitos son " + cuaDig);
           System.out.println("La cantidad de numeros con cinco digitos son " + cinDig);
           
           if(bandera==true){
               System.out.println("Ha ingresado valores iguales o mayor a 6 digitos, solo se contabilizaran hasta 5 digitos.");
           }

    }
      
}
