package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

public class Main {

    public static void main(String[] args){

        Client client1 = new Client();
        client1.setPlata(new PlataCard());
        client1.realizeazaPlata(32);

        client1.setPlata(new PlataCash());
        client1.realizeazaPlata(44);


    }
}
