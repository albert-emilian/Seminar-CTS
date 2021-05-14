package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ManagerSala;

public class Main {
    public static void main(String[] args){

        Client client = new Client("Marius");
        Client client1 = new Client("Mihai");
        Client client2 = new Client("Andrei");
        Client client3 = new Client("Flavius");

        ManagerSala manager = new ManagerSala();
        manager.adaugaObservator(client);
        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);



        manager.anuntaMeci("Fotbal");

        manager.stergeObservator(client1);

        manager.anuntaMeci("Handbal");




    }
}
