package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public class LojaAncoraPropria extends LojaAncora {

    public LojaAncoraPropria(String nome, double area, double custoSeguranca) {
        super(nome, area, custoSeguranca);
    }

    public LojaAncoraPropria(LojaAncoraPropria loja) {
        this(loja.getNome(), loja.getArea(), loja.getCustoSeguranca());
    }

    @Override
    public LojaAncoraPropria clone() {
        return new LojaAncoraPropria(this);
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa() * (1 + (this.getArea() / 100));
    }

}
