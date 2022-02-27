package com.diogocapela.pw01;

public class Main {

    public static void main(String[] args) {

        Loja[] centroComercial = new Loja[12];

        centroComercial[0] = new LojaAncoraPropria(100, 50);
        centroComercial[1] = new LojaAncoraPropria(200, 75);
        centroComercial[2] = new LojaAncoraPropria(300, 120);
        centroComercial[3] = new LojaAncoraExterna(1300, 200, 15, 120000);
        centroComercial[4] = new LojaAncoraExterna(2000, 240, 23, 111000);
        centroComercial[5] = new LojaComumRestauracao(1400, 5, 80, 40);
        centroComercial[6] = new LojaComumRestauracao(2000, 8, 90, 20);
        centroComercial[7] = new LojaComumRestauracao(900, 12, 240, 15);
        centroComercial[8] = new LojaComumRestauracao(1590, 25, 180, 34);
        centroComercial[9] = new LojaComumQuiosque(50, 3);
        centroComercial[10] = new LojaComumQuiosque(110, 1);
        centroComercial[11] = new LojaComumQuiosque(75, 5);
        LojaAncoraPropria l1 = new LojaAncoraPropria(-100, 200);
        System.out.println(l1);

        double totalRendas = 0;
        double totalRendasLojaAncora = 0;
        double totalRendasLojaComum = 0;

        for(Loja loja: centroComercial) {
            if(loja instanceof LojaAncora) {
                totalRendasLojaAncora += loja.calcularRenda();
            } else {
                totalRendasLojaComum += loja.calcularRenda();
            }
            totalRendas += loja.calcularRenda();
        }

        double percentagemRendasLojaAncora = (totalRendasLojaAncora / totalRendas) * 100;
        double percentagemRendasLojaComum = (totalRendasLojaComum / totalRendas) * 100;

        System.out.printf("Lojas Âncora Próprias/Total: %d/%d%n", LojaAncoraPropria.getContadorLojaAncoraPropria(), LojaAncora.getContadorLojaAncora());
        System.out.printf("Lojas Comuns: %d%n", LojaComum.getContadorLojaComum());
        System.out.printf("Total das Rendas: %.2f€%n", totalRendas);
        System.out.printf("Total das Rendas de Lojas Âncora: %.2f€ (%.0f%%)%n", totalRendasLojaAncora, percentagemRendasLojaAncora);
        System.out.printf("Total das Rendas de Lojas Comuns: %.2f€ (%.0f%%)%n", totalRendasLojaComum, percentagemRendasLojaComum);

    }

}
