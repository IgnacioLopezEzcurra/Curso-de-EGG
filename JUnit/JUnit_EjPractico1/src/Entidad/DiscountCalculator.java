
package Entidad;

import Servicio.DiscountCalculatorService;

/**
 *
 * @author BrendaCalzada
 */
public class DiscountCalculator {
   private DiscountCalculatorService calculatorService;

    public DiscountCalculator() {
    }
   
   
   
    public DiscountCalculator(DiscountCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // Método para calcular el descuento aplicado a un producto usando el servicio
    public double calculateDiscount(double originalPrice, double discountPercentage) {
        return calculatorService.calculateDiscount(originalPrice, discountPercentage);
    } 
    
}
