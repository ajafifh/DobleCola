/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doblecola;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alberto Jafif
 * @author Abraham Attie
 */
public class DobleColaTest {
    
    public DobleColaTest() {
    }

    @Test
    public void testEliminaAlFinal1() {
        System.out.println("eliminaAlFinal");
        DobleCola<Double> instance = new DobleCola(5);
        instance.insertarAlPrincipio(4.0);
        instance.insertarAlPrincipio(3.0);
        instance.insertarAlPrincipio(2.0);
        Object expResult = 4.0;
        Object result = instance.eliminaAlFinal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminaAlFinal2() {
        System.out.println("eliminaAlFinal");
        DobleCola<Double> instance = new DobleCola(5);
        instance.insertarAlPrincipio(4.0);
        instance.insertarAlPrincipio(3.0);
        instance.insertarAlPrincipio(2.0);
        instance.insertar(7.0);
        instance.insertar(8.0);
        instance.insertar(9.0);
        instance.eliminar();
        instance.insertar(10.0);
        Object expResult = 10.0;
        Object result = instance.eliminaAlFinal();
        assertEquals(expResult, result);
    }

    @Test
    public void testConsultaFinal1() {
        System.out.println("consultaFinal");
        DobleCola<String> instance = new DobleCola(4);
        instance.insertar("Hola");
        instance.insertar("Como");
        instance.insertar("Estas");
        instance.insertar("Hoy");
        Object expResult = "Hoy";
        Object result = instance.consultaFinal();
        assertEquals(expResult, result);
    }

    @Test
    public void testConsultaFinal2() {
        System.out.println("consultaFinal");
        DobleCola<String> instance = new DobleCola(4);
        instance.insertar("Hola");
        instance.insertar("Como");
        instance.insertar("Estas");
        instance.insertar("Hoy");
        instance.insertar("Muy");
        instance.insertar("Bien");
        instance.insertar("Y");
        instance.insertar("tu");
        instance.eliminaAlFinal();
        instance.eliminaAlFinal();
        instance.eliminar();
        Object expResult = "Bien";
        Object result = instance.consultaFinal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void consultaPrimero() {
        System.out.println("consultaPrimero");
        DobleCola<String> instance = new DobleCola(4);
        instance.insertar("Hola");
        instance.insertar("Como");
        instance.insertar("Estas");
        instance.insertar("Hoy");
        instance.insertar("Muy");
        instance.insertar("Bien");
        instance.insertar("Y");
        instance.insertar("tu");
        instance.eliminaAlFinal();
        instance.eliminaAlFinal();
        instance.eliminar();
        instance.insertarAlPrincipio("?");
        Object expResult = "?";
        Object result = instance.consultaPrimero();
        assertEquals(expResult, result);
    }
}
