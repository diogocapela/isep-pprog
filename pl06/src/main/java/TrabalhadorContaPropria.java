public class TrabalhadorContaPropria extends Contribuinte {
    
    private String profissao;
   
    private static double taxaRT = 0.03;
    private static double taxaORMin = 0.02;
    private static double taxaORMax = 0.05;
    
    public TrabalhadorContaPropria() {
        super();
    }
    
    public TrabalhadorContaPropria(String nome, String morada, double rendimentoTrabalho, double rendimentoOutros, String profissao) {
        super(nome, morada, rendimentoTrabalho, rendimentoOutros);
        this.profissao = profissao;
    }
    
    @Override
    public String toString() {
        return String.format("%s%nProfissão: %s", super.toString(), this.profissao);
    }
    
    @Override
    public double calcularImposto() {

    }
    
}
