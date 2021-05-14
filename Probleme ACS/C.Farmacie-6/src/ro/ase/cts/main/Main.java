package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Facade;

public class Main {
    public static void main(String[] args){

        Client client = new Client(true,true,true);
        Client client1 = new Client(false,true,true);

        Facade.verifica(client);
        Facade.verifica(client1);

    }
}
