/*
1. Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).

 */
package junitej1;

import Entidades.Producto;
import Servicios.DiscountCalculator;


public class JUnitEj1 {


    public static void main(String[] args) {
        
        DiscountCalculator dc = new DiscountCalculator();
        Producto p = new Producto(100);
        System.out.println("El valor del producto es " + p.getPrecio());
        p.setPrecio(dc.descontarDiezPorCiento(p));
        System.out.println("Ahora valor del producto es " + p.getPrecio());
        
    }
    
}
