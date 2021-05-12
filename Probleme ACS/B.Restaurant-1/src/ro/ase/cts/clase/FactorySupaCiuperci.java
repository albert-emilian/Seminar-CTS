package ro.ase.cts.clase;

public class FactorySupaCiuperci implements IFactorySupa{
    @Override
    public ISupa getSupa() {
        return new SupaCiuperci();
    }
}
