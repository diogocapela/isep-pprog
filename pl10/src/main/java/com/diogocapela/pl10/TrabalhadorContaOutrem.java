package com.diogocapela.pl10;

public class TrabalhadorContaOutrem extends Contribuinte {

    private String nomeEmpresa;

    private static double taxaRTMin = 0.01;
    private static double taxaRTMax = 0.02;
    private static double taxaOR = 0.02;

    public TrabalhadorContaOutrem() {
        super();
    }

    public TrabalhadorContaOutrem(String nome, String morada, double rendimentoTrabalho, double rendimentoOutros, String nomeEmpresa) {
        super(nome, morada, rendimentoTrabalho, rendimentoOutros);
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return String.format("%s%nNome Empresa: %s", super.toString(), this.nomeEmpresa);
    }

    @Override
    public double calcularImposto() {
        double taxaRT;
        if(this.getRendimentoTrabalho() <= 30000) {
            taxaRT = taxaRTMin;
        } else {
            taxaRT = taxaRTMax;
        }
        return taxaRT * this.getRendimentoTrabalho() + TrabalhadorContaOutrem.taxaOR * this.getRendimentoOutros();
    }

}
