package ro.ase.cts.clase;

public class Medicament {
    private String numeMedicament;
    private int nrMedicamente;

    public Medicament(String numeMedicament, int nrMedicamente) {
        this.numeMedicament = numeMedicament;
        this.nrMedicamente = nrMedicamente;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    public void transportaMedicamentLaDepozit(){
        System.out.println("Medicamentul " + this.numeMedicament + " numar de medicamente " + this.nrMedicamente + " a fost transportat in depozit");
    }

}
