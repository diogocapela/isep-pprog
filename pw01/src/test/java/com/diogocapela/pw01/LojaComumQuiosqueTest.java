package com.diogocapela.pw01;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaComumQuiosqueTest {

    /**
     * Test of calcularRenda method, of class LojaComumQuiosque.
     */
    @Test
    public void testCalcularRenda() {
        // Arrange
        double area = 100;
        int quantidadeFuncionarios = 50;
        double expResult = 500.0;
        // Act
        LojaComumQuiosque instance = new LojaComumQuiosque(area, quantidadeFuncionarios);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
