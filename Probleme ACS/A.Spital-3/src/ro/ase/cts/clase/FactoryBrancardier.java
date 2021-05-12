package ro.ase.cts.clase;

public class FactoryBrancardier implements IFactoryPersonal{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
