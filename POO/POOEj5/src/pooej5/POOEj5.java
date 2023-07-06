/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooej5;

import java.util.Scanner;

public class POOEj5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        c1.crearObjetoCuenta();
        System.out.println(c1);
        System.out.println("Ahora vamos a ingresar dinero");
        c1.ingresar(leer.nextDouble());
        System.out.println("Imprimimos a ver si cargo");
        System.out.println(c1);
        System.out.println("Ahora retiramos");
        c1.retirar(leer.nextDouble());
        System.out.println(c1);
        System.out.println("Ahora hacemos extraccion rapida (quita 20%)");
        c1.extraccionRapida();
        System.out.println(c1);
        System.out.println("Ahora retiramos mas de lo que hay");
        c1.retirar(leer.nextDouble());
        System.out.println(c1);
        c1.consultarDatos();
        c1.consultarSaldo();
    }

}
