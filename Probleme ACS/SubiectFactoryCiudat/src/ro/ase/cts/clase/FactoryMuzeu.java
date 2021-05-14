package ro.ase.cts.clase;

public class FactoryMuzeu implements  AbstractFactory{
    @Override
    public AObiectivTuristic getObiectiv(Object object, String nume) {
        return new Muzeu("Antipa",(Float)object);
    }
}
