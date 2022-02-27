package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaTest {
    
    @Test
    public void testClassificarAreaPequena() {
        // Arrange
        String nome = "Burger King";
        double area = 10;
        int quantidadeFuncionarios = 5;
        double custoManutencao = 40;
        int quantidadeMesas = 10;
        String expResult = "Pequena";
        // Act
        LojaComumRestauracao instance = new LojaComumRestauracao(nome, area, quantidadeFuncionarios, custoManutencao, quantidadeMesas);
        String result = instance.classificarArea();
        // Assert
        assertEquals(expResult, result);
    }

    @Test
    public void testClassificarAreaMedia() {
        // Arrange
        String nome = "Quiosque do José";
        double area = 50;
        int quantidadeFuncionarios = 5;
        String expResult = "Média";
        // Act
        LojaComumQuiosque instance = new LojaComumQuiosque(nome, area, quantidadeFuncionarios);
        String result = instance.classificarArea();
        // Assert
        assertEquals(expResult, result);
    }

    @Test
    public void testClassificarAreaGrande() {
        // Arrange
        String nome = "ZARA";
        double area = 200;
        double custoSeguranca = 200;
        String expResult = "Grande";
        // Act
        LojaAncoraPropria instance = new LojaAncoraPropria(nome, area, custoSeguranca);
        String result = instance.classificarArea();
        // Assert
        assertEquals(expResult, result);
    }

}
