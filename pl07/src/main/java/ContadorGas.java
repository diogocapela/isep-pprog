public class ContadorGas extends Contador {

    private static int numContadoresGas = 0;
    private static double custoUnitario = 0.8;

    public ContadorGas(int consumo) {
        super(consumo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String init() {
        numContadoresGas++;
        return String.format("GAS-%d", numContadoresGas);
    }

    @Override
    public double calcConsumoMesActual() {
        return getConsumo() * custoUnitario;
    }

}