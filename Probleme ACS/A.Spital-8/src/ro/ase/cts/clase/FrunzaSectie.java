package ro.ase.cts.clase;

public interface FrunzaSectie {

    public void adaugaNod(FrunzaSectie subdepartament) throws Exception;
    public FrunzaSectie getNod(int pozitie) throws Exception;
    public void stergeNod(FrunzaSectie subdepartament) throws Exception;
    public void afiseazaSubdepartamente() throws Exception;
}
