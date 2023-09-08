package org.example.ejercicio00;

public class Main implements Pepito{


	@Override
	public void saludo() {
		System.out.println("Hola mundo");
	}


	@Override
	public int sumar() {
		int a = 2;
		int b = 6;
		int suma = a + b;
		return suma;
	}

	@Override
	public int resta(){
		return 0;
	};

	@Override
	public void multiplicar(){};




	public static void main(String[] args) {

		System.out.println("-------------- Mein 1---------------");

		Main main = new Main();

		main.saludo();

		int resultado1 = main.sumar();
		System.out.println("El resultado de la suma es: " + resultado1);



		System.out.println("--------------Main 2---------------");

		Main2 main2 = new Main2();

		main2.saludo();

		int resultado2 = main.resta();
		System.out.println("El resultado de la resta es: " + resultado2);

		int resultado3 = main2.sumar();
		System.out.println("El resultado de la suma es: " + resultado3);

	}

}
