package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ISectie {
    private String Denumire;
    private List<ISectie> listaSubsectii;

    public Sectiune(String denumire) {
        Denumire = denumire;
        this.listaSubsectii = new ArrayList<ISectie>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectiune{");
        sb.append("Denumire='").append(Denumire).append('\'');
        sb.append(", listaSubsectii=").append(listaSubsectii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugaNod(ISectie subsectie) throws Exception {
        this.listaSubsectii.add(subsectie);
    }

    @Override
    public ISectie getNod(int pozitie) throws Exception {
        return this.listaSubsectii.get(pozitie);
    }

    @Override
    public void stergeNod(ISectie subsectie) throws Exception {
        this.listaSubsectii.remove(subsectie);
    }
}
