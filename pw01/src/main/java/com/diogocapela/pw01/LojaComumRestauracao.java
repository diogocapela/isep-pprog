package com.diogocapela.pw01;

public class LojaComumRestauracao extends LojaComum {

    private double custoManutencao;
    private int quantidadeMesas;
    static private int contadorLojaComumRestauracao = 0;

    public LojaComumRestauracao(double area, int quantidadeFuncionarios, double custoManutencao, int quantidadeMesas) {
        super(area, quantidadeFuncionarios);
        this.custoManutencao = custoManutencao;
        this.quantidadeMesas = quantidadeMesas;
        LojaComumRestauracao.contadorLojaComumRestauracao++;
    }

    public double getCustoManutencao() {
        return this.custoManutencao;
    }

    public int getQuantidadeMesas() {
        return this.quantidadeMesas;
    }

    static public int getContadorLojaComumRestauracao() {
        return LojaComumRestauracao.contadorLojaComumRestauracao;
    }

    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setQuantidadeMesas(int quantidadeMesas) {
        this.quantidadeMesas = quantidadeMesas;
    }

    static public void setContadorLojaComumRestauracao(int contadorLojaComumRestauracao) {
        LojaComumRestauracao.contadorLojaComumRestauracao = contadorLojaComumRestauracao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Custo de Manutenção: %.2f€%nQuantidade de Mesas: %d%n", this.custoManutencao, this.quantidadeMesas);
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa() * (1 + (this.getArea() / 100));
    }

}
