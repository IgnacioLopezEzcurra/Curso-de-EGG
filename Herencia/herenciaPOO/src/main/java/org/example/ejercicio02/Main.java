package org.example.ejercicio02;

import org.example.ejercicio02.entity.Lavadora;
import org.example.ejercicio02.entity.Televisor;

public class Main {

	public static void main(String[] args) {

		Lavadora lavadora = new Lavadora();
		lavadora.crearLavadora();
		System.out.println("Precio final lavadora: " + lavadora.precioFinal());

		Televisor televisor = new Televisor();
		televisor.crearTelevisor();
		System.out.println("Precio final televisor: " + televisor.precioFinal());
	}

}
