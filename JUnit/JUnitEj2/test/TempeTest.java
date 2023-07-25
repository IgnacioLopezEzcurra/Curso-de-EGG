
import junitej2.entidades.Temperature;
import junitej2.servicios.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TempeTest {

    public TempeTest() {
    }

    TemperatureConverter tc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tc = new TemperatureConverter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaConvertirCaFah() {
        assertEquals(50, tc.convertirCelciusAFahrenheit(new Temperature(10, 50, 40)), 0);
    }

    @Test
    public void deberiaConvertirCaK() {
        assertEquals(283.15, tc.convertirCaKelvin(new Temperature(10, 50, 40)), 0);
    }
    
    @Test
    public void deberiaConvertirKaC(){
        assertEquals(-233.15, tc.convertirKelvinACelcius(new Temperature(10,50,40)), 0.0000001);
    }
    
    @Test
    public void deberiaConvertirKaF(){
        assertEquals(0, tc.convertirKelvinAFahrenheit(new Temperature(10,50,255.372)), 0.1);
    }
    

}
