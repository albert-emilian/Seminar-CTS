package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital {
    private List<Comanda> listaComenzi;

    public Spital() {
        this.listaComenzi = new ArrayList<Comanda>();
    }

    public void adaugaComanda(Comanda comanda){
        this.listaComenzi.add(comanda);
    }

    public void executaComanda(){
        this.listaComenzi.get(0).executa();
        this.listaComenzi.remove(0);
    }
}
