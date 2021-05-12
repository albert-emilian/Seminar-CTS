package ro.ase.cts.clase;

import java.lang.reflect.Executable;

public interface ISectie {
    public void adaugaNod(ISectie subsectie) throws Exception;
    public ISectie getNod(int pozitie) throws Exception;
    public void stergeNod(ISectie subsectie) throws Exception;
}
