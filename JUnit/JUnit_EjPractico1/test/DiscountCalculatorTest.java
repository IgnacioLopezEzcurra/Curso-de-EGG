/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BrendaCalzada
 */
public class DiscountCalculatorTest {
    private final DiscountCalculatorService calculatorService = new DiscountCalculatorService();
    private final DiscountCalculator discountCalculator = new DiscountCalculator(calculatorService);
    
    public DiscountCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void DescuentoConValorValido() {
        double precioOriginal = 100.0;
        double descuento = 10.0;
        double valorDescuentoEsperado = 10.0;

        double valorDescuentoActual = discountCalculator.calculateDiscount(precioOriginal, descuento);
        assertEquals(valorDescuentoEsperado, valorDescuentoActual, 0);
        
    }

    

    @Test
    public void MaximoDescuento() {
        double precioOriginal = 200.0;
        double descuento = 100.0;
        double valorDescuentoEsperado = 200.0;

        double valorDescuentoActual = discountCalculator.calculateDiscount(precioOriginal, descuento);
        assertEquals(valorDescuentoEsperado, valorDescuentoActual, 0);
    }
    
    @Test
    public void MinimoDescuento(){
        double precioOriginal = 100.0;
        double descuento = 1.00;
        double valorDescuentoEsperado = 1.00;
        
        double valorDescuentoActual = discountCalculator.calculateDiscount(100, descuento);
        assertEquals(valorDescuentoEsperado, valorDescuentoActual, 0);
        
    }
    
    
    
}
