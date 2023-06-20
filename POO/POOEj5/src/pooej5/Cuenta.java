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

public class Cuenta {

    private int numeroCuenta;
    private double saldo;
    private long dni;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Cuenta crearObjetoCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Usted esta por crear una nueva cuenta");
        System.out.println("Ingrese su numero de cuenta: ");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su saldo: ");
        this.saldo = leer.nextDouble();
        System.out.println("Ingrese su dni: ");
        this.dni = leer.nextLong();

        return new Cuenta(numeroCuenta, saldo, dni);
    }

    public double ingresar(double ingreso) {
        this.saldo = this.saldo + ingreso;
        return saldo;
    }

    public double retirar(double retiro) {
        if (this.saldo < retiro) {
            this.saldo = 0;
            return saldo;
        } else {
            this.saldo = this.saldo - retiro;
            return saldo;
        }

    }
    
      public double extraccionRapida() {
            this.saldo = this.saldo - (this.saldo*0.2);
            return saldo;  
    }
      
      public double consultarSaldo(){
          System.out.print("Su saldo actual es de: " + this.saldo );    
      return this.saldo;
      }
      
      public void consultarDatos(){
          System.out.println("El numero de cuenta es " + this.numeroCuenta);
          System.out.println("El dni es " + this.dni);
          System.out.println("El saldo es " + this.saldo);
      }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", dni=" + dni + '}';
    }

}
