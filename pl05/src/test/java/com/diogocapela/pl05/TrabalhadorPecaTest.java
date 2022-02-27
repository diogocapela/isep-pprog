package com.diogocapela.pl05;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrabalhadorPecaTest {

    /**
     * Test of calcularVencimento method, of class TrabalhadorPeca.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorPeca instance = new TrabalhadorPeca("Diogo", 53, 62);
        float expResult = 933.5f;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
    }

}
