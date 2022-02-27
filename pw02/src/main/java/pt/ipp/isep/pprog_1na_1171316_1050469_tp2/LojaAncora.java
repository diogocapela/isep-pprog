package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public abstract class LojaAncora extends Loja implements Seguranca {

    private double custoSeguranca;

    public LojaAncora(String nome, double area, double custoSeguranca) {
        super(nome, area);
        this.custoSeguranca = custoSeguranca;
    }
    
    public LojaAncora(LojaAncora loja) {
        this(loja.getNome(), loja.getArea(), loja.getCustoSeguranca());
    }

    public double getCustoSeguranca() {
        return this.custoSeguranca;
    }

    public void setCustoSeguranca(double custoSeguranca) {
        this.custoSeguranca = custoSeguranca;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Custo Segurança: %.2f€%n", this.custoSeguranca);
    }

    @Override
    public double calcularCustoSeguranca() {
        return this.custoSeguranca;
    }
}