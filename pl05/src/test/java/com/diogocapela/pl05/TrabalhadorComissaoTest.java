package com.diogocapela.pl05;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrabalhadorComissaoTest {
    
    /**
     * Test of calcularVencimento method, of class TrabalhadorComissao.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorComissao instance = new TrabalhadorComissao();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
