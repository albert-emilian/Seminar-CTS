package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Client> listaClienti;

    public FlyweightFactory() {
        this.listaClienti = new HashMap<Integer, Client>();
    }

    public Client getClient(int numarAsigurare){
        if(this.listaClienti.containsKey(numarAsigurare)){
            return this.listaClienti.get(numarAsigurare);
        }else{
            Client client = new Client("Marius", numarAsigurare);
            this.listaClienti.put(numarAsigurare,client);
            return client;
        }
    }
}
