/*
 EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package relacionesmanosalaobra.entidades;


public class Dni {
    
    private String serie;
    private String num;

    public Dni() {
    }

    public Dni(String serie, String num) {
        this.serie = serie;
        this.num = num;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", num=" + num + '}';
    }

    
    
    
    
}
