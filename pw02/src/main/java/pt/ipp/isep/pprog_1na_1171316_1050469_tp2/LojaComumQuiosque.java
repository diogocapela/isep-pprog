package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public class LojaComumQuiosque extends LojaComum {

    public LojaComumQuiosque(String nome, double area, int quantidadeFuncionarios) {
        super(nome, area, quantidadeFuncionarios);
    }

    public LojaComumQuiosque(LojaComumQuiosque loja) {
        this(loja.getNome(), loja.getArea(), loja.getQuantidadeFuncionarios());
    }

    @Override
    public LojaComumQuiosque clone() {
        return new LojaComumQuiosque(this);
    }

    @Override
    public double calcularRenda() {
        return Loja.getRendaFixa();
    }

}
