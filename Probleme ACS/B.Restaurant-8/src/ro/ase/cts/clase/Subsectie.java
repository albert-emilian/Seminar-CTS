package ro.ase.cts.clase;

public class Subsectie implements ISectie {
    private String denumire;

    public Subsectie(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(ISectie subsectie) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public ISectie getNod(int pozitie) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void stergeNod(ISectie subsectie) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subsectie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
