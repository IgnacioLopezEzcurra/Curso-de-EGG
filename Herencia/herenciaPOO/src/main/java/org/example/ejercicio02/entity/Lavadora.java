package org.example.ejercicio02.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {


	//Atributo
	private double carga;


	public Lavadora(){
	}
	public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
	}


	//Aqui tenemos nuestros get y set
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}


	//Aqui creamos el metodo crearLavadora()
	public void crearLavadora(){

		crearElectrodomestico(); //Este metodo biene de la clase padre Electrodomestico

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce la carga de la lavadora: ");
		this.carga = scanner.nextDouble();

	}


	/**
	 * Metodo precioFinal()  que sera heredado y se le sumara la siguiente funcionalidad.
	 * Si tiene una carga mayor de 30 kg, aumentara el precio en $50,
	 * sino es asi no se incrementara el precio.
	 * @return precioFinal.
	 * @Override para sobreescribir el metodo de la clase padre.
	 */
	@Override
	public double precioFinal(){
		double precioFinal = super.precioFinal();
		if (this.carga > 30){
			precioFinal += 500;
		}
		return precioFinal;
	}



	@Override
	public String toString() {
		return "Lavadora{" +
				 "carga=" + carga +
				 ", precio=" + precio +
				 ", color='" + color + '\'' +
				 ", consumoEnergetico=" + consumoEnergetico +
				 ", peso=" + peso +
				 '}';
	}
}
