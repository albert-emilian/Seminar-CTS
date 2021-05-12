package ro.ase.cts.clase;

public class FactorySupa{
    public ISupa getSupa(TipSupa supa){
        switch (supa){
            case SupaCiuperci:
                return new SupaCiuperci();

            case SupaLegume:
                return new SupaLegume();

            case SupaVita:
                return new SupaVita();

            default: throw new IllegalArgumentException();
        }
    }
}
