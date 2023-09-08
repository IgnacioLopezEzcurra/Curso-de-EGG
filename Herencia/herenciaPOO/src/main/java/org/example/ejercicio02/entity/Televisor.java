package org.example.ejercicio02.entity;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

	//Atributos
	private double pulgadas;
	private boolean TDT;

	public Televisor() {
	}

	public Televisor(double precio, String color, char consumoEnergetico, double peso, double pulgadas, boolean TDT) {
		super(precio, color, consumoEnergetico, peso);
		this.pulgadas = pulgadas;
		this.TDT      = TDT;
	}


	//get and set
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public boolean isTDT() {
		return TDT;
	}
	public void setTDT(boolean TDT) {
		this.TDT = TDT;
	}


	//Metodo crearTelevisor()
	public void crearTelevisor(){
		crearElectrodomestico();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce las pulgadas del televisor: ");
		this.pulgadas = scanner.nextDouble();

		System.out.println("Introduce si tiene TDT (true/false): ");
		this.TDT = scanner.nextBoolean();

	}


	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (pulgadas > 40) {
			precioFinal += precioFinal * 0.3;//Incrementa el 30% si tiene mas de 40 pulgadas
		}
		if (this.TDT) {
			precioFinal += 500;//Incrementa $500 si tiene TDT (true)
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Televisor{" +
				 "pulgadas=" + pulgadas +
				 ", TDT=" + TDT +
				 ", precio=" + precio +
				 ", color='" + color + '\'' +
				 ", consumoEnergetico=" + consumoEnergetico +
				 ", peso=" + peso +
				 '}';
	}
}
