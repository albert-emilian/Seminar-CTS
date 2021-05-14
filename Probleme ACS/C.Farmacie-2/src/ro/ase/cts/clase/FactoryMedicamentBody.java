package ro.ase.cts.clase;

public class FactoryMedicamentBody implements IFactory{

    @Override
    public Medicament getMedicament(String denumire, float pret) {
        return new MedicamentBody(denumire, pret);
    }
}
