/*
3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes: 
 Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones. 
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b 

 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {

    public Raices crearObjeto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor para A: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor para B: ");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor para C: ");
        double c = leer.nextDouble();

        return new Raices(a, b, c);

    }

    public double getDiscriminante(Raices raiz) {

        double discriminante = Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC());

        return discriminante;

    }

    public boolean tieneRaices(Raices raiz) {

        return getDiscriminante(raiz) >= 0;

    }

    public boolean tieneRaiz(Raices raiz) {

        return getDiscriminante(raiz) == 0;

    }

    public void obtenerRaices(Raices raiz) {
        if (tieneRaices(raiz)) {
            double discriminante = getDiscriminante(raiz);
            double x1 = (-raiz.getB() + Math.sqrt(discriminante)) / (2 * raiz.getA());
            double x2 = (-raiz.getB() - Math.sqrt(discriminante)) / (2 * raiz.getA());
            System.out.println("Las raíces son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }

    public void obtenerRaiz(Raices raiz) {
        if (tieneRaiz(raiz)) {
            double discriminante = getDiscriminante(raiz);
            double raizRaiz = -raiz.getB() / (2 * raiz.getA());

            System.out.println("La ecuación tiene una única raíz:");
            System.out.println("x = " + raizRaiz);
        } else {
            System.out.println("La ecuación no tiene una única raíz.");
        }
    }
    
    public void calcular(Raices raiz) {
    if (tieneRaiz(raiz)) {
        obtenerRaiz(raiz);
    } else if (tieneRaices(raiz)) {
        obtenerRaices(raiz);
    } else {
        System.out.println("La ecuación no tiene solución.");
    }
}

}
