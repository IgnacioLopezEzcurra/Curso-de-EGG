/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author maria
 */

public class Ahorcado {
    public String[] palabraSecreta;
    public int cantidadLetras;
    public int cantidadIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraSecreta, int cantidadLetras, int cantidadIntentos) {
        this.palabraSecreta = palabraSecreta;
        this.cantidadLetras = cantidadLetras;
        this.cantidadIntentos = cantidadIntentos;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }
    
    
}