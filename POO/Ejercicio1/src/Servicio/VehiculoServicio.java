/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Vehiculo;

/**
 *
 * @author LUCAS-PC
 */
public class VehiculoServicio {
    
    public int moverse(int seg, Vehiculo vehiculo){
        switch (vehiculo.getTipo()) {
            case "automovil":
                return 3*seg;
            case "motocicleta":
                return 2*seg;
            case "bicicleta":
                return seg;
            default:
                System.out.println("No ingresaste un vehiculo valido.");
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
