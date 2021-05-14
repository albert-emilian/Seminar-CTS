package ro.ase.cts.clase;

public class MedicamentFactory {

    public Medicament getMedicament(TipMedicament tip, String denumire, float pret){
        switch (tip){
            case Body:
                return new MedicamentBody(pret,denumire);

            case Durere:
                return new MedicamentDurere(pret,denumire);

            case Raceala:
                return new MedicamentRaceala(pret,denumire);

            default: throw new IllegalArgumentException();
        }
    }


}
