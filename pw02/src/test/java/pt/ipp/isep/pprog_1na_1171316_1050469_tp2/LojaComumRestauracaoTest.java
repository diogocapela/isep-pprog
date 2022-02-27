package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaComumRestauracaoTest {
    
    @Test
    public void testCalcularRenda() {
        // Arrange
        String nome = "Restaurante do Armindo";
        double area = 1400;
        int quantidadeFuncionarios = 5;
        double custoManutencao = 80;
        int quantidadeMesas = 40;
        double expResult = 7500.0;
        // Act
        LojaComumRestauracao instance = new LojaComumRestauracao(nome, area, quantidadeFuncionarios, custoManutencao, quantidadeMesas);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
