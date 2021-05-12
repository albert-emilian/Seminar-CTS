package ro.ase.cts.main;

import ro.ase.cts.clase.Client;

public class Main {
    public static void main(String[] args){

        Client client = new Client("Marius","25");
        Client client1 = (Client) client.clone();

        System.out.println(client);
        System.out.println(client1);
    }
}
