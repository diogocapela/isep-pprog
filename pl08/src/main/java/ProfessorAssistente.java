public class ProfessorAssistente extends Professor {

    static private double modificador = 1;

    public ProfessorAssistente() {
        super();
    }

    public ProfessorAssistente(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nVencimento:%n%s", this.getVencimentoBase());
    }

    @Override
    public double getModificador() {
        return modificador;
    }

}
