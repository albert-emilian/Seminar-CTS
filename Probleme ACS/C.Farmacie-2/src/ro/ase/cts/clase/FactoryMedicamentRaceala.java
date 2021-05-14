package ro.ase.cts.clase;

public class FactoryMedicamentRaceala implements  IFactory{

    @Override
    public Medicament getMedicament(String denumire, float pret) {
        return new MedicamentRaceala(denumire,pret);
    }


}
