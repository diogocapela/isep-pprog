package com.diogocapela.pl09;

import java.util.Comparator;

public class ComparatorTrabalhadorPorVencimento implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador t1, Trabalhador t2) {
        if(t1.calcularVencimento() > t2.calcularVencimento())
            return 1;
        else if(t1.calcularVencimento() < t2.calcularVencimento())
            return -1;
        return 0;
    }

}
