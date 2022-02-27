public class VotoPapel extends Voto {

    private boolean assinado;

    public VotoPapel(Candidato candidato, int data, int dataLim, boolean assinado) {
        super(candidato, data, dataLim);
        this.assinado = assinado;
    }

    @Override
    public String toString() {
        if(this.eValido()) {
            return "Voto em papel para " + this.getCandidato().getNome() + " -> válido";
        }
        return "Voto em papel para " + this.getCandidato().getNome() + " -> inválido";
    }

    @Override
    public boolean eValido() {
        return this.assinado;
    }

}
