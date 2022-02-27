/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diogocapela.pl09;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author echo
 */
public class ComparatorTrabalhadorPorVencimentoTest {

    /**
     * Test of compare method, of class ComparatorTrabalhadorPorVencimento.
     */
    @Test
    public void testCompare() {

        // Arrange - Given
        Trabalhador t1 = new TrabalhadorPeca("Jorge Silva", 20, 30);;
        Trabalhador t2 = new TrabalhadorHora("Carlos Miguel", 160, 6673.5f);;
        int expResult = -1;

        // Act - When
        ComparatorTrabalhadorPorVencimento instance = new ComparatorTrabalhadorPorVencimento();
        int result = instance.compare(t1, t2);

        // Assert - Then
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
    
}
