package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaAncoraExternaTest {

    @Test
    public void testCalcularRenda() {
        // Arrange
        String nome ="Worten";
        double area = 1300;
        double custoSeguranca = 200;
        int quantidadeFuncionarios = 15;
        double receitasAnoAnterior = 120000;
        double percentagemDesconto = 0.2;
        double expResult = 6560.0;
        // Act
        LojaAncoraExterna instance = new LojaAncoraExterna(nome, area, custoSeguranca, quantidadeFuncionarios, receitasAnoAnterior, percentagemDesconto);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }

}
