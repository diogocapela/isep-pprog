package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public class LojaComumRestauracao extends LojaComum {

    private double custoManutencao;
    private int quantidadeMesas;

    public LojaComumRestauracao(String nome, double area, int quantidadeFuncionarios, double custoManutencao, int quantidadeMesas) {
        super(nome, area, quantidadeFuncionarios);
        this.custoManutencao = custoManutencao;
        this.quantidadeMesas = quantidadeMesas;
    }

    public LojaComumRestauracao(LojaComumRestauracao loja) {
        this(loja.getNome(), loja.getArea(), loja.getQuantidadeFuncionarios(), loja.getCustoManutencao(), loja.getQuantidadeMesas());
    }

    public double getCustoManutencao() {
        return this.custoManutencao;
    }

    public int getQuantidadeMesas() {
        return this.quantidadeMesas;
    }

    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setQuantidadeMesas(int quantidadeMesas) {
        this.quantidadeMesas = quantidadeMesas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Custo de Manutenção: %.2f€%nQuantidade de Mesas: %d%n", this.custoManutencao, this.quantidadeMesas);
    }

    @Override
    public LojaComumRestauracao clone() {
        return new LojaComumRestauracao(this);
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa() * (1 + (this.getArea() / 100));
    }

}
