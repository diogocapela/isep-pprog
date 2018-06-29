import java.util.List;

public class SimulaEleicao {

    private List<Voto> votos;

    public SimulaEleicao(List<Voto> votos) {
        this.votos = votos;
    }

    public void contarVotos(Escrutinio escrutinio) {
        for(Voto voto: votos) {
            for(Candidato candidato : escrutinio.getCandidatos()) {
                if(voto.getCandidato().equals(candidato)) {
                    candidato.incrementarVotos();
                }
            }
        }
    }

    
}
