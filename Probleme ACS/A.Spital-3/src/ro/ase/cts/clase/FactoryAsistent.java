package ro.ase.cts.clase;

public class FactoryAsistent implements IFactoryPersonal{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
