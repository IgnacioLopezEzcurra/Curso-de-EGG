package Servicio;

import Entidades.Lavadora;

public class LavadoraServicio {

    public Lavadora crearLavadora(Double peso, char consumoE, String color, Double carga) {

        return new Lavadora(color, consumoE, peso, carga);
    }


}
