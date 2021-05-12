package ro.ase.cts.clase;

public abstract class Comanda {
    protected Operator operator;
    public abstract void executa();

    public Comanda(Operator operator) {
        this.operator = operator;
    }


}
