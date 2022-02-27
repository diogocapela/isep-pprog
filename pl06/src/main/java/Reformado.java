public class Reformado extends Contribuinte {
    
    private static double taxaRT = 0.01;
    private static double taxaOR = 0.03;
    
    public Reformado() {
        super();
    }
    
    public Reformado(String nome, String morada, double rendimentoTrabalho, double rendimentoOutros) {
        super(nome, morada, rendimentoTrabalho, rendimentoOutros);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public double calcularImposto() {

    }
    
}
