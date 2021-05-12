package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.IPlata;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

public class Main {
    public static void main(String[] args){

        IPlata plataCash = new PlataCash();
        IPlata plataCard = new PlataCard();

        Client client = new Client("Marius");
        client.plateste();

        client.setTipPlata(plataCard);
        client.plateste();

        client.setTipPlata(plataCash);
        client.plateste();


    }
}
