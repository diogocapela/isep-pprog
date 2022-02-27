public abstract class ContadorElect extends Contador {

    private static int numContadoresElect = 0;

    public ContadorElect(int consumo) {
        super(consumo);
    }

    @Override
    public String init() {
        numContadoresElect++;
        return String.format("ELECT-%d", numContadoresElect);
    }



}