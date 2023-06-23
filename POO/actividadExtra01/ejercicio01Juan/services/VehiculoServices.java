package actividadExtra01.ejercicio01.services;

import actividadExtra01.ejercicio01.entity.Vehiculo;

public class VehiculoServices {

	public int moverse(int segundos, Vehiculo vehiculo) {
		switch (vehiculo.getTipo()) {
			case "automovil":
				return segundos * 3;
			case "motocicleta":
				return segundos * 2;
			case "bicicleta":
				return segundos * 1;
			default:
				return 0;
		}

	}

	public int frenar (int recorrido, Vehiculo vehiculo){
		if (vehiculo.getTipo().equals("bicicleta")) {
			return recorrido;
		}else{
			return recorrido +2;
		}
	}
}
