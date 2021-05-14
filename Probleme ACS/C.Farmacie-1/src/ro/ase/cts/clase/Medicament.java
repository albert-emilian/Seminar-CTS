package ro.ase.cts.clase;

public abstract class Medicament {
    protected  float pret;
    protected String denumire;

    public Medicament(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("pret=").append(pret);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
