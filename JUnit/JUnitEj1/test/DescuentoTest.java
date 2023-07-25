
import Entidades.Producto;
import Servicios.DiscountCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DescuentoTest {

    public DescuentoTest() {
    }

    DiscountCalculator dc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dc = new DiscountCalculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaInicializarConColor() {
        assertNotNull(new Producto(100.54).getColor());
    }

    @Test
    public void deberiaHacerDiezDeDescuento() {
        Producto p = new Producto(100);
        assertEquals(90, dc.descontarDiezPorCiento(p), 0);
    }
    
    @Test
    public void deberiaDescontarMitad(){
    
         assertEquals(50, dc.mitadDePrecio(new Producto(100)), 0);
    }

}
