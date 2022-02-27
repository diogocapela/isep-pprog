public class Desempregado extends Contribuinte {
    
    private double numeroMesesParagem;
    
    private static double taxaOR = 0.02;
    
    public Desempregado() {
        super();
    }
    
    public Desempregado(String nome, String morada, double rendimentoOutros, double numeroMesesParagem) {
        super(nome, morada, 0, rendimentoOutros);
        this.numeroMesesParagem = numeroMesesParagem;
    }
    
    @Override
    public String toString() {
        return String.format("%s%nNúmero de Meses de Paragem: %f", super.toString(), this.numeroMesesParagem);
    }
    
    @Override
    public double calcularImposto() {
        return getRendimentoOutros() * taxaOR;
    }
    
}
