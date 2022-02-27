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
public class TrabalhadorComissaoTest {
    
    public TrabalhadorComissaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSalarioBase method, of class TrabalhadorComissao.
     */
    @Test
    public void testGetSalarioBase() {
        System.out.println("getSalarioBase");
        TrabalhadorComissao instance = new TrabalhadorComissao();
        float expResult = 0.0F;
        float result = instance.getSalarioBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendas method, of class TrabalhadorComissao.
     */
    @Test
    public void testGetVendas() {
        System.out.println("getVendas");
        TrabalhadorComissao instance = new TrabalhadorComissao();
        float expResult = 0.0F;
        float result = instance.getVendas();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComissao method, of class TrabalhadorComissao.
     */
    @Test
    public void testGetComissao() {
        System.out.println("getComissao");
        TrabalhadorComissao instance = new TrabalhadorComissao();
        float expResult = 0.0F;
        float result = instance.getComissao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalarioBase method, of class TrabalhadorComissao.
     */
    @Test
    public void testSetSalarioBase() {
        System.out.println("setSalarioBase");
        float salarioBase = 0.0F;
        TrabalhadorComissao instance = new TrabalhadorComissao();
        instance.setSalarioBase(salarioBase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendas method, of class TrabalhadorComissao.
     */
    @Test
    public void testSetVendas() {
        System.out.println("setVendas");
        float vendas = 0.0F;
        TrabalhadorComissao instance = new TrabalhadorComissao();
        instance.setVendas(vendas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComissao method, of class TrabalhadorComissao.
     */
    @Test
    public void testSetComissao() {
        System.out.println("setComissao");
        float comissao = 0.0F;
        TrabalhadorComissao instance = new TrabalhadorComissao();
        instance.setComissao(comissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrabalhadorComissao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TrabalhadorComissao instance = new TrabalhadorComissao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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
