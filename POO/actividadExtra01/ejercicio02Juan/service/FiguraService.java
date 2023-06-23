package actividadExtra01.ejercicio02.service;

import actividadExtra01.ejercicio02.entity.Figura;

import java.util.Scanner;

import static java.lang.Math.PI;

public class FiguraService {

	Scanner leer = new Scanner(System.in);

	public Double calcularArea(Figura fig) {

		double area = 0;

		switch (fig.getTipo()) {
			case "cuadrado":
				System.out.println("Ingrese el lado del cuadrado: ");
				double lado = leer.nextDouble();
				return lado * lado;
			case "rectangulo":
				System.out.println("Por favor ingrese la base por la altura: ");
				double altura = leer.nextDouble();
				System.out.println("Por favor ingrese la altura del rectangulo: ");
				double base = leer.nextDouble();
				return base * altura;
			case "triangulo":
				System.out.println("Por favor ingresela base del triangulo: ");
				double baseTri = leer.nextDouble();
				System.out.println("Por favor ingrese la altura del triangulo: ");
				double alturaTri = leer.nextDouble();
				return (baseTri * alturaTri) / 2;
			case "circulo":
				System.out.println("Por favor ingrese el radio del circulo: ");
				double radio = leer.nextDouble();
				return PI * Math.pow(radio, 2);
			case "hexagono":
				System.out.println("Por favor ingrese el lado del hexagono: ");
				double ladoHex = leer.nextDouble();
				System.out.println("Por favor ingrese el apotema del hexagono: ");
				double apotema = leer.nextDouble();
				return (6 * ladoHex * apotema) / 2;
			case "pentagono":
				System.out.println("Por favor ingrese el lado del pentagono: ");
				double ladoPent = leer.nextDouble();
				System.out.println("Por favor ingrese el apotema del pentagono: ");
				double apoTen = leer.nextDouble();
				return (5 * ladoPent * apoTen) / 2;
			case "rombo":
				System.out.println("Por favor ingrese el lado del rombo: ");
				double diagMayor = leer.nextDouble();
				System.out.println("Por favor ingrese el apotema del rombo: ");
				double diagMenor = leer.nextDouble();
				return (diagMayor * diagMenor) / 2;
			default:
				System.out.println("No existe ese tipo de figura");
				return 0.0;

		}
	}


	public Double calcularPerimetro(Figura fig) {

		double area = 0;

		switch (fig.getTipo()) {
			case "cuadrado":
				System.out.println("Ingrese el lado del cuadrado: ");
				double lado = leer.nextDouble();
				return lado * 4;
			case "rectangulo":
				System.out.println("Por favor ingrese la base por la altura: ");
				double altura = leer.nextDouble();
				System.out.println("Por favor ingrese la altura del rectangulo: ");
				double base = leer.nextDouble();
				return base *  2 + altura * 2;
			case "triangulo":
				System.out.println("Por favor ingresela base del triangulo: ");
				double baseTri = leer.nextDouble();
				System.out.println("Por favor ingrese la altura del triangulo: ");
				double alturaTri = leer.nextDouble();
				return baseTri  * 3;
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
				double ladoPent = leer.nextDouble();
				return 5 * ladoPent;
			case "rombo":
				System.out.println("Por favor ingrese el lado del rombo (con lados iguales): ");
				double diagMayor = leer.nextDouble();
				return 4 * diagMayor;
			default:
				System.out.println("No existe ese tipo de figura");
				return 0.0;

		}
	}


	public void menu(){

		System.out.println("Ingrese el tipo de figura: ");

		System.out.println("1. Cuadrado"
								+ "\n2. Rectangulo"
								+ "\n3. Triangulo"
								+ "\n4. Circulo"
								+ "\n5. Hexagono"
								+ "\n6. Pentagono"
								+ "\n7. Rombo"
								+ "\n8. Salir");

		int eleccion = leer.nextInt();

		switch(eleccion){
			case 1:
				Figura cuadrado = new Figura("cuadrado");
				System.out.println("El area del cuadrado es: " + calcularArea(cuadrado));
				System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(cuadrado));
				break;
			case 2:
				Figura rectangulo = new Figura("rectangulo");
				System.out.println("El area del rectangulo es: " + calcularArea(rectangulo));
				System.out.println("El perimetro del rectangulo es: " + calcularPerimetro(rectangulo));
				break;
			case 3:
				Figura triangulo = new Figura("triangulo");
				System.out.println("El area del triangulo es: " + calcularArea(triangulo));
				System.out.println("El perimetro del triangulo es: " + calcularPerimetro(triangulo));
				break;
			case 4:
				Figura circulo = new Figura("circulo");
				System.out.println("El area del circulo es: " + calcularArea(circulo));
				System.out.println("El perimetro del circulo es: " + calcularPerimetro(circulo));
				break;
			case 5:
				Figura hexagono = new Figura("hexagono");
				System.out.println("El area del hexagono es: " + calcularArea(hexagono));
				System.out.println("El perimetro del hexagono es: " + calcularPerimetro(hexagono));
				break;
			case 6:
				Figura pentagono = new Figura("pentagono");
				System.out.println("El area del pentagono es: " + calcularArea(pentagono));
				System.out.println("El perimetro del pentagono es: " + calcularPerimetro(pentagono));
				break;
			case 7:
				Figura rombo = new Figura("rombo");
				System.out.println("El area del rombo es: " + calcularArea(rombo));
				System.out.println("El perimetro del rombo es: " + calcularPerimetro(rombo));
				break;
			case 8:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("No existe esa opcion");
				this.menu();
		}
	}

}
