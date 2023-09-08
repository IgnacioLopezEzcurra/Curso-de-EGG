package org.example.ejercicio01.entity;

import lombok.Data;

@Data
public class Animal {

	// Atributos
	protected String nombre;
	protected String alimento;
	protected int edad;
	protected String raza;


	// Constructores
	public Animal(String nombre, String alimento, int edad, String raza) {
		this.nombre   = nombre;
		this.alimento = alimento;
		this.edad     = edad;
		this.raza     = raza;
	}


	public void alimentarse() {
		System.out.println("El "+ nombre + " se alimenta de: " + alimento);
	}


	public static void main(String[] args) {

		Animal perro1 = new Perro("Firulais", "Croquetas", 5, "Chihuahua");
		perro1.alimentarse();
		System.out.println(perro1.toString());

		Animal gato1  = new Gato("Michi", "Atún", 3, "Persa");
		gato1.alimentarse();
		System.out.println(gato1.toString());

		Animal caballo1 = new Caballo("Pegaso", "Pasto", 10, "Pura Sangre");
		caballo1.alimentarse();
		System.out.println(caballo1.toString());

	}
}
