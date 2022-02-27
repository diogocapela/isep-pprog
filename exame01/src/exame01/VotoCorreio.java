public class VotoCorreio extends Voto implements ValidaVotos {

    private boolean assinado;

    public VotoCorreio(Candidato candidato, int data, int dataLim, boolean assinado) {
        super(candidato, data, dataLim);
        this.assinado = assinado;
    }

    @Override
    public String toString() {
        if(this.eValido()) {
            return "Voto correio para " + this.getCandidato().getNome() + " -> válido";
        }
        return "Voto correio para " + this.getCandidato().getNome() + " -> inválido";
    }

    @Override
    public boolean eValido() {
        return this.verificaData() && this.assinado;
    }

    @Override
    public boolean verificaData() {
        return this.getData() <= this.getDataLim();
    }
}
