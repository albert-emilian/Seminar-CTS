package ro.ase.cts.clase;

public class FactoryMedic implements IFactoryPersonal{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
