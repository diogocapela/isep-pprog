public class Aluno extends Pessoa {

    private int numero;

    public Aluno() {

    }

    public Aluno(int numero) {
        this.numero = numero;
    }

    public Aluno(String nome, int numero) {
        super(nome);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nNúmero:%n%s", this.numero);
    }

}
