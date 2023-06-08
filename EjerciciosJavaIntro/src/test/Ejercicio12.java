/*EJERCICIO 12 
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
segundo, sino informe que no lo son.*/


package test;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String args[]){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Por favor ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
       
    }
    
    
public static void EsMultiplo(int num1, int num2){
    
        if (num1 % num2 == 0){
            System.out.println("El primer numero es multiplo del segundo, es decir " + num1 + " es multiplo de " + num2);
        }else{
            System.out.println("Los numero no son multiplos, es decir " + num1 + " no es multiplo de " + num2);
        } 
       
    }    
    
}