package com.diogocapela.pl09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabalhadores = new ArrayList<>();
        trabalhadores.add(tc);
        trabalhadores.add(tp);
        trabalhadores.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabalhadores);


        System.out.println("\n### Trabalhadores Crescente ###");

        ComparatorTrabalhadorPorVencimento c = new ComparatorTrabalhadorPorVencimento();

        Collections.sort(trabalhadores, c);
        listar(trabalhadores);


        System.out.println("\n### Trabalhadores Descrescente ###");

        Collections.sort(trabalhadores, Collections.reverseOrder(c));
        listar(trabalhadores);



    }

    private static void listar(List<Trabalhador> trabalhadores) {
        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trabalhador.getNome(),
                        trabalhador.calcularVencimento());
            }
        }
    }

}
