package ro.ase.cts.clase;

public class Subsectie implements ISectie{
    private String numeSectie;

    public Subsectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    public String getNumeSectie() {
        return numeSectie;
    }

    @Override
    public ISectie getSectie(int index) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void addSectie(ISectie sectie) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void deleteSectie(ISectie sectie) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void afiseazaSubsectii() throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subsectie{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
