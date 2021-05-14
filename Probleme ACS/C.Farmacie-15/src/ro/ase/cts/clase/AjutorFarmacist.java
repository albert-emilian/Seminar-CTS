package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class AjutorFarmacist {
    private List<Comanda> listaComenzi;

    public AjutorFarmacist() {
        this.listaComenzi = new ArrayList<Comanda>();
    }

    public void preiaComanda(Comanda comanda){
        this.listaComenzi.add(comanda);
    }

    public void executaComanda(){
        this.listaComenzi.get(0).executa();
        this.listaComenzi.remove(0);
    }

}
