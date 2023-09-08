package org.example.ejercicio02.entity;

import lombok.Data;

import java.util.Scanner;


public class Electrodomestico {


	//Atributos
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;


	//Constructor
	public Electrodomestico() {
	}
	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}


	/**
	 * Metodo comprobarConsumoEnergetico()  que comprueba que la letra es correcta,
	 * sino es correcta usara la letra por defecto.
	 * Se invocara al crear el objeto y no sera visible.
	 * @return letra, F por defecto
	 */
	private char comprobarConsumoEnergetico(char letra){

		char letraUpperCase = Character.toUpperCase(letra);// Convierte la letra a mayúsculas

		if (letra >= 'A' && letra <= 'F'){
			return letra;
		} else{
			return 'F';
		}
	}


	//Metodo comprobarColor()
	private String comprobarColor(String color){

		String colorValido = color.toLowerCase(); // Convierte la letra a mayúsculas

		if(colorValido.equals("blanco") || colorValido.equals("negro") ||
			colorValido.equals("rojo")  || colorValido.equals("azul") ||
			colorValido.equals("gris")){
			return colorValido;
		}else{
			return "blanco";
		}
	}


	//Metodo crearElectrodomestico()
	public void crearElectrodomestico(){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Introduce el precio: ");
		this.precio = 1000;

		System.out.println("Introduce el color: ");
		this.color = comprobarColor(scanner.next());

		System.out.println("Introduce el consumo energetico ()");
		this.consumoEnergetico = comprobarConsumoEnergetico(scanner.next().charAt(0));

		System.out.println("Introduce el peso: ");
		this.peso = scanner.nextDouble();
	}



	public double precioFinal(){

		double precioFinal = precio;

		switch (consumoEnergetico){
			case 'A':
				precioFinal += 1000; //Forma corta
				// precioFinal = precioFinal + 1000; forma larga
				break;
			case 'B':
				precioFinal += 800;
				break;
			case 'C':
				precioFinal += 600;
				break;
			case 'D':
				precioFinal += 500;
				break;
			case 'E':
				precioFinal += 300;
				break;
			case 'F':
				precioFinal += 100;
				break;
			default:
				precioFinal += 100;
				break;
		}

		if(peso >= 1 && peso <= 19) {
			precioFinal = precioFinal + 100;
		}else if(peso >= 20 && peso <= 49) {
			precioFinal += 500;
		}else if(peso >= 50 && peso <= 79) {
			precioFinal += 800;
		} else if (peso >= 80){
			precioFinal += 1000;
		}

		return precioFinal;
	}


}
