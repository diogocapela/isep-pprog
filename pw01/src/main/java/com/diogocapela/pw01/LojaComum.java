package com.diogocapela.pw01;

public abstract class LojaComum extends Loja {

    private int quantidadeFuncionarios;
    static private int contadorLojaComum = 0;

    public LojaComum(double area, int quantidadeFuncionarios) {
        super(area);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        LojaComum.contadorLojaComum++;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public static int getContadorLojaComum() {
        return LojaComum.contadorLojaComum;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public static void setContadorLojaComum(int contadorLojaComum) {
        LojaComum.contadorLojaComum = contadorLojaComum;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Quantidade de Funcionários: %d%n", this.quantidadeFuncionarios);
    }

}
