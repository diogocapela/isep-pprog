public class Candidato {

    private String nome;
    private int numVotos;

    public Candidato(String nome) {
        this.nome = nome;
        this.numVotos = 0;
    }

    public void incrementarVotos() {
        this.numVotos++;
    }

    public void inicializarNumVotos() {
        this.numVotos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumVotos() {
        return numVotos;
    }

}
