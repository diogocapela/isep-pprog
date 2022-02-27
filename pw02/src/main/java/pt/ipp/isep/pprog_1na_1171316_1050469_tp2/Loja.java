package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public abstract class Loja {

    private String nome;
    private double area;
    static private double rendaFixa = 500;
    static private double limitePequeno = 20;
    static private double limiteGrande = 100;

    public Loja(String nome, double area) {
        this.nome = nome;
        this.area = area;
    }

    public Loja(Loja loja) {
        this(loja.getNome(), loja.getArea());
    }

    public String getNome() {
        return this.nome;
    }

    public double getArea() {
        return this.area;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(double area) {
        this.area = area;
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
        return String.format("Nome: %s%nÁrea: %.2f%n", this.nome, this.area);
    }

    final public String classificarArea() {
        if (this.area < Loja.limitePequeno)
            return "Pequena";
        else if (this.area < Loja.limiteGrande)
            return "Média";
        return "Grande";
    }

    abstract public Loja clone();

    abstract public double calcularRenda();

}