package com.diogocapela.pl10;

public class Desempregado extends Contribuinte {

    private double numeroMesesParagem;
    static private double taxaOR = 0.02;

    public Desempregado() {
        super();
    }

    public Desempregado(String nome, String morada, double rendimentoOutros, double numeroMesesParagem) {
        super(nome, morada, 0, rendimentoOutros);
        this.numeroMesesParagem = numeroMesesParagem;
    }

    public double getNumeroMesesParagem() {
        return this.numeroMesesParagem;
    }

    static public double getTaxaOR() {
        return Desempregado.taxaOR;
    }

    public void setNumeroMesesParagem(double numeroMesesParagem) {
        this.numeroMesesParagem = numeroMesesParagem;
    }

    static public void setTaxaOR(double taxaOR) {
        Desempregado.taxaOR = taxaOR;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Número de Meses de Paragem: %f%n", this.numeroMesesParagem);
    }

    @Override
    public double calcularImposto() {
        return getRendimentoOutros() * Desempregado.taxaOR;
    }

}
