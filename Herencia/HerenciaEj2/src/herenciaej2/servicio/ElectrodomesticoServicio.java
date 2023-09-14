/*

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000.

 */
package herenciaej2.servicio;

import herenciaej2.entidades.Electrodomestico;
import herenciaej2.entidades.Lavadora;
import herenciaej2.entidades.Televisor;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico() {

        Electrodomestico elec = new Electrodomestico();

        System.out.println("Por favor ingrese el color del electrodomestico:");
        elec.setColor(leer.next());
        System.out.println("Ahora ingrese el tipo de consumo electrico:");
        elec.setConsumoEnergetico(leer.next().charAt(0));

        System.out.println("Comprobando color");
        System.out.println(elec.comprobarColor(elec.getColor()));
        System.out.println("Comprobando consumo energetico");
        System.out.println(elec.comprobarConsumoEnergetico(elec.getConsumoEnergetico()));

        System.out.println("Ingrese el peso en kg del electrodomestico:");
        elec.setPeso(leer.nextDouble());

        System.out.println("Electromestico creado correctamente :)");

        return elec;

    }

//    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente 
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
//visto en la clase Electrodoméstico también deben afectar al precio.
    public Lavadora crearLavadora() {

        Electrodomestico lavadora = crearElectrodomestico();

        Lavadora lav = new Lavadora();

        System.out.println("Ingrese la carga de la lavadora:");
        lav.setCarga(leer.nextDouble());
        lav.setColor(lavadora.getColor());
        lav.setConsumoEnergetico(lavadora.getConsumoEnergetico());
        lav.setPeso(lavadora.getPeso());
        lav.setPrecio(lavadora.getPrecio());

        lav.setElectrodomestico(lavadora);

        return lav;
    }

    /*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.*/
    public Televisor crearTelevisor() {

        Electrodomestico televisor = crearElectrodomestico();

        Televisor tv = new Televisor();

        System.out.println("Ingrese las pulgadas del televisor:");
        tv.setPulgadas(leer.nextDouble());

        System.out.println("¿El televisor tiene TDT?: ");

        String rta = leer.next();

        if (rta.equalsIgnoreCase("si")) {
            System.out.println("Su televisor tiene TDT");
            tv.setTDT(true);
        } else {
            System.out.println("Su televisor NO tiene TDT");
            tv.setTDT(false);
        }

        tv.setColor(televisor.getColor());
        tv.setConsumoEnergetico(televisor.getConsumoEnergetico());
        tv.setPeso(televisor.getPeso());
        tv.setPrecio(televisor.getPrecio());

        tv.setElectrodomestico(televisor);

        return tv;
    }

}
