/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano.
 */
package EjerciciosExtra;

import java.util.Scanner;


public class Extra4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        do{
        System.out.println("Por favor ingrese un numero entre 1 y 10: ");
        num = leer.nextInt();
        
        }while(num < 1 || num > 10);
        
        Romano(num);

    }
    
        public static void Romano(int num) {

        switch(num){
            
            case 1:
                System.out.println("Su equivalente romano es I");
                break;
            case 2:
                System.out.println("Su equivalente romano es II");
                break;
            case 3:
                System.out.println("Su equivalente romano es III");
                break;
            case 4:
                System.out.println("Su equivalente romano es IV");
                break;
            case 5:
                System.out.println("Su equivalente romano es V");
                break;
            case 6:
                System.out.println("Su equivalente romano es VI");
                break;
            case 7:
                System.out.println("Su equivalente romano es VII");
                break;
            case 8:
                System.out.println("Su equivalente romano es VIII");
                break;
            case 9:
                System.out.println("Su equivalente romano es IX");
                break;
            case 10:
                System.out.println("Su equivalente romano es X");
                break;
    
        }
    }
    
}
