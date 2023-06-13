/*
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
 */
package EjerciciosExtra;
import java.util.Scanner;

public class Extra10 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int res = 0;
        
        System.out.println("Adivine el resultado de la multiplicacion entre dos numeros generados \n"
                + "aleatoriamente entre 0 y 10!");
        do{
            res = leer.nextInt();
            if(res!= num1*num2){
                System.out.println("Incorrecto! Pruebe otra vez");
            }
        
        }while(res != num1*num2);
        
        System.out.println("Correcto! La respuesta es " + res);
        System.out.println("Los numeros eran " + num1 + " y " + num2);
 
    }
    
}
