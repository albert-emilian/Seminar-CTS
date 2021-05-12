package ro.ase.cts.clase;

public class Subdepartament implements FrunzaSectie {

    public String denumire;

    public Subdepartament(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }


    @Override
    public void adaugaNod(FrunzaSectie subdepartament) throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public FrunzaSectie getNod(int pozitie) throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public void stergeNod(FrunzaSectie subdepartament) throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public void afiseazaSubdepartamente() throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subdepartament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
