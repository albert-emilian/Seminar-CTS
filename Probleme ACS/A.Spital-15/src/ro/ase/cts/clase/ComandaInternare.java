package ro.ase.cts.clase;

public class ComandaInternare extends Comanda{
    public ComandaInternare(Operator operator) {
        super(operator);
    }

    @Override
    public void executa() {
        super.operator.internare();
    }
}
