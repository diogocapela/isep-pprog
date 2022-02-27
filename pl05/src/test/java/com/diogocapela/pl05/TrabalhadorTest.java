package com.diogocapela.pl05;

import static org.junit.Assert.*;

public class TrabalhadorTest {

    /**
     * Test of calcularVencimento method, of class Trabalhador.
     */
    @org.junit.Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        // TODO: Adicionar todos os tipos de trabalhadores.
        Trabalhador instance = new TrabalhadorPeca();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
