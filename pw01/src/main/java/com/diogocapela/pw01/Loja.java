package com.diogocapela.pw01;

public abstract class Loja {

    private double area;
    static private int contadorLoja = 0;
    static private double rendaFixa = 500;
    static private double limitePequeno = 20;
    static private double limiteGrande = 100;

    public Loja(double area) {
        this.area = area;
        Loja.contadorLoja++;
    }

    public double getArea() {
        return this.area;
    }

    static public int getContadorLoja() {
        return Loja.contadorLoja;
    }

    static public double getRendaFixa() {
        return Loja.rendaFixa;
    }

    static public double getLimitePequeno() {
        return Loja.limitePequeno;
    }

    static public double getLimiteGrande() {
        return Loja.limiteGrande;
    }

    public void setArea(double area) {
        this.area = area;
    }

    static public void setContadorLoja(int contadorLoja) {
        Loja.contadorLoja = contadorLoja;
    }

    static public void setRendaFixa(double rendaFixa) {
        Loja.rendaFixa = rendaFixa;
    }

    static public void setLimitePequeno(double limitePequeno) {
        Loja.limitePequeno = limitePequeno;
    }

    static public void setLimiteGrande(double limiteGrande) {
        Loja.limiteGrande = limiteGrande;
    }

    @Override
    public String toString() {
        return String.format("Área: %.2f%n", this.area);
    }

    final public String classificarArea() {
        if(this.area < Loja.limitePequeno)
            return "Pequena";
        else if(this.area < Loja.limiteGrande)
            return "Média";
        return "Grande";
    }

    abstract public double calcularRenda();

}
