package com.diogocapela.pw01;

public class LojaComumQuiosque extends LojaComum {

    static private int contadorLojaComumQuiosque = 0;

    public LojaComumQuiosque(double area, int quantidadeFuncionarios) {
        super(area, quantidadeFuncionarios);
        LojaComumQuiosque.contadorLojaComumQuiosque++;
    }

    static public int getContadorLojaComumQuiosque() {
        return LojaComumQuiosque.contadorLojaComumQuiosque;
    }

    static public void setContadorLojaComumQuiosque(int contadorLojaComumQuiosque) {
        LojaComumQuiosque.contadorLojaComumQuiosque = contadorLojaComumQuiosque;
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa();
    }

}
