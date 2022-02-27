public class ContadorElectTarifSimples extends ContadorElect {

    private static double borderlinePotenciaContratada = 6.9;
    private static double tarifaMenor = 0.13;
    private static double tarifaMaior = 0.16;

    private double potenciaContratada;

    public ContadorElectTarifSimples(int consumo, double potenciaContratada) {
        super(consumo);
        this.potenciaContratada = potenciaContratada;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcConsumoMesActual() {
        if(potenciaContratada < borderlinePotenciaContratada) {
            return getConsumo() * tarifaMenor;
        }
        return getConsumo() * tarifaMaior;
    }


}