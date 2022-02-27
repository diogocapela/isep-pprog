package com.diogocapela.pw01;

public class LojaAncoraExterna extends LojaAncora {

    private int quantidadeFuncionarios;
    private double receitasAnoAnterior;
    static private int contadorLojaAncoraExterna = 0;

    public LojaAncoraExterna(double area, double custoSeguranca, int quantidadeFuncionarios, double receitasAnoAnterior) {
        super(area, custoSeguranca);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.receitasAnoAnterior = receitasAnoAnterior;
        LojaAncoraExterna.contadorLojaAncoraExterna++;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public double getReceitasAnoAnterior() {
        return this.receitasAnoAnterior;
    }

    static public int getContadorLojaAncoraExterna() {
        return LojaAncoraExterna.contadorLojaAncoraExterna;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setReceitasAnoAnterior(double receitasAnoAnterior) {
        this.receitasAnoAnterior = receitasAnoAnterior;
    }

    static public void setContadorLojaAncoraExterna(int contadorLojaAncoraExterna) {
        LojaAncoraExterna.contadorLojaAncoraExterna = contadorLojaAncoraExterna;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Quantidade Funcionários: %d%nReceitas do Ano Anterior: %.2f€%n", this.quantidadeFuncionarios, this.receitasAnoAnterior);
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa() * (1 + (this.getArea() / 100)) + (this.receitasAnoAnterior / 100);
    }

}
