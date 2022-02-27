package com.diogocapela.pw01;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaAncoraPropriaTest {

    /**
     * Test of calcularRenda method, of class LojaAncoraPropria.
     */
    @Test
    public void testCalcularRenda() {
        // Arrange
        double area = 100;
        double custoSeguranca = 50;
        double expResult = 1000.0;
        // Act
        LojaAncoraPropria instance = new LojaAncoraPropria(area, custoSeguranca);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
