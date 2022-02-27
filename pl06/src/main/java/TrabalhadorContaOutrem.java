public class TrabalhadorContaOutrem extends Contribuinte {
    
    private String nomeEmpresa;
    
    private static double taxaRTMin = 0.01;
    private static double taxaRTMax = 0.02;
    private static double taxaOR = 0.02;
    
    public TrabalhadorContaOutrem() {
        super();
    }
    
    public TrabalhadorContaOutrem(String nome, String morada, double rendimentoOutros, String nomeEmpresa) {
        super(nome, morada, 0, rendimentoOutros);
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Override
    public String toString() {
        return String.format("%s%nNome Empresa: %s", super.toString(), this.nomeEmpresa);
    }
    
    @Override
    public double calcularImposto() {

    }
   
}
