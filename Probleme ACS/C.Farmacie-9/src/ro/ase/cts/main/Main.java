package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ProxyClient;

public class Main {
    public static void main(String[] args){

        Client client = new Client(false, "Mihai");
        client.achizitioneazaMedicament();

        ProxyClient proxyClient = new ProxyClient(client);
        proxyClient.achizitioneazaMedicament();

    }
}
