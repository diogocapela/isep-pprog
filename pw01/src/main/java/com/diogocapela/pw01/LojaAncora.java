package com.diogocapela.pw01;

public abstract class LojaAncora extends Loja {

    private double custoSeguranca;
    static private int contadorLojaAncora = 0;

    public LojaAncora(double area, double custoSeguranca) {
        super(area);
        this.custoSeguranca = custoSeguranca;
        LojaAncora.contadorLojaAncora++;
    }

    public double getCustoSeguranca() {
        return this.custoSeguranca;
    }

    static public int getContadorLojaAncora() {
        return LojaAncora.contadorLojaAncora;
    }

    public void setCustoSeguranca(double custoSeguranca) {
        this.custoSeguranca = custoSeguranca;
    }

    static public void setContadorLojaAncora(int contadorLojaAncora) {
        LojaAncora.contadorLojaAncora = contadorLojaAncora;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Custo Segurança: %.2f€%n", this.custoSeguranca);
    }

}
