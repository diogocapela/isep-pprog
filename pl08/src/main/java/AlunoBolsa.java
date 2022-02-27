public class AlunoBolsa extends Aluno implements Pagavel {

    private int valorBolsa;

    public AlunoBolsa() {
        super();
    }

    public AlunoBolsa(int numero, int valorBolsa) {
        super(numero);
        this.valorBolsa = valorBolsa;
    }

    public int getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(int valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double determinarCusto() {
        return this.valorBolsa;
    }

}
