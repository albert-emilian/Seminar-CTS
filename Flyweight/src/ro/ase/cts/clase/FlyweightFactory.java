package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IFlyweight> mapClienti;

    public FlyweightFactory() {
        this.mapClienti = new HashMap<>();
    }


    public IFlyweight getFlyweight(String nrTelefon){
        if(mapClienti.containsKey(nrTelefon))
            return mapClienti.get(nrTelefon);
        Client client = new Client("Marius", nrTelefon, "a@gmail.com");
        mapClienti.put(nrTelefon, client);
        return  client;
    }
}
