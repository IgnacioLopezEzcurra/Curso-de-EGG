package Servicio;


import Entidades.Electrodomestico;

public class ElectrodomesticoServicio {

    public Electrodomestico crearElectrodomestico(Double peso, char consumoE, String color) {

        return new Electrodomestico(color, consumoE, peso);
    }

}
