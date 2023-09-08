package Servicio;

import Entidades.Televisor;

public class TelevisorServicio {

    public Televisor crearTelevisor(Double peso, char consumoE, String color, Double resolucion, boolean sintonizador) {

        return new Televisor(color, consumoE, peso, resolucion, sintonizador);
    }

}
