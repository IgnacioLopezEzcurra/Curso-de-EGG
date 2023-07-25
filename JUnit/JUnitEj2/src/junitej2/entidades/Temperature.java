/*
2. Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
 */
package junitej2.entidades;


public class Temperature {
    
    private double tempCelsius, tempFahrenheit, tempKelvin;

    public Temperature() {
    }

    public Temperature(double tempCelsius, double tempFahrenheit, double tempKelvin) {
        this.tempCelsius = tempCelsius;
        this.tempFahrenheit = tempFahrenheit;
        this.tempKelvin = tempKelvin;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    public void setTempFahrenheit(double tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public double getTempKelvin() {
        return tempKelvin;
    }

    public void setTempKelvin(double tempKelvin) {
        this.tempKelvin = tempKelvin;
    }
    
    
    
}
