package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observator> listaObservatori;

    public Observable() {
        this.listaObservatori = new ArrayList<Observator>();
    }

    public void adaugaObservator(Observator observator){
        this.listaObservatori.add(observator);
    }

    public void stergeObservator(Observator observator){
        this.listaObservatori.remove(observator);
    }


    public void notificaObservator(String mesaj){
        for(Observator observator : this.listaObservatori){
            observator.primesteMesaj(mesaj);
        }
    }
}
