public class Main {

    public static void main(String[] args) {

        Pessoa[] listaPessoas = new Pessoa[10];

        listaPessoas[0] = new ProfessorAdjunto("Manel");
        listaPessoas[1] = new ProfessorAssistente("Teófilo");
        listaPessoas[2] = new ProfessorCoordenador("António");
        listaPessoas[3] = new AlunoBolsa(1, 100);

        for(int i = 0; i < listaPessoas.length; i++) {
            if(listaPessoas[i] instanceof Pagavel) {

            }
            double resultado = ((Pagavel) listaPessoas[i]).determinarCusto();
        }



    }

}
