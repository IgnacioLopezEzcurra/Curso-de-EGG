/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej1.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Virginia
 */
public class PerroServicioTest {
    
    public PerroServicioTest() {
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

    /**
     * Test of cargarListaRazas method, of class PerroServicio.
     */
    @Test
    public void testCargarListaRazas() {
        
        System.out.println("cargarListaRazas");
        PerroServicio instance = new PerroServicio();
        ArrayList<String> razas = new ArrayList();
        razas.add("labrador");
        razas.add("dalmata");
        instance.setRazas(razas);
//        List<String> listaDeRazas = instance.cargarListaRazas();
        List<String> razaEsperada = Arrays.asList("labrador", "dalmata");
        assertEquals(razaEsperada, instance.getRazas());
//        instance.cargarListaRazas();
        
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
