public abstract class Voto {

    private Candidato candidato;
    private int data;
    private int dataLim;

    public Voto(Candidato candidato, int data, int dataLim) {
        this.candidato = candidato;
        this.data = data;
        this.dataLim = dataLim;
    }

    public boolean eValido() {
        return this.data <= this.dataLim;
    }

    @Override
    public String toString() {
        if(this.eValido()) {
            return this.candidato.getNome() + " -> válido";
        }
        return this.candidato.getNome() + " -> inválido";
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public int getData() {
        return data;
    }

    public int getDataLim() {
        return dataLim;
    }

}