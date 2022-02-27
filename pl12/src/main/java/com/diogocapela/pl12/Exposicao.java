package com.diogocapela.pl12;

import java.util.List;
import java.util.Objects;

public class Exposicao {

    String designacao;
    int anoRealizacao;
    List<Quadro> quadros;


    public Exposicao(String designacao, int anoRealizacao, List<Quadro> quadros) {
        this.designacao = designacao;
        this.anoRealizacao = anoRealizacao;
        this.quadros = quadros;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getAnoRealizacao() {
        return anoRealizacao;
    }

    public void setAnoRealizacao(int anoRealizacao) {
        this.anoRealizacao = anoRealizacao;
    }

    public List<Quadro> getQuadros() {
        return quadros;
    }

    public void setQuadros(List<Quadro> quadros) {
        this.quadros = quadros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exposicao exposicao = (Exposicao) o;
        return anoRealizacao == exposicao.anoRealizacao &&
                Objects.equals(designacao, exposicao.designacao) &&
                Objects.equals(quadros, exposicao.quadros);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Quadro quadro : quadros) {
            sb.append(quadro.toString());
        }
        return String.format("Designação: %s%nAno: %d%nQuadros:%n%s", this.designacao, this.anoRealizacao, sb.toString());
    }
}
