package ro.ase.cts.clase;

public class FactoryMedicamentDurere implements IFactory{
    @Override
    public Medicament getMedicament(String denumire, float pret) {
        return new MedicamentDurere(denumire, pret);
    }



}
