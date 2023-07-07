/*
Prueba analizar el siguiente código con tu equipo y realizarle todos los cambios necesarios para que cumpla con las reglas de código limpio
 */
package codigo.orden;

public class CodigoOrden {

    //Método

    public static void m(int a, int b) {
        int c = a + b;
        System.out.println("El resultado es: " + c);
    }
    //Método

    public static void metodoLargo(int x, int y, int z) {
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par.");
            } else {
                System.out.println("El número " + i + " es impar.");
            }
        }
        int resultado = y * z;
        if (resultado > 100) {
            System.out.println("El resultado es mayor a 100.");
        } else {
            System.out.println("El resultado es menor o igual a 100.");
        }
    }

    public static void main(String[] args) {
        m(3, 4);
        metodoLargo(10, 5, 2);
    }
}
