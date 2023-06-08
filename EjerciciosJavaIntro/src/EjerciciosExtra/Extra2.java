/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package EjerciciosExtra;


public class Extra2 {


    public static void main(String[] args) {
       
        int A, B, C, D, aux;
        A = 1;
        B = 4;
        C = 45;
        D = 7;
        
        System.out.println("La variable A ahora vale " + A);
        System.out.println("La variable B ahora vale " + B);
        System.out.println("La variable C ahora vale " + C);
        System.out.println("La variable D ahora vale " + D);
        System.out.println("******************************");
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("La variable A ahora vale " + A);
        System.out.println("La variable B ahora vale " + B);
        System.out.println("La variable C ahora vale " + C);
        System.out.println("La variable D ahora vale " + D);
    }
    
}
