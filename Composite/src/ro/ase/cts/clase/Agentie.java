package ro.ase.cts.clase;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements ISediu {
    private List<ISediu> listaSedii;

    public Agentie() {
        this.listaSedii = new ArrayList<>();
    }

    @Override
    public void afiesazaDescriere() {
        System.out.println("Este o agentie:");
        for(ISediu sediu : listaSedii){
            sediu.afiesazaDescriere();
        }
    }

    @Override
    public void adaugaNod(ISediu sediu) {
        listaSedii.add(sediu);
    }

    @Override
    public void stergeNod(ISediu sediu) {
        listaSedii.remove(sediu);
    }

    @Override
    public ISediu getNod(int pozitie ) {
        return listaSedii.get(pozitie);
    }
}
