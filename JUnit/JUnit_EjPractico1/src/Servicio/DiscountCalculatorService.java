
package Servicio;

/**
 *
 * @author BrendaCalzada
 */
public class DiscountCalculatorService {
    public double calculateDiscount(double originalPrice, double discountPercentage) {
        if (originalPrice <= 0 || discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Los valores ingresados son incorrectos");
        }

        double discountAmount = originalPrice * (discountPercentage / 100.0);
        return discountAmount;
    }
    
}
