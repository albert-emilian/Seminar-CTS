package ro.ase.cts.clase;

public class ComandaTratatre extends Comanda{
    public ComandaTratatre(Operator operator) {
        super(operator);
    }

    @Override
    public void executa() {
        super.operator.tratare();
    }
}
