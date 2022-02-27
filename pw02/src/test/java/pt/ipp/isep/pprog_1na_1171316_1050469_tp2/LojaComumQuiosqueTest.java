package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaComumQuiosqueTest {

    @Test
    public void testCalcularRenda() {
        // Arrange
        String nome = "Tabacaria Gomes";
        double area = 100;
        int quantidadeFuncionarios = 50;
        double expResult = 500.0;
        // Act
        LojaComumQuiosque instance = new LojaComumQuiosque(nome, area, quantidadeFuncionarios);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
