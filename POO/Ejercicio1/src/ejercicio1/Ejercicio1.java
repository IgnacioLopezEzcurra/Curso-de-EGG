/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidad.Vehiculo;
import Servicio.VehiculoServicio;

/**
 *
 * @author LUCAS-PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     VehiculoServicio vs = new VehiculoServicio();
     Vehiculo auto = new Vehiculo("Fiat","128","automovil",1976);
     Vehiculo moto = new Vehiculo("Honda","tornado","motocicleta",2020);
     Vehiculo bici = new Vehiculo("STL","450","bicicleta",2023);
     
     int metrosAuto = vs.moverse(5, auto);
     int metrosMoto = vs.moverse(5, moto);
     int metrosBici = vs.moverse(5, bici);
     
     System.out.println("Distancia recorrida por auto; "+metrosAuto);
     System.out.println("Distancia recorrida por moto; "+metrosMoto);
     System.out.println("Distancia recorrida por bici; "+metrosBici);
     
     metrosAuto = vs.frenar(3, auto);
     metrosMoto = vs.frenar(metrosMoto, moto);
     metrosBici = vs.frenar(3, bici);
     
     System.out.println("Distancia recorrida por auto; "+metrosAuto);
     System.out.println("Distancia recorrida por moto; "+metrosMoto);
     System.out.println("Distancia recorrida por bici; "+metrosBici);
     
        
    }
    
}
