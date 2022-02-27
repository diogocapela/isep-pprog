public class VotoEletronico extends Voto implements ValidaVotos {

    public VotoEletronico(Candidato candidato, int data, int dataLim) {
        super(candidato, data, dataLim);
    }

    @Override
    public String toString() {
        if(this.eValido()) {
            return "Voto em eletrónico para " + this.getCandidato().getNome() + " -> válido";
        }
        return "Voto em eletrónico para " + this.getCandidato().getNome() + " -> inválido";
    }

    @Override
    public boolean eValido() {
        return verificaData();
    }

    @Override
    public boolean verificaData() {
        return this.getData() <= this.getDataLim() - 2;
    }

}