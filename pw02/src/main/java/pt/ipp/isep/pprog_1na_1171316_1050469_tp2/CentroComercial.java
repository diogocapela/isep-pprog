package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class CentroComercial {

    private String nome;
    private List<Loja> lojas;

    public CentroComercial(String nome, List<Loja> lojas) {
        this.nome = nome;
        this.lojas = new ArrayList<>();
        for (Loja loja : lojas) {
            this.lojas.add(loja.clone());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Loja> getLojas() {
        List<Loja> copy = new ArrayList<>();
        for (Loja loja : lojas) {
            copy.add(loja.clone());
        }
        return copy;
    }

    public void setLojas(List<Loja> lojas) {
        List<Loja> copy = new ArrayList<>();
        for (Loja loja : lojas) {
            copy.add(loja.clone());
        }
        this.lojas = copy;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%n", this.nome);
    }

    public void adicionarLoja(Loja loja) {
        this.lojas.add(loja.clone());
    }

    public void removerLoja(Loja loja) {
        this.lojas.remove(loja);
    }

    public List<Loja> getLojasSortedByRenda() {
        List<Loja> sortedList = this.getLojas();
        Collections.sort(sortedList, new CompareLojaByRenda());
        return sortedList;
    }

    public List<Loja> getLojasSortedByRendaInverted() {
        List<Loja> sortedList = this.getLojas();
        Collections.sort(sortedList, Collections.reverseOrder(new CompareLojaByRenda()));
        return sortedList;
    }

    public List<Loja> getLojasSortedByTypeThenAlphabet() {
        List<Loja> sortedList = this.getLojas();
        Collections.sort(sortedList, new CompareLojaByTypeThenAlphabet());
        return sortedList;
    }

    public int getQuantidadeLojas() {
        return lojas.size();
    }

    public double calcularTotalRendas() {
        double total = 0;
        for (Loja loja : getLojas()) {
            total = total + loja.calcularRenda();
        }
        return total;
    }

    public double calcularRendasLojasAncora() {
        double rendas = 0;
        for (Loja loja : getLojas()) {
            if (loja instanceof LojaAncora) {
                rendas = rendas + loja.calcularRenda();
            }
        }
        return rendas;
    }

    public double calcularRendasLojasComuns() {
        double rendas = 0;
        for (Loja loja : getLojas()) {
            if (loja instanceof LojaComum) {
                rendas = rendas + loja.calcularRenda();
            }
        }
        return rendas;
    }

    public double calcularCustoSegurancaLojasAncora() {
        double custo = 0;
        for (Loja loja : getLojas()) {
            if (loja instanceof LojaAncora) {
                custo = custo + ((LojaAncora) loja).calcularCustoSeguranca();
            }
        }
        return custo;
    }

    public CentroComercial clone() {
        return new CentroComercial(getNome(), getLojas());
    }

}

class CompareLojaByRenda implements Comparator<Loja> {
    @Override
    public int compare(Loja o1, Loja o2) {
        if (o1.calcularRenda() > o2.calcularRenda())
            return 1;
        if (o1.calcularRenda() < o2.calcularRenda())
            return -1;
        return 0;
    }
}

class CompareLojaByTypeThenAlphabet implements Comparator<Loja> {
    @Override
    public int compare(Loja o1, Loja o2) {
        if (o1.getClass() != o2.getClass()) {
            return o1.getClass().toString().compareTo(o2.getClass().toString());
        }
        return o1.getNome().compareTo(o2.getNome());
    }
}

