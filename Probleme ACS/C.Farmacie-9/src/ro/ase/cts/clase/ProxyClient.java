package ro.ase.cts.clase;

public class ProxyClient implements IClient{
    private Client client;

    public ProxyClient(Client client) {
        this.client = client;
    }

    @Override
    public void achizitioneazaMedicament() {
        if(this.client.isPrezintaReteta()){
            client.achizitioneazaMedicament();
        }else{
            System.out.println("Clientul " + this.client.getNume() + " nu are reteta. Achizitionarea nu s-a efectuat.");
        }
    }
}
