package com.diogocapela.pl12;

public class Quadro {

    String designacao;
    String nomeAutor;
    int anoCriacao;

    public Quadro(String designacao, String nomeAutor, int anoCriacao) {
        this.designacao = designacao;
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("Designação: %s%nAutor: %s%nAno: %d%n", this.designacao, this.nomeAutor, this.anoCriacao);
    }

}
