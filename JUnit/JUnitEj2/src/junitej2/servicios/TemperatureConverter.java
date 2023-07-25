package junitej2.servicios;

import junitej2.entidades.Temperature;

public class TemperatureConverter {

    public double convertirCelciusAFahrenheit(Temperature t) {

        return (t.getTempCelsius() * 9 / 5) + 32;
    }

    public double convertirCaKelvin(Temperature t) {
        return (t.getTempCelsius() + 273.15);
    }

    public double convertirKelvinACelcius(Temperature t) {
        return (t.getTempKelvin() - (273.15));
    }

    public double convertirKelvinAFahrenheit(Temperature t) {
        return (t.getTempKelvin() - 273.15) * 9/5 + 32;
    }

}
