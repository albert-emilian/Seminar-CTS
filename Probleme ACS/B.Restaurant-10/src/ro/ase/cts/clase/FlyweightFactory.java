package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Client> mapClienti;

    public FlyweightFactory() {
        this.mapClienti = new HashMap<String,Client>();
    }

    public Client getClient(String email){
        if(this.mapClienti.containsKey(email)){
            return this.mapClienti.get(email);
        }else{
            Client client = new Client("Marius", email, "1234");
            this.mapClienti.put(email, client);
            return client;
        }
    }
}
