package com.diogocapela.pw01;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaTest {

    /**
     * Test of classificarArea method, of class Loja.
     * Testing the return of Pequena.
     */
    @Test
    public void testClassificarAreaPequena() {
        // Arrange
        double area = 10;
        int quantidadeFuncionarios = 5;
        double custoManutencao = 40;
        int quantidadeMesas = 10;
        String expResult = "Pequena";
        // Act
        LojaComumRestauracao instance = new LojaComumRestauracao(area, quantidadeFuncionarios, custoManutencao, quantidadeMesas);
        String result = instance.classificarArea();
        // Assert
        assertEquals(expResult, result);
    }

    /**
     * Test of classificarArea method, of class Loja.
     * Testing the return of Media.
     */
    @Test
    public void testClassificarAreaMedia() {
        // Arrange
        double area = 50;
        int quantidadeFuncionarios = 5;
        String expResult = "Média";
        // Act
        LojaComumQuiosque instance = new LojaComumQuiosque(area, quantidadeFuncionarios);
        String result = instance.classificarArea();
        // Assert
        assertEquals(expResult, result);
    }

    /**
     * Test of classificarArea method, of class Loja.
     * Testing the return of Grande.
     */
    @Test
    public void testClassificarAreaGrande() {
        // Arrange
        double area = 200;
        double custoSeguranca = 200;
        String expResult = "Grande";
        // Act
        LojaAncoraPropria instance = new LojaAncoraPropria(area, custoSeguranca);
        String result = instance.classificarArea();
        // Assert
        assertEquals(expResult, result);
    }

}
