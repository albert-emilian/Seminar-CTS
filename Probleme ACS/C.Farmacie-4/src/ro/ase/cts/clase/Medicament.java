package ro.ase.cts.clase;

public class Medicament {
    private int nrStoc;
    private int idMedicament;
    private String nume;

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public Medicament(int nrStoc, int idMedicament, String nume) {
        this.nrStoc = nrStoc;
        this.idMedicament = idMedicament;
        this.nume = nume;
    }



    public int getNrStoc() {
        return nrStoc;
    }

    public void setNrStoc(int nrStoc) {
        this.nrStoc = nrStoc;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Medicament(int nrStoc, String nume) {
        this.nrStoc = nrStoc;
        this.nume = nume;
    }
}
