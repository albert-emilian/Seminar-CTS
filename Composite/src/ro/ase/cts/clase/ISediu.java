package ro.ase.cts.clase;

public interface ISediu {
    public void afiesazaDescriere();
    public void adaugaNod(ISediu sediu) throws Exception;
    public void stergeNod(ISediu sediu)throws Exception;
    public ISediu getNod(int pozitie)throws Exception;

}
