public abstract class Pessoa {

    private String nome;

    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Nome:%n%s", this.nome);
    }

}
