package ro.ase.cts.clase;

public interface ISectie {
    public ISectie getSectie(int index) throws Exception;
    public void addSectie(ISectie sectie) throws Exception;
    public void deleteSectie(ISectie sectie) throws Exception;
    public void afiseazaSubsectii() throws Exception;

}
