package com.diogocapela.pw01;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaAncoraExternaTest {

    /**
     * Test of calcularRenda method, of class LojaAncoraExterna.
     */
    @Test
    public void testCalcularRenda() {
        // Arrange
        double area = 1300;
        double custoSeguranca = 200;
        int quantidadeFuncionarios = 15;
        double receitasAnoAnterior = 120000;
        double expResult = 8200.0;
        // Act
        LojaAncoraExterna instance = new LojaAncoraExterna(area, custoSeguranca, quantidadeFuncionarios, receitasAnoAnterior);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
