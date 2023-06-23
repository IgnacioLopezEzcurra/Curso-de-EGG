/*
Cuadrado
Rectángulo
Triangulo
Circulo
Hexágono
Pentágono
Rombo
 */
package Servicios;

import Entidades.Figura;
import static java.lang.Math.PI;
import java.util.Scanner;

public class FiguraServicio {

    Scanner leer = new Scanner(System.in);

    public Double calcArea(Figura fig) {

        switch (fig.getTipo()) {
            case "cuadrado":
                System.out.println("Por favor ingrese el lado del cuadrado: ");
                double lado = leer.nextDouble();
                return lado * lado;

            case "rectangulo":
                System.out.println("Por favor ingrese la base del rectangulo: ");
                double base = leer.nextDouble();
                System.out.println("Por favor ingrese la altura del rectangulo: ");
                double altura = leer.nextDouble();
                return base * altura;

            case "triangulo":
                System.out.println("Por favor ingrese la base del triangulo: ");
                double baseTri = leer.nextDouble();
                System.out.println("Por favor ingrese la altura del triangulo: ");
                double alturaTri = leer.nextDouble();
                return (baseTri * alturaTri) / 2;

            case "circulo":
                System.out.println("Por favor ingrese el radio del circulo: ");
                double radio = leer.nextDouble();
                return PI * (radio * radio);

            case "hexagono":
                System.out.println("Por favor ingrese el lado del hexagono: ");
                double ladoHex = leer.nextDouble();
                System.out.println("Por favor ingrese la apotema del hexagono: ");
                double apoHex = leer.nextDouble();
                return (6 * ladoHex * apoHex) / 2;

            case "pentagono":
                System.out.println("Por favor ingrese el lado del pentagono: ");
                double ladoPen = leer.nextDouble();
                System.out.println("Por favor ingrese la apotema del pentagono: ");
                double apoPen = leer.nextDouble();
                return (5 * ladoPen * apoPen) / 2;

            case "rombo":
                System.out.println("Por favor ingrese la diagonal Mayor del rombo: ");
                double diagMayor = leer.nextDouble();
                System.out.println("Por favor ingrese la diagonal Menor del rombo: ");
                double diagMenor = leer.nextDouble();
                return (diagMayor * diagMenor) / 2;

            default:
                System.out.println("Ingrese una figura valida, no te puedo calcular esto");
                return 0.0;
        }

    }

    public Double calcPerimetro(Figura fig) {

        switch (fig.getTipo()) {
            case "cuadrado":
                System.out.println("Por favor ingrese el lado del cuadrado: ");
                double lado = leer.nextDouble();
                return lado * 4;

            case "rectangulo":
                System.out.println("Por favor ingrese la base del rectangulo: ");
                double base = leer.nextDouble();
                System.out.println("Por favor ingrese la altura del rectangulo: ");
                double altura = leer.nextDouble();
                return (base * 2) + (altura * 2);

            case "triangulo":
                System.out.println("Por favor ingrese la base del triangulo (hacemos de cuenta que es un equilatero): ");
                double baseTri = leer.nextDouble();
                return baseTri * 3;

            case "circulo":
                System.out.println("Por favor ingrese el radio del circulo: ");
                double radio = leer.nextDouble();
                return PI * 2 * radio;

            case "hexagono":
                System.out.println("Por favor ingrese el lado del hexagono: ");
                double ladoHex = leer.nextDouble();
                return 6 * ladoHex;

            case "pentagono":
                System.out.println("Por favor ingrese el lado del pentagono: ");
                double ladoPen = leer.nextDouble();
                return 5 * ladoPen;

            case "rombo":
                System.out.println("Por favor ingrese lado del rombo (con lados iguales): ");
                double diagMayor = leer.nextDouble();
                return diagMayor * 4;

            default:
                System.out.println("Ingrese una figura valida, no te puedo calcular esto");
                return 0.0;
        }

    }

    public void menu() {

        System.out.println("Escoja una figura");
        System.out.println("");
        System.out.println("1- Cuadrado\n"
                + "2- Rectángulo\n"
                + "3- Triangulo\n"
                + "4- Circulo\n"
                + "5- Hexágono\n"
                + "6- Pentágono\n"
                + "7- Rombo\n"
                + "8- SALIR.");

        int eleccion = leer.nextInt();

        switch (eleccion) {
            case 1:
                Figura cuadrado = new Figura("cuadrado");
                System.out.println("El area del cuadrado es: " + calcArea(cuadrado));
                System.out.println("El perimetro del cuadrado es: " + calcPerimetro(cuadrado));
                break;
            case 2:
                Figura rectangulo = new Figura("rectangulo");
                System.out.println("El area del rectangulo es: " + calcArea(rectangulo));
                System.out.println("El perimetro del rectangulo es: " + calcPerimetro(rectangulo));
                break;

            case 3:
                Figura triangulo = new Figura("triangulo");
                System.out.println("El area del triangulo es: " + calcArea(triangulo));
                System.out.println("El perimetro del triangulo es: " + calcPerimetro(triangulo));
                break;

            case 4:
                Figura circulo = new Figura("circulo");
                System.out.println("El area del circulo es: " + calcArea(circulo));
                System.out.println("El perimetro del circulo es: " + calcPerimetro(circulo));
                break;

            case 5:
                Figura hexagono = new Figura("hexagono");
                System.out.println("El area del hexagono es: " + calcArea(hexagono));
                System.out.println("El perimetro del hexagono es: " + calcPerimetro(hexagono));
                break;

            case 6:
                Figura pentagono = new Figura("pentagono");
                System.out.println("El area del pentagono es: " + calcArea(pentagono));
                System.out.println("El perimetro del pentagono es: " + calcPerimetro(pentagono));
                break;

            case 7:
                Figura rombo = new Figura("rombo");
                System.out.println("El area del rombo es: " + calcArea(rombo));
                System.out.println("El perimetro del rombo es: " + calcPerimetro(rombo));
                break;

            case 8:
                System.out.println("Gracias por usar el programa");
                break;

            default:
                System.out.println("No ingreso una opcion valida");
                this.menu();
        }
    }

}
