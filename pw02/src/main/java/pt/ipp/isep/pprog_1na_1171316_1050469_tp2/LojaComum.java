package pt.ipp.isep.pprog_1na_1171316_1050469_tp2;

public abstract class LojaComum extends Loja {

    private int quantidadeFuncionarios;

    public LojaComum(String nome, double area, int quantidadeFuncionarios) {
        super(nome, area);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public LojaComum(LojaComum loja){
        this(loja.getNome(), loja.getArea(), loja.getQuantidadeFuncionarios());
    }
            

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Quantidade de Funcionários: %d%n", this.quantidadeFuncionarios);
    }

}
