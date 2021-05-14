package ro.ase.cts.clase;

public class Client implements IClient {
    private boolean prezintaReteta;
    private String nume;

    public Client(boolean prezintaReteta, String nume) {
        this.prezintaReteta = prezintaReteta;
        this.nume = nume;
    }

    public boolean isPrezintaReteta() {
        return prezintaReteta;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Clientul " + this.nume + " a cumparat medicamentul.");
    }
}
