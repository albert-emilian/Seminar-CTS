package ro.ase.cts.clase;

public class FactorySupaVita implements IFactorySupa{
    @Override
    public ISupa getSupa() {
        return new SupaVita();
    }
}
