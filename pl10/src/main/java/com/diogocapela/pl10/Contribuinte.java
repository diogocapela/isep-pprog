package com.diogocapela.pl10;

abstract public class Contribuinte {

    private String nome;
    private String morada;
    private double rendimentoTrabalho;
    private double rendimentoOutros;

    public Contribuinte() {
        this.nome = "SEM NOME";
        this.morada = "SEM MORADA";
        this.rendimentoTrabalho = 0;
        this.rendimentoOutros = 0;
    }

    public Contribuinte(String nome, String morada, double rendimentoTrabalho, double rendimentoOutros) {
        this.nome = nome;
        this.morada = morada;
        this.rendimentoTrabalho = rendimentoTrabalho;
        this.rendimentoOutros = rendimentoOutros;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMorada() {
        return this.morada;
    }

    public double getRendimentoTrabalho() {
        return this.rendimentoTrabalho;
    }

    public double getRendimentoOutros() {
        return this.rendimentoOutros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setRendimentoTrabalho(double rendimentoTrabalho) {
        this.rendimentoTrabalho = rendimentoTrabalho;
    }

    public void setRendimentoOutros(double rendimentoOutros) {
        this.rendimentoOutros = rendimentoOutros;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nMorada: %s%nRendimento Trabalho: %2f%nOutros Rendimentos%2f%n", this.nome, this.morada, this.rendimentoTrabalho, this.rendimentoOutros);
    }

    abstract public double calcularImposto();

}