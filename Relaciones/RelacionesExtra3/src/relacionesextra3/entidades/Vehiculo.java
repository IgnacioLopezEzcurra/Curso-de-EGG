/*
3. Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema 
que quiere realizar la empresa. 

a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de 
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail, 
domicilio, teléfono. 
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca, 
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.). 
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un 
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de 
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra 
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las 
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de 
muchos a uno o de muchos a muchos. 
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza. 
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la 
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia, 
etc.). 
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los 
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes 
relaciones.
 */
package relacionesextra3.entidades;


class Vehiculo {
    
    private String marca;
    private String modelo;
    private String anio;
    private String num_motor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String anio, String num_motor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.num_motor = num_motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(String num_motor) {
        this.num_motor = num_motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", num_motor=" + num_motor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
}
