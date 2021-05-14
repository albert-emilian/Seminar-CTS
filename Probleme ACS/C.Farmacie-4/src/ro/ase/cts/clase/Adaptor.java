package ro.ase.cts.clase;

public class Adaptor implements SoftNou {
    private Farmacie farmacie;

    public Adaptor(Farmacie farmacie) {
        this.farmacie = farmacie;
    }


    @Override
    public boolean verificaStocPentruMedicament(int id, int nrBucati) {
        this.farmacie.setareMedicament(id);
        return this.farmacie.verificareDisponibilitate(nrBucati);
    }
}
