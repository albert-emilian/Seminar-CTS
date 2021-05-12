package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<Comanda>();
    }

    public void adaugaComanda(Comanda comanda){
        this.listaComenzi.add(comanda);
    }

    public void realizeazaComanda(){
        listaComenzi.get(0).executa();
        listaComenzi.remove(0);
    }
}
