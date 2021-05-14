package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectie implements ISectie {
    private List<Subsectie> listaSubsectii;
    private String numeSectie;

    public Sectie(String numeSectie) {
        this.listaSubsectii = new ArrayList<Subsectie>();
        this.numeSectie = numeSectie;
    }


    @Override
    public ISectie getSectie(int index) throws Exception {
        return this.listaSubsectii.get(index);
    }

    @Override
    public void addSectie(ISectie sectie) throws Exception {
        this.listaSubsectii.add((Subsectie) sectie);
    }

    @Override
    public void deleteSectie(ISectie sectie) throws Exception {
        this.listaSubsectii.remove(sectie);
    }

    @Override
    public void afiseazaSubsectii() throws Exception {
        for(Subsectie subsectie : this.listaSubsectii){
            System.out.println(subsectie);
        }
    }
}
