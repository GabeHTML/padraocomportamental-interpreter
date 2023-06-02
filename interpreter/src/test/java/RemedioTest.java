import org.junit.jupiter.api.Test;

public class RemedioTest {

    private void assertEquals(double v, double calcularPrecoRemedio) {
    }

    @Test
    void deveCalcularPrecoRemedioComFormula() {
        Remedio remedio = new Remedio();
        remedio.setPrecoCusto(6.0);
        remedio.setPrecoCompra(8.0);

        assertEquals(14.0, remedio.calcularPrecoRemedio());
    }


}
