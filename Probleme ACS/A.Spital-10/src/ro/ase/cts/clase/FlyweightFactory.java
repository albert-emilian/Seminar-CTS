package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,IFlyweight> listaPacienti;

    public FlyweightFactory() {
       this.listaPacienti = new HashMap<String,IFlyweight>();
    }

    public IFlyweight getPacient(String numarTelefon){
        if(this.listaPacienti.get(numarTelefon) != null)
            return this.listaPacienti.get(numarTelefon);
        Pacient pacient = new Pacient("Mihai", numarTelefon, "adresa");
        this.listaPacienti.put(numarTelefon,pacient);
        return pacient;
    }
}
