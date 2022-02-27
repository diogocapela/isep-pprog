package com.diogocapela.pw01;

import org.junit.Test;
import static org.junit.Assert.*;


public class LojaComumRestauracaoTest {

    /**
     * Test of calcularRenda method, of class LojaComumRestauracao.
     */
    @Test
    public void testCalcularRenda() {
        // Arrange
        double area = 1400;
        int quantidadeFuncionarios = 5;
        double custoManutencao = 80;
        int quantidadeMesas = 40;
        double expResult = 7500.0;
        // Act
        LojaComumRestauracao instance = new LojaComumRestauracao(area, quantidadeFuncionarios, custoManutencao, quantidadeMesas);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
