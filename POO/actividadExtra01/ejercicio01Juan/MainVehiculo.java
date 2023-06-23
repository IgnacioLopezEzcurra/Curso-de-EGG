package actividadExtra01.ejercicio01;

import actividadExtra01.ejercicio01.entity.Vehiculo;
import actividadExtra01.ejercicio01.services.VehiculoServices;

public class MainVehiculo {

	public static void main(String[] args) {

		VehiculoServices vehiculo = new VehiculoServices();

		Vehiculo auto = new Vehiculo("Fiat", "123", 1976, "automovil");
		Vehiculo moto = new Vehiculo("Honda", "Tornado", 2020, "motocicleta");
		Vehiculo bici = new Vehiculo("STL", "450", 2023, "bicicleta");


		int metrosAuto = vehiculo.moverse(5, auto);
		int metrosMoto = vehiculo.moverse(5, moto);
		int metrosBici = vehiculo.moverse(5, bici);


		metrosAuto = vehiculo.frenar(metrosAuto, auto);
		metrosMoto = vehiculo.frenar(metrosMoto, moto);
		metrosBici = vehiculo.frenar(metrosBici, bici);


		System.out.println("El auto " + auto.getMarca() + " se movio " + metrosAuto + " metros");
		System.out.println("La moto " + moto.getMarca() + " se movio " + metrosMoto + " metros");
		System.out.println("La bici " + bici.getMarca() + " se movio " + metrosBici + " metros");

	}
}
