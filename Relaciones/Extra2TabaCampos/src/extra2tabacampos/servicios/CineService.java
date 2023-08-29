/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2tabacampos.servicios;

import extra2tabacampos.entidades.Cine;
import extra2tabacampos.entidades.Espectador;
import extra2tabacampos.entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CineService {
	private static final Random random = new Random();

	public static void simularCine() {
		// Crear una pelÃ­cula
		Pelicula pelicula = new Pelicula("Aventura Espacial", 120, 12, "Cristian Emanuel Campos Fuentes");
		System.out.println("La pelicula estÃ¡ a punto de comenzar. Ordenando espectadores.");
		System.out.println(pelicula);

		// Crear un cine con la pelÃ­cula, sala de asientos y precio de entrada
		Cine cine = new Cine(pelicula, 8, 6, 10.0);

		// Generar una lista de espectadores
		List<Espectador> espectadores = generarEspectadores(40);

		// Simular el cine y asignar los espectadores a los asientos
		for (Espectador espectador : espectadores) {
			boolean ubicado = ubicarEspectadorEnSala(cine, espectador);
			if (!ubicado) {
				System.out.println("El espectador " + espectador.getNombre() + " no pudo ser ubicado.");
			}
		}

		cine.mostrarTablaAsientos();
	}

	private static List<Espectador> generarEspectadores(int cantidad) {
		List<Espectador> espectadores = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			String nombre = "Espectador " + (i + 1);
			int edad = 6 + (int) (Math.random() * 50);  // Edad entre 6 y 55 aÃ±os
			double dineroDisponible = 10 + Math.random() * 30;  // Dinero entre 10 y 40 unidades
			espectadores.add(new Espectador(nombre, edad, dineroDisponible));
		}
		return espectadores;
	}

	private static boolean ubicarEspectadorEnSala(Cine salaCine, Espectador espectador) {
		while (true) {
			int fila = random.nextInt(salaCine.getSalaAsientos().length);
			int columna = random.nextInt(salaCine.getSalaAsientos()[0].length);

			if (!salaCine.asientoOcupado(fila, columna)) {
				return salaCine.ubicarEspectador(espectador, fila, columna);
			}
		}
	}
}