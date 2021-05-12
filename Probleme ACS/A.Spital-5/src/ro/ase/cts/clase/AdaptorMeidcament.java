package ro.ase.cts.clase;

public class AdaptorMeidcament implements IMedicamentFaraReteta{

    private Medicament medicament;

    public AdaptorMeidcament(Medicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("A fost cumparat medicamentul fara reteta " + medicament.getDenumire());
    }
}
