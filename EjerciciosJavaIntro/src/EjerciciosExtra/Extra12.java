/*
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package EjerciciosExtra;

public class Extra12 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if (i == 3 || j == 3 || k == 3) {
                        String numi = String.valueOf(i);
                        String numj = String.valueOf(j);
                        String numk = String.valueOf(k);

                        if (numi.equals("3")) {
                            numi = "E";
                        }

                        if (numj.equals("3")) {
                            numj = "E";
                        }

                        if (numk.equals("3")) {
                            numk = "E";
                        }
                        
                        System.out.println(numi + "-" + numj + "-" + numk);

                    }else{
                    System.out.println(i + "-" + j + "-" + k);
                    }
                    
                }
            }
        }

    }

}
