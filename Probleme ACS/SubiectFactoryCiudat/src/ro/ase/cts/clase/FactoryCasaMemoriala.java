package ro.ase.cts.clase;

public class FactoryCasaMemoriala implements AbstractFactory{
    @Override
    public AObiectivTuristic getObiectiv(Object object, String nume) {
        return new CasaMemoriala(nume,(String) object);
    }
}
