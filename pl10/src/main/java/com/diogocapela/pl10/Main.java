package com.diogocapela.pl10;

import java.util.List;
import java.util.ArrayList;

public class Main {

    static public void main(String[] args) {

        List<Contribuinte> contribuintes = new ArrayList<Contribuinte>();

        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230,1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));



    }

}
