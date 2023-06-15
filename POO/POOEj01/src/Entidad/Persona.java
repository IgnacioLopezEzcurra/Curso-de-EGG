package Entidad;

import java.util.Date;

public class Persona {

    //Atributos
    public String nombre;
    public String apellido;
    public int edad;
    public Date fechaNac;

    //Constructor sin parametros
    public Persona() {
    }

    //Constructor con parametros
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Constructor con todos los parametros
    public Persona(String nombre, String apellido, int edad, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNac = fechaNac;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
