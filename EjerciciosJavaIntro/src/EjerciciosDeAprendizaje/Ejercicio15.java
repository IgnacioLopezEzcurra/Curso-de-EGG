/*
Funciones en Java
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
 */
package EjerciciosDeAprendizaje;

public class Ejercicio15 {

   
    public static void main(String[] args) {

        int vector [] = new int [100];
                
        rellenar(vector);
        imprimir(vector);
    }
    
    public static void rellenar(int vector[]){
        
    for (int i = 0; i < 100; i++) {
         
            vector[i] = i + 1; // Le asignamos a cada posicion del vector el numero 6 
            
        }
    
    }
    
    public static void imprimir(int vector[]){
    
    for (int i = 99; i >= 0; i--) {
            
            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.println("[" + vector[i] + "]");
            
        }
        
    }
    
    
}
