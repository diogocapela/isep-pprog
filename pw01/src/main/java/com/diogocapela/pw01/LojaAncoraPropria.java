package com.diogocapela.pw01;

public class LojaAncoraPropria extends LojaAncora {

    static private int contadorLojaAncoraPropria = 0;

    public LojaAncoraPropria(double area, double custoSeguranca) {
        super(area, custoSeguranca);
        LojaAncoraPropria.contadorLojaAncoraPropria++;
    }

    static public int getContadorLojaAncoraPropria() {
        return LojaAncoraPropria.contadorLojaAncoraPropria;
    }

    static public void setContadorLojaAncoraPropria(int contadorLojaAncoraPropria) {
        LojaAncoraPropria.contadorLojaAncoraPropria = contadorLojaAncoraPropria;
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa() * (1 + (this.getArea() / 100));
    }

}
