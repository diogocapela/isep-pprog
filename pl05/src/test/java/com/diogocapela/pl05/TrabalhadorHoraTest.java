package com.diogocapela.pl05;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrabalhadorHoraTest {
    /**
     * Test of calcularVencimento method, of class TrabalhadorHora.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorHora instance = new TrabalhadorHora();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
