package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LojaAncoraPropriaTest {

    @Test
    public void testCalcularRenda() {
        // Arrange
        String nome = "H&M";
        double area = 100;
        double custoSeguranca = 50;
        double expResult = 1000.0;
        // Act
        LojaAncoraPropria instance = new LojaAncoraPropria(nome, area, custoSeguranca);
        double result = instance.calcularRenda();
        // Assert
        assertEquals(expResult, result, 0.0);
    }
    
}
