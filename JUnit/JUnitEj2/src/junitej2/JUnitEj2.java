//2. Conversión de Temperatura:
//Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
//(por ejemplo, Celsius, Fahrenheit, Kelvin).
//Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
//se realiza correctamente y produce los resultados esperados.
package junitej2;

import junitej2.entidades.Temperature;
import junitej2.servicios.TemperatureConverter;

public class JUnitEj2 {
    
    public static void main(String[] args) {
        
        TemperatureConverter tc = new TemperatureConverter();
        
        Temperature t = new Temperature(10, 50, 255.372);
        System.out.println("Los " + t.getTempCelsius() + " grados C convertidos a F son " + tc.convertirCelciusAFahrenheit(t));
        System.out.println("Los " + t.getTempCelsius() + " grados C convertidos a K son " + tc.convertirCaKelvin(t));
        System.out.println("Los " + t.getTempKelvin() + " grados K convertidos a C son " + tc.convertirKelvinACelcius(t));
        System.out.println("Los " + t.getTempKelvin() + " grados K convertidos a F son " + tc.convertirKelvinAFahrenheit(t));
    }
    
}
