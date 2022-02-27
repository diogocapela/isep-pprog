package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Loja> lojas = new ArrayList<Loja>();

        lojas.add(new LojaAncoraPropria("ZARA", 100, 50));
        lojas.add(new LojaAncoraPropria("Worten", 200, 75));
        lojas.add(new LojaAncoraPropria("FNAC", 300, 120));
        lojas.add(new LojaAncoraExterna("Springfield", 1300, 200, 15, 120000, 0.2));
        lojas.add(new LojaAncoraExterna("H&M", 2000, 240, 23, 111000, 0.3));
        lojas.add(new LojaComumRestauracao("Pizza Hut", 1400, 5, 80, 40));
        lojas.add(new LojaComumRestauracao("McDonald's", 2000, 8, 90, 20));
        lojas.add(new LojaComumRestauracao("Burger King", 900, 12, 240, 15));
        lojas.add(new LojaComumRestauracao("Vegan Food", 1590, 25, 180, 34));
        lojas.add(new LojaComumQuiosque("Tabacaria do Manuel", 50, 3));
        lojas.add(new LojaComumQuiosque("Cromos Panini", 110, 1));
        lojas.add(new LojaComumQuiosque("A Revista", 75, 5));

        CentroComercial centroComercial = new CentroComercial("Norte Shopping", lojas);

        System.out.println("\n\nNome do centro comercial:");
        System.out.println(centroComercial.getNome());

        System.out.println("\n\nQuantidade de lojas do centro comercial:");
        System.out.println(centroComercial.getLojas().size());

        System.out.println("\n\nTotal de receitas (rendas + segurança) do centro comercial:");
        System.out.println(String.format("%.2f€ (%.2f€ + %.2f€)", centroComercial.calcularTotalRendas() + centroComercial.calcularCustoSegurancaLojasAncora(), centroComercial.calcularTotalRendas(), centroComercial.calcularCustoSegurancaLojasAncora()));

        System.out.println("\n\nValor das rendas a pagar pela totalidade das lojas (e percentagem relativa ao total de receitas):");
        System.out.println(String.format("Lojas Comuns: %.2f€ (%.2f%%)", centroComercial.calcularRendasLojasComuns(), (centroComercial.calcularRendasLojasComuns() / centroComercial.calcularTotalRendas()) * 100));
        System.out.println(String.format("Lojas Âncora: %.2f€ (%.2f%%)", centroComercial.calcularRendasLojasAncora(), (centroComercial.calcularRendasLojasAncora() / centroComercial.calcularTotalRendas()) * 100));

        System.out.println("\n\nCusto de segurança a pagar pela totalidade das lojas âncora (e percentagem relativa ao total de receitas):");
        System.out.println(String.format("%.2f€ (%.2f%%)", centroComercial.calcularCustoSegurancaLojasAncora(), (centroComercial.calcularCustoSegurancaLojasAncora() / centroComercial.calcularRendasLojasAncora()) * 100));

        System.out.println("\n\nListagem das lojas por ordem crescente de renda:");
        lojas = centroComercial.getLojasSortedByRenda();
        for (Loja loja : lojas) {
            System.out.println(String.format("%s - %.2f€", loja.getNome(), loja.calcularRenda()));
        }

        System.out.println("\n\nListagem das lojas por ordem decrescente de renda:");
        lojas = centroComercial.getLojasSortedByRendaInverted();
        for (Loja loja : lojas) {
            System.out.println(String.format("%s - %.2f€", loja.getNome(), loja.calcularRenda()));
        }

        System.out.println("\n\nListagem das lojas por ordem alfabética de tipos, e dentro destes por ordem alfabética de nomes:");
        lojas = centroComercial.getLojasSortedByTypeThenAlphabet();
        for (Loja loja : lojas) {
            System.out.println(String.format("%s - %s - %.2f€", loja.getClass().toString().substring(loja.getClass().toString().lastIndexOf(".") + 1), loja.getNome(), loja.calcularRenda()));
        }

    }

}

