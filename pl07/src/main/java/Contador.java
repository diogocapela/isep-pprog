public abstract class Contador {

    private String id;
    private int consumo;

    public Contador() {

    }

    public Contador(int consumo) {
        this.id = init();
        this.consumo = consumo;
    }

    public String getId() {
        return id;
    }

    public int getConsumo() {
        return consumo;
    }

    public abstract String init();

    public abstract double calcConsumoMesActual();

    @Override
    public String toString() {
        return String.format("ID: %s%nConsumo: %s", id, consumo);
    }
}