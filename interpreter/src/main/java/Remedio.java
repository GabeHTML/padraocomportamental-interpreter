public class Remedio {
    private double precoCusto;
    private double precoCompra;

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double calcularPrecoRemedio() {
        return Farmacia.calcularPrecoRemedio(this.precoCusto, this.precoCompra);
    }
}
