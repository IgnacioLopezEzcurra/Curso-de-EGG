/*
1. Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).

 */
package Servicios;

import Entidades.Producto;

public class DiscountCalculator {

    public double descontarDiezPorCiento(Producto p) {

        return p.getPrecio() - (p.getPrecio() * 0.10);
    }

    public double sinDescuento(Producto p) {

        return p.getPrecio();
    }

    public double mitadDePrecio(Producto p) {

        return p.getPrecio() * 0.50;
    }

}
