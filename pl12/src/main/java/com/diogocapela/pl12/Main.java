package com.diogocapela.pl12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        List<Quadro> quadroList = new ArrayList<>();

        Quadro q1 = new Quadro("xsxs", "xxssx", 121);
        Quadro q2 = new Quadro("xsxs", "xxssx", 121);
        Quadro q3 = new Quadro("xsxs", "xxssx", 121);

        quadroList.add(q1);
        quadroList.add(q2);
        quadroList.add(q3);

        Exposicao exposicao = new Exposicao("dsdsa", 2121, quadroList);

        System.out.printf(exposicao.toString());

    }
    
}
