package com.diogocapela.pl10;

public class Reformado extends Contribuinte {

    static private double taxaRT = 0.01;
    static private double taxaOR = 0.03;

    public Reformado() {
        super();
    }

    public Reformado(String nome, String morada, double rendimentoTrabalho, double rendimentoOutros) {
        super(nome, morada, rendimentoTrabalho, rendimentoOutros);
    }

    static public double getTaxaRT() {
        return Reformado.taxaRT;
    }

    static public double getTaxaOR() {
        return Reformado.taxaOR;
    }

    static public void setTaxaRT(double taxaRT) {
        Reformado.taxaRT = taxaRT;
    }

    static public void setTaxaOR(double taxaOR) {
        Reformado.taxaOR = taxaOR;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularImposto() {
        return Reformado.taxaOR * this.getRendimentoOutros() + Reformado.taxaRT * this.getRendimentoTrabalho();
    }

}
