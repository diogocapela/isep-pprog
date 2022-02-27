package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public class LojaAncoraExterna extends LojaAncora {

    private int quantidadeFuncionarios;
    private double receitasAnoAnterior;
    private double percentagemDesconto;

    public LojaAncoraExterna(String nome, double area, double custoSeguranca, int quantidadeFuncionarios, double receitasAnoAnterior, double percentagemDesconto) {
        super(nome, area, custoSeguranca);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.receitasAnoAnterior = receitasAnoAnterior;
        this.percentagemDesconto = percentagemDesconto;
    }

    public LojaAncoraExterna(LojaAncoraExterna loja) {
        this(loja.getNome(), loja.getArea(), loja.getCustoSeguranca(), loja.getQuantidadeFuncionarios(), loja.getReceitasAnoAnterior(), loja.getPercentagemDesconto());
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public double getReceitasAnoAnterior() {
        return this.receitasAnoAnterior;
    }

    public double getPercentagemDesconto() {
        return this.percentagemDesconto;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setReceitasAnoAnterior(double receitasAnoAnterior) {
        this.receitasAnoAnterior = receitasAnoAnterior;
    }

    public void setPercentagemDesconto(double percentagemDesconto) {
        this.percentagemDesconto = percentagemDesconto;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Quantidade Funcionários: %d%nReceitas do Ano Anterior: %.2f€%n", this.quantidadeFuncionarios, this.receitasAnoAnterior);
    }

    @Override
    public LojaAncoraExterna clone() {
        return new LojaAncoraExterna(this);
    }

    @Override
    public double calcularRenda() {
        return (Loja.getRendaFixa() * (1 + (this.getArea() / 100)) + (this.receitasAnoAnterior / 100)) * (1 - this.getPercentagemDesconto());
    }

}