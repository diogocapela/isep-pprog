import java.util.ArrayList;
import java.util.List;

public class Escrutinio {

    // variaveis de insância
    private List<Candidato> candidatos;
    private int numEleitores;
    private int numVot;
    private int data;

    // construtor
    public Escrutinio(List<Candidato> candidatos, int numEleitores, int data) {
        this.candidatos = candidatos;
        this.numEleitores = numEleitores;
        this.numVot = 0;
        this.data = data;
    }

    public void calcularVotantes() {
        for(Candidato candidato : candidatos) {
            numVot = numVot + candidato.getNumVotos();
        }
    }

    public void inicializarVotosCandidatos() {
        for(Candidato candidato : candidatos) {
            candidato.inicializarNumVotos();
        }
    }

    public List<Candidato> vencedor() {
        List<Candidato> vencedores = new ArrayList<>();
        int maxVotos = 0; // 50

        for(Candidato candidato : candidatos) {
            int numVotosCandidato = candidato.getNumVotos();
            if(numVotosCandidato >= maxVotos) {
                maxVotos = numVotosCandidato;
            }
        }
        for(Candidato candidato : candidatos) {
            int numVotosCandidato = candidato.getNumVotos();
            if(numVotosCandidato == maxVotos) {
                vencedores.add(candidato);
            }
        }
        return vencedores;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public int getNumEleitores() {
        return numEleitores;
    }

    public int getNumVot() {
        return numVot;
    }

    public int getData() {
        return data;
    }
}






