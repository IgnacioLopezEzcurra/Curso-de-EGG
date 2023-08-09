/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el 
programa mostrará por pantalla el número de valores que se han leído, su suma y su 
media (promedio). 
 */
package colleccionesejex1.servicios;

import java.util.ArrayList;
import java.util.Scanner;


public class Extra1Servicio {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Integer> listaNum = new ArrayList();    
    
    public void llenarLista(){
        
        int cond = 0;
    
        do{
            
            System.out.println("Ingrese numeros a la lista:");
            cond = leer.nextInt();
            
            if(cond != -99){
            
                listaNum.add(cond);
            
            } 
            
            
        }while(cond != -99);
        
    
    }
    
    public void mostrarLista(){
    
        for (Integer num : listaNum) {
            
            System.out.println(num);
            
        }
    
    }
    
    public void mostrarSuma(){
        
        int suma = 0;
    
         for (Integer num : listaNum) {
            
            suma = suma + num;
            
        }
         
         System.out.println("La suma de la lista es " + suma);
    
    }
    
    
    public void mostrarPromedio(){
    
        double suma = 0;
    
         for (Integer num : listaNum) {
            
            suma = suma + num;
            
        }
         
         System.out.println("El promedio de los numeros de la lista es " + suma / listaNum.size());
    
    }
    
}
