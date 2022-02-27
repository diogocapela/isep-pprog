public class Main {

    public static void main(String[] args) {

        Contador[] listaContadores = new Contador[10];

        listaContadores[0] = new ContadorGas(50);
        listaContadores[1] = new ContadorGas(5320);
        listaContadores[2] = new ContadorElectTarifSimples(4736484, 40);

        listaContadores[3] = new ContadorElectTarifSimples(1, 20);
        listaContadores[4] = new ContadorGas(22);
        listaContadores[5] = new ContadorElectTarifSimples(2, 50);

        for (int i = 0; i < 6; i++) {
            if(listaContadores[i] instanceof ContadorGas) {
                System.out.println(listaContadores[i].calcConsumoMesActual());
            } else {
                System.out.println("é elect");
            }


        }


    }

}