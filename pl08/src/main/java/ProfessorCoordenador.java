public class ProfessorCoordenador extends Professor {

    static private double modificador = 1.5;

    public ProfessorCoordenador() {
        super();
    }

    public ProfessorCoordenador(String nome) {
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
