package ro.ase.cts.clase;

public class FactorySupaLegume implements IFactorySupa{
    @Override
    public ISupa getSupa() {
        return new SupaLegume();
    }
}
