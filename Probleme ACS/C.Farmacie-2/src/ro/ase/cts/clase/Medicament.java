package ro.ase.cts.clase;

public abstract class Medicament {
    private String denumire;
    private float pret;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }
}
