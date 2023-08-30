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


public class Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;
    private String domicilio;
    private String telefono;
    private Poliza poliza;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dni, String mail, String domicilio, String telefono, Poliza poliza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.poliza = poliza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + ", poliza=" + poliza + '}';
    }
    
    
    
}
