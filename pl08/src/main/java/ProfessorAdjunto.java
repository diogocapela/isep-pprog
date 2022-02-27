public class ProfessorAdjunto extends Professor {

    static private double modificador = 1.2;

    public ProfessorAdjunto() {
        super();
    }

    public ProfessorAdjunto(String nome) {
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
