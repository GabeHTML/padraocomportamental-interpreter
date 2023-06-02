import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class InterpretadorPrecoTest {

    @Test
    void deveCalcularDesconto() {
        InterpretadorPreco interpretador = new InterpretadorPrecoRemedio("7 - 1");
        assertEquals(6.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularReajuste() {
        InterpretadorPreco interpretador = new InterpretadorPrecoRemedio("8 + 2");
        assertEquals(10.0, interpretador.interpretar());
    }
    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorPreco interpretador = new InterpretadorPrecoRemedio("4 ^ 2");
            assertEquals(16.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Remédio com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorPreco interpretador = new InterpretadorPrecoRemedio("5 - ");
            assertEquals(1.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Remédio inválido", e.getMessage());
        }
    }

}
