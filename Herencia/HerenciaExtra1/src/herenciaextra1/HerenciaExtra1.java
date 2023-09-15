/*
1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler.
 */
package herenciaextra1;

import herenciaextra1.entidades.Barco;
import herenciaextra1.entidades.BarcoMotor;
import herenciaextra1.entidades.Velero;
import herenciaextra1.entidades.YateDeLujo;
import herenciaextra1.servicios.Alquiler;

public class HerenciaExtra1 {

    public static void main(String[] args) {

        Alquiler alqui = new Alquiler();

        Barco barco = new BarcoMotor();

        barco = barco.crearBarco();
        System.out.println(barco.toString());

        alqui = alqui.crearAlquiler(barco);

        System.out.println(alqui.toString());

        System.out.println("El precio del alquiler es de " + alqui.calcularPrecio());

        System.out.println("\n------------------------");

        Barco velero = new Velero();
        velero = velero.crearBarco();
        System.out.println(velero.toString());

        Alquiler alquiVelero = new Alquiler();
        alquiVelero = alquiVelero.crearAlquiler(velero);
        System.out.println(alquiVelero.toString());
        System.out.println("El precio del alquiler es de " + alquiVelero.calcularPrecio());

        System.out.println("\n------------------------");

        Barco yate = new YateDeLujo();
        yate = yate.crearBarco();
        System.out.println(yate.toString());

        Alquiler alquiYate = new Alquiler();
        alquiYate = alquiYate.crearAlquiler(yate);
        System.out.println(alquiYate.toString());
        System.out.println("El precio del alquiler es de " + alquiYate.calcularPrecio());

    }

}
